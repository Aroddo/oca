package wbs.pattern.proxy;

import java.time.LocalTime;

public class ProxyDemo {

	public static void main(String[] args) {
		IService service = ProxyFactory.getService();
		service.m();
		 
//
//		LocalTime from = LocalTime.of(8, 0);
//		LocalTime to = LocalTime.of(22, 0);
////		
////		
////		IService service = new ServiceImpl();
////		IService proxy = new ServiceProxy(service, from, to);
////		
////		
////		proxy.m();
//		
//		
//		IService service = new ServiceImpl();
//		IService proxy = new ServiceProxy(service, from, to);
//		
//		proxy.m();
	}
}
