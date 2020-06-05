package wbs.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class SimpleWildcardNumberDemo {

	// wir illustrieren die wildcards ?, ? super , ? extends
	// am beilspiel von methoden von Collection
	
	public static void main(String[] args) {

		Collection<Number> mainNumberCollection = new ArrayList<>();
		Collection<Integer>   integerCollection = new ArrayList<>();
		Collection<Number>     numberCollection = new ArrayList<>();
		Collection<Object>     objectCollection = new ArrayList<>();
		mainNumberCollection.add(99);
		mainNumberCollection.add(11);
		mainNumberCollection.add(77);
		mainNumberCollection.add(33);
		mainNumberCollection.add(66);
		mainNumberCollection.add(44);
		mainNumberCollection.add(111);
		mainNumberCollection.add(555);
		mainNumberCollection.add(999);
		integerCollection.add(33);
		integerCollection.add(44);
		numberCollection.add(66);
		numberCollection.add(77);
		objectCollection.add(99);
		objectCollection.add(11);
		
		System.out.println("mainNumberCollection\t" + mainNumberCollection);
		System.out.println("integerCollection    \t" + integerCollection);
		System.out.println("numberCollection \t" + numberCollection);
		System.out.println("objectCollection \t" + objectCollection);
		
		System.out.println("\nremove integerCollection");
		mainNumberCollection.removeAll(integerCollection);
		System.out.println(mainNumberCollection);
		
		System.out.println("\nremove numberCollection");
		mainNumberCollection.removeAll(numberCollection);
		System.out.println(mainNumberCollection);
		
		System.out.println("\nremove objectCollection");
		mainNumberCollection.removeAll(objectCollection);
		System.out.println(mainNumberCollection);
		
		// addAll
		
		mainNumberCollection.addAll(integerCollection);
		mainNumberCollection.addAll(numberCollection);
//		mainIntegerCollection.addAll(objectCollection);		// compile error
		
		System.out.println("\naddAll integerCollection + numberCollection");
		System.out.println(mainNumberCollection);
		
		
		// removeIf
		Predicate<Number> numberPredicate = n -> n.intValue() == 111;
		Predicate<Integer> integerPredicate = i -> i.intValue() == 555;
		Predicate<Object> objectPredicate = o -> o.toString().equals("999");
		
		mainNumberCollection.removeIf(numberPredicate);
		System.out.println("\nremoveIf(numberPredicate)\t" + mainNumberCollection);
		
		mainNumberCollection.removeIf(objectPredicate);
		System.out.println("removeIf(objectPredicate)\t" + mainNumberCollection);		
		
//		mainNumberCollection.removeIf(integerPredicate);	// compile error
	}
}
