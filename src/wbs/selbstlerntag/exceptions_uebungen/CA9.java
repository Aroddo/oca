package wbs.selbstlerntag.exceptions_uebungen;

/*
	Does compile succesfully? -> Y/N
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
				N:
					lalla
					"l" in mantel is ignored, there is no case
*/

public class CA9 {
	
	public static void main(String[] args) {
		String s = "mantel";
		int len = s.length();
		int i = 0;
		StringBuilder sb = new StringBuilder();
		
		while (i < len) {
			switch (s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				sb.append('a');
				break;
			case 'm':
			case 'n':
			case 't':
				sb.append('l');
			}
			i++;
		}
		System.out.println(sb);
	}
}
