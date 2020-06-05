package wbs.selbstlerntag3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11 {
	public static void main(String[] args) {
		List<int[]> list = new ArrayList<>();
		list.add(new int[] { 1 });
		list.add(new int[] { 1, 2 });
		list.add(new int[] { 1, 2, 3 });
		list.removeIf(a -> a.length == 3);
		list.forEach((ia) -> System.out.println(Arrays.toString(ia)));
	}
}