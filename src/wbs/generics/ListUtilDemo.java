package wbs.generics;

import java.util.ArrayList;
import java.util.List;

class ListUtil {
	public static <T> void copy(List<? extends T> from, List<? super T> to) {
		to.clear();
		for (T t : from) {
			to.add(t);
		}
	}
}

public class ListUtilDemo {
	public static void main(String[] args) {
		
		List<Number> numberList = new ArrayList();
		List<Integer> integerList = new ArrayList();
		List<Object> objectList = new ArrayList();
		
		numberList.add(11);
		
		ListUtil.copy(numberList, objectList);
//		ListUtil.copy(numberList, integerList);	// compiler error
		
		System.out.println(objectList);
	}
}