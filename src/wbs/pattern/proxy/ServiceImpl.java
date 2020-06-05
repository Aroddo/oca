package wbs.pattern.proxy;

public class ServiceImpl implements IService {
	String serviceString;
	public ServiceImpl () {
		serviceString="I am the real service!";
	}
	@Override
	public void m() {
		System.out.println("in m() von " + getClass().getSimpleName());
	}
}
