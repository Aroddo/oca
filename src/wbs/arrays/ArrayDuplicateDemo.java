package wbs.arrays;

import java.util.Arrays;

public class ArrayDuplicateDemo {
	public static void main(String[] args) {
		Integer[] sourceArray = { 3, 5, 2, 6, 8, 9, 5, 2, 1, 3, 2, 500, 500 };
		Integer[] resultArray = {};

		System.out.println(Arrays.deepToString(sourceArray));
		
		// public static <T> T[] removeDuplicates(T[] sourceArray, T[] resultArray) {
		
		resultArray = ArrayUtil.removeDuplicates(sourceArray,resultArray);
		
		System.out.println(Arrays.deepToString(resultArray));
		
		
	}
}
