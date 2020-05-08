package wbs.operatoren;

import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class InstanceofDemo {
	public static void main(String[] args) {
		Vector<?> v = new Vector<>();
		AbstractList<?> al = new LinkedList<>();
		System.out.println(v instanceof AbstractList); // true		
		System.out.println(v instanceof List); // true
		System.out.println(v instanceof Collection); // true
		System.out.println(v instanceof Object); // true
// System.out.println(v instanceof String); // Compilerfehler
		System.out.println(al instanceof LinkedList); // true		:		al ist objekt-typ LinkedList
		al = v;
		System.out.println(al instanceof LinkedList); // false		:		al ist jetzt objekt-typ vector. vector ist nicht in vererbungshierarchie von LinkedListList
		System.out.println();
	}
}