package wbs.testing;

import java.io.IOException;

public class ExceptionTest {
 
	
	public static void main(String[] args) {
		int i = 1111111111;
		i = i * i ;
		try {
		 System.out.println(Class.forName("java.lang.String"));
		}catch (Exception e) {e.printStackTrace();}
System.out.println(i);		
	}
}

class A{
	protected void m() {System.out.println("a");}
}

class B extends A{
	public void m() {System.out.println("b");}
	
	public int x() throws Exception{
		throw new Exception("");
	}

}
