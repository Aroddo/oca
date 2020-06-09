package wbs.arrays;

import java.util.Arrays;
import java.util.HashSet;


// Mein erster selbstgeschriebener generischer Dingens
public class ArrayUtil {
	public static <T> T[] removeDuplicates(T[] sourceArray, T[] resultArray) {
		resultArray = new HashSet<T>(Arrays.asList(sourceArray)).toArray(resultArray);
		return new HashSet<T>(Arrays.asList(sourceArray)).toArray(resultArray);
	}
}
