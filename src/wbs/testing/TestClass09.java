package wbs.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


class Data {
	int value;

	public Data(int x) {
		this.value = x;
	}

	public String toString() {
		return "" + value;
	}
}

public class TestClass09 {
public static void filterData(ArrayList<Data> dataList, java.util.function.Predicate<Data> p) {
	Iterator<Data> i = dataList.iterator();
	while (i.hasNext()) {
		if(p.test(i.next())) {
			i.remove();
		}
	}
}
	public static void main(String[] args) {

		ArrayList<Data> a1 = new ArrayList<Data>();
		Data d = new Data(1); a1.add(d);
		d = new Data(2); a1.add(d);
		d = new Data(0); a1.add(d);
		
		filterData(a1, x -> x.value==0);
		
		System.out.println(a1);
	}

}
