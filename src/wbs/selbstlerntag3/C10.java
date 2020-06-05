package wbs.selbstlerntag3;

import java.util.Arrays;
import java.util.List;

public class C10 {
	public static void main(String[] args) {
		List<int[]> list = Arrays.asList(new int[] { 1 }, new int[] { 1, 2 }, new int[] { 1, 2, 3 });
		list.removeIf(a -> a.length == 3);
		
		list.forEach((ia) -> System.out.println(Arrays.toString(ia)));
	}
}