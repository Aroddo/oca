package wbs.operatoren;

import java.util.Stack;
import java.util.Vector;
import java.util.*;

public class NewDemo {
	public static void main(String[] args) {
// AbstractList al = new AbstractList(); // compilerfehler			=>	AbstractList ist abstrakt
// Collection c = new Collection(); // compilerfehler				=>	Collection ist ein Interface
// Math math = new Math(); // compilerfehler						=>	Math hat private konstruktor
// Integer n = new Integer(); // compilerfehler						=>	Integer hat keinen leeren Konstruktor
// Stack stack = new Vector(); // compilerfehler					=>	Stack ist Unterklasse von Vector.
		Integer n = new Integer(3); // ok
		Vector<Integer> vector = new Stack<Integer>(); // ok
		vector.add(n);
	}
}
