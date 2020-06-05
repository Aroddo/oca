package wbs.util;

import java.util.Arrays;
import java.util.List;

public class StringUtilDemo {
	static int tab = 0;

	public static void main(String[] args) {
		List<String> testStrings = Arrays.asList("", "sdf", "otto", "ottto", "otto totto totto",
				"Erika feuert nur untreue Fakire");
		testStrings.forEach(s -> tab = s.length() > tab ? s.length() : tab);	// größte String-Länge

		testStrings.forEach(s -> {
			System.out.printf("|%" + tab + "s|  isPalindrome1  =>  %s\n", s, wbs.util.StringUtil.isPalindrome(s));
		});
		System.out.println();
		testStrings.forEach(s -> {
			System.out.printf("|%" + tab + "s|  isPalindrome2  =>  %s\n", s, wbs.util.StringUtil.isPalindrome2(s));
		});
		System.out.println();

		testStrings.forEach(s -> {
			System.out.printf("|%" + tab + "s|  isPalindrome3  =>  %s\n", s, wbs.util.StringUtil.isPalindrome3(s));
		});
		System.out.println();

		testStrings.forEach(s -> {
			System.out.printf("|%" + tab + "s|  isPalindrome4  =>  %s\n", s, wbs.util.StringUtil.isPalindrome4(s));
		});
		System.out.println();

		System.out.println(tab);
	}
}
