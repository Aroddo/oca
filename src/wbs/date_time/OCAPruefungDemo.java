package wbs.date_time;

// ---------------------------

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OCAPruefungDemo {

        //  wir erzeugen einige instanzen von OCAPruefung und legen sie in einer List
        //  ab. dann sortieren wir die list. 1. sortierkriterium ist das
        //  prüfungsdatum (aufsteigend) 2. sortierkriterium ist der name.
        //  (aufsteigend)
         
        public static void main(String[] args) {

                OCAPruefung p1 = new OCAPruefung("michelle", LocalDate.of(2020, 6, 16), 90);
                OCAPruefung p6 = new OCAPruefung("christa", LocalDate.of(2019, 12, 11), 84);
                OCAPruefung p2 = new OCAPruefung("anton", LocalDate.of(2019, 12, 11), 70);
                OCAPruefung p3 = new OCAPruefung("beatrice", LocalDate.of(2019, 12, 11), 96);
                OCAPruefung p4 = new OCAPruefung("dorothea", LocalDate.of(2019, 12, 19), 72);
                OCAPruefung p5 = new OCAPruefung("gerd", LocalDate.of(2019, 12, 20), 90);
                
                List<OCAPruefung> pruefungen = Arrays.asList(p1, p2, p3, p4, p5, p6);
                
                Comparator<OCAPruefung> cmp = (ocp1, ocp2) -> {
                	int diff = ocp1.getPruefungsDatum().compareTo(ocp2.getPruefungsDatum());
                    return diff != 0 ? diff : ocp1.getName().compareTo(ocp2.getName());
                };
                
                System.out.println(" --- sortierung gemaess natural ordering (pruefungsDatum, name) ---");
                Collections.sort(pruefungen, cmp);
                pruefungen.forEach(p -> System.out.println(p));
        }
}
//----------------------------------
// wir ordnen alle abgordneten des bundestages in gruppen.
// alle abgeordneten einer gruppe gehören zur selben partei.

// wir ordnen alle wahlberechtigten eines bundeslandes in gruppen.
// alle wahlberechtigten einer gruppe gehören zum selben wahlkreis.

// wir ordnen alle zahlen zwischen 100 und 200 in gruppen.
// alle zahlen in derselben gruppe haben dieselbe quersumme.

// methodenname: groupingBy()

// wir testen in GroupingByDemo
