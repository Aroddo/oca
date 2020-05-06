package wbs.collections;

import java.util.Arrays;
import java.util.List;

public class ForeachMethodReferenceDemo {

	public static void main(String[] args) {
		List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
		List<String> listeString = Arrays.asList("Eins", "Zwei" , "Drei" , "Vier", "Fünf");
		
		System.out.println("\n\nliste.forEach(StaticMethodProvider::printSpace)");
		liste.forEach(StaticMethodProvider::printSpace);
		
		System.out.println("\n\nliste.forEach(StaticMethodProvider::printTab)");
		liste.forEach(StaticMethodProvider::printTab);

		System.out.println("\n\nlisteString.forEach(StaticMethodProvider::printSpace)");
		listeString.forEach(StaticMethodProvider::printSpace);
		
		System.out.println("\n\nlisteString.forEach(StaticMethodProvider::printTab)");
		listeString.forEach(StaticMethodProvider::printTab);
		
		liste.forEach( n -> System.out.print(n + "  "));
		
	}
}

class StaticMethodProvider {
	public static void printSpace (Integer i) {
		System.out.print(i + " ");
	}
	public static void printTab (Integer i) {
		System.out.print(i + "\t");
	}	
	public static void printSpace (String i) {
		System.out.print(i + " ");
	}
	public static void printTab (String i) {
		System.out.print(i + "\t");
	}	
}
