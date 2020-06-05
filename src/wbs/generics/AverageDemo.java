package wbs.generics;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class BausteinPruefung {
	public double note;

	public BausteinPruefung(double note) {
		super();
		this.note = note;
	}
}

class Einwohner {
	public int alter;

	public Einwohner(int alter) {
		super();
		this.alter = alter;
	}
	
}

class PKW {
	public int leistung;

	public PKW(int leistung) {
		super();
		this.leistung = leistung;
	}
	
}

public class AverageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<BausteinPruefung> bausteinPruefungen = new HashSet<>();
		Set<Einwohner> einwohner = new HashSet<>();
		Set<PKW> pkws = new HashSet<>();
		Random random = new Random();
		
		for (int i = 1; i < 100; i++) {
			bausteinPruefungen.add(new BausteinPruefung(0 + random.nextInt(100)) );
			einwohner.add(new Einwohner(0 + random.nextInt(120)) );
			pkws.add(new PKW(1000 + random.nextInt(50000)) );
		}
		
		System.out.println(SetUtil.average(bausteinPruefungen, f -> f.note));
		System.out.println(SetUtil.average(einwohner, f -> f.alter));
		System.out.println(SetUtil.average(pkws, f -> f.leistung));
		
		
		
		
		
	}

}
//wir berechnen den durchschnitt aller noten einer bausteinprüfung
//wir ermitteln das durchschnittsalter alle einwohner esslingens.
//wir ermitteln die durchschnittliche leistung aller 2010 neu zugelassenen pkws