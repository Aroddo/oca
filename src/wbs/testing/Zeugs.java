package wbs.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zeugs {
	public static void main(String[] args) {
		List<Integer> intList =  new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i = 0; i <=5;i++) {
			intList.add(random.nextInt(10));
		}
		
		
		System.out.println(intList);
		
		intList.forEach(i -> System.out.print( " " + i  ));
		
		System.out.println();
		
		intList.removeIf( i -> i > 5);
		
		System.out.println(intList);
		
	 
		
		
	}
}
