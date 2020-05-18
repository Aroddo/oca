package wbs.operatoren;

import java.util.Vector;

public class AutoboxingDemo {
	public static void main(String[] args) {
		Integer i11 = new Integer(100);
		Integer i12 = new Integer(100);
		Integer i21 = 100;
		Integer i22 = 100;
		Integer i31 = Integer.valueOf(100);
		Integer i32 = Integer.valueOf(100);
		Integer i41 = 200;
		Integer i42 = 200;
		Integer i51 = Integer.valueOf(200);
		Integer i52 = Integer.valueOf(200);
		System.out.println(i11 == i12); // false !
		System.out.println(i21 == i22); // true !
		System.out.println(i31 == i32); // true !
		System.out.println(i41 == i42); // false !
		System.out.println(i51 == i52); // false !
		Vector<Integer> v = new Vector<Integer>();
// autoboxing
		v.add(100);
// autounboxing
		int n = v.get(0);
		System.out.println(n);
		
		System.out.println(i51 == 200); // true
		System.out.println(i52 == 200); // true
		System.out.println(i51 == i52); // false !		
		/*
		 * a == 200 => true
		 * b == 200 => true
		 * a == b   => false
		 * Daraus folgt: Der == Operator ist intransitiv.
		 */
		
		
		System.out.println("Armin");
        System.out.println(i51 == 200);
        System.out.println(200 == i51);
        System.out.println(i52 == 200);
        System.out.println(200 == i52);
        
        int i = 200;
        System.out.println("YO");
		System.out.println(i51 == i52); // false !		
		System.out.println(i51 == i); // true
		System.out.println(i52 == i); // true
        
        
        
        
	}
}