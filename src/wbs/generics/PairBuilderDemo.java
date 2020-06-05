package wbs.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiPredicate;

class Stellenangebot {
	public int gebotenesGehalt;

	public Stellenangebot(int i) {
		gebotenesGehalt = i;
	}

	@Override
	public String toString() {

		return "Gebotenes Gehalt: " + gebotenesGehalt + "€";
	}
}

class StellenSuchender {
	public int wunschGehalt;

	public StellenSuchender(int i) {
		wunschGehalt = i;
	}

	@Override
	public String toString() {

		return "Wunschgehalt: " + wunschGehalt + "€";
	}
}

// wir erzeugen einige stellenangebote und stellensuchende
// dann ermitten wir, welche angebote zu welchen suchenden passen.
// wir nehmen an, das 2 zueinander passen, wenn die differenz zwischen
// gebotenes gehlat und wunschgehalt < 5000

public class PairBuilderDemo {
	public static void main(String args[]) {
		HashSet<Stellenangebot> stellenangebote = new HashSet<>();
		HashSet<StellenSuchender> stellenSuchende = new HashSet<>();
		Set<Pair<Stellenangebot, StellenSuchender>> paare;

		stellenangebote.add(new Stellenangebot(30000));
		stellenangebote.add(new Stellenangebot(40000));
		stellenangebote.add(new Stellenangebot(50000));
		stellenangebote.add(new Stellenangebot(20000));
		stellenangebote.add(new Stellenangebot(60000));
		stellenangebote.add(new Stellenangebot(70000));

		stellenSuchende.add(new StellenSuchender(25000));
		stellenSuchende.add(new StellenSuchender(35000));
		stellenSuchende.add(new StellenSuchender(45000));
		stellenSuchende.add(new StellenSuchender(55000));
		stellenSuchende.add(new StellenSuchender(65000));
		stellenSuchende.add(new StellenSuchender(44000));

		// testing

		BiPredicate<Stellenangebot, StellenSuchender> gehaltBiPredicate = (angebot,
				suchender) -> Math.abs(angebot.gebotenesGehalt - suchender.wunschGehalt) <= 5000;
		paare = SetUtil.pairBuilder(stellenangebote, stellenSuchende, gehaltBiPredicate);

		paare = SetUtil.pairBuilder(stellenangebote, stellenSuchende,
				(angebot, suchender) -> Math.abs(angebot.gebotenesGehalt - suchender.wunschGehalt) <= 5000);
		System.out.println(paare);
		
		System.out.println(SetUtil.average(stellenangebote, f -> f.gebotenesGehalt));
		System.out.println(SetUtil.average(stellenSuchende, f -> f.wunschGehalt));
 	}
}
