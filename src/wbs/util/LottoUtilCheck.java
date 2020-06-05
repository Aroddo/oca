package wbs.util;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
public class LottoUtilCheck {
	public static void main(String[] args) {
		List<Long> longList = new ArrayList<>();
		longList.add(0b000_000_001L);	// nur 
		longList.add(0b000_011_111L);
		longList.add(0b000_111_111L);
		longList.add(0b001_111_110L);	
		longList.add(0b011_111_101L);	
		longList.add(0b01111110000000000000000000000000000000000000000000L);

		longList.forEach(b -> {
			System.out.printf("%s \t| %s \t| %d\n",  wbs.util.LottoUtil.isValidTipp(b) ,Long.toBinaryString(b), b);
		});
	
		System.out.println(0b1111110);
	}
	public void checkBinaryStuff() {
		Long tipp5 = wbs.util.LottoUtil.createTipp5();
		String bitString;
		String padding;

		System.out.println("          \t|5         4         3         2         1         |");
		for (int i = 1; i < 100; i++) {
			tipp5 = wbs.util.LottoUtil.createTipp5();
			bitString = Long.toBinaryString(tipp5);
			try {
				System.out.print("Lösung 1: \t");
				padding = "|" + String.format("%" + (50 - bitString.length()) + "s", "").replace(" ", "0");
				System.out.println(padding + bitString + "|\t" + tipp5);
			} catch (FormatFlagsConversionMismatchException e) {
				System.out.println("FormatFlagsConversionMismatchException: " + e.getMessage());
				System.out.print("Lösung 2: \t");
				padding = "|" + String.join("", Collections.nCopies(50 - bitString.length(), "0"));
				System.out.println(padding + bitString + "|\t" + tipp5);
			}
		}
		
		System.out.println(          "          \t|5         4         3         2         1         |");
//		System.out.println(Long.parseLong("11111100000000000000000000000000000000000000000000"));
		System.out.println(Long.parseUnsignedLong("01111110000000000000000000000000000000000000000000",2));
		
		/*
		 * System.out.print("Lösung 2: \t"); padding = "|" + String.join("",
		 * Collections.nCopies(50 - bitString.length(), "0"));
		 * System.out.println(padding + bitString + "|\t" + tipp5);
		 * 
		 * System.out.print("Lösung 3: \t"); padding = "|" + CharBuffer.allocate(50 -
		 * bitString.length()).toString().replace("\0", "0"); System.out.println(padding
		 * + bitString + "|\t" + tipp5);
		 * 
		 * System.out.print("Lösung 4: \t"); padding = "|" + new String(new char[50 -
		 * bitString.length()]).replace('\0', '0'); System.out.println(padding +
		 * bitString + "|\t" + tipp5);
		 */
//		System.out.println( "#".repeat(10) );
//		System.out.println( String.join("", Collections.nCopies(10, "#")) );         // Lösung 1
//		System.out.println( String.format("%10s", "").replace(" ", "#") );           // Lösung 2
//		System.out.println( CharBuffer.allocate(10).toString().replace("\0", "#") ); // Lösung 3
//		System.out.println( new String(new char[10]).replace('\0', '#') );           // Lösung 4

	}
}
