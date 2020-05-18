package wbs.vererbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;


public class Figur2DDemo {

    // wir bestücken eine list mit insgesamt 10
    // figur2d- objekten, abwechselnd jeweils
    // ein kreis und dann ein rechteck.
    // radius und seitenlängen sollen zufallszahlen sein
    // zwischen 0 und 1.
    // dann geben wir die list elementweise aus.

	public static void main(String[] args) {
		List<Figur2D> figuren = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			figuren.add(i % 2 == 0 ? new Kreis(Math.random()) : new Rechteck(Math.random(), Math.random()));
		}
		Collections.sort(figuren);
		
		System.out.println("Sortierte Liste");
        figuren.forEach(f -> System.out.println(f));
        System.out.println("Kleinstes : " + Collections.min(figuren));
        try {Collections.min(figuren).wait(5000);} catch(Exception e) {}
        System.out.println("Größtes   : " + Collections.max(figuren));
        
	}

}
 