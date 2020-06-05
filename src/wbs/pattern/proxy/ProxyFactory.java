package wbs.pattern.proxy;

import java.time.LocalTime;

public class ProxyFactory {
	public static IService getService () {
		LocalTime from = LocalTime.of(8, 0);
		LocalTime to = LocalTime.of(22, 0);
		
		IService service = new ServiceImpl();
		
		IService proxy = new ServiceProxy(service, from, to);
		
		return proxy;
	}
}
