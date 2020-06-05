package wbs.pattern.proxy;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ServiceProxy implements IService {
	String serviceString;
	private IService service;

	private LocalTime from = LocalTime.of(8, 0);
	private LocalTime to = LocalTime.of(16, 0);
	private final String msg = "local time is %s. access is only allowed between %s and %s";
	private final DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

	public ServiceProxy(IService service, LocalTime from, LocalTime to) {
		this.serviceString = "I am the just the proxy!";
		this.from = from;
		this.to = to;
		this.service = service;
	}

	@Override
	public void m() {
		LocalTime now = LocalTime.now();
		if (now.isBefore(from) || now.isAfter(to)) {
			throw new IllegalAccessTimeException(String.format(msg, formatter.format(now), from, to));
		}
		System.out.println("in m() von " + getClass().getSimpleName());
		System.out.println("proxy: checking access time before calling service.m()...");
		
		service.m();
		
		System.out.println("proxy: after calling service.m()");
	}
}
