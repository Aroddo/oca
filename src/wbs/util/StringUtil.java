package wbs.util;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.BitSet;

public class StringUtil {
        
        public static int countDifferentCharacters(String s) {
        	HashSet<Character> charlist = new HashSet<>();

        	for (int i = 0; i< s.length() ; i++) {
        		charlist.add(s.charAt(i));
        	}
            return charlist.size();
        }
        
        public static int countDifferentCharacters2 (String s) {
            return (int) s.chars().distinct().count();
        }
}
