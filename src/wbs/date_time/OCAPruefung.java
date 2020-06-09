package wbs.date_time;

import java.time.LocalDate;

//  wir ändern nun die klasse OCAPruefung.
//  sie bekommt ein natural ordering.
//  1. sortierkriterium: punktzahl
//  2. sortierkriterium: name

public class OCAPruefung implements Comparable<OCAPruefung> {

	private String name;
	private LocalDate pruefungsDatum;
	private int punktzahl;

	public OCAPruefung(String name, LocalDate pruefungsDatum, int punktzahl) {
		this.name = name;
		this.pruefungsDatum = pruefungsDatum;
		this.punktzahl = punktzahl;
	}

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public LocalDate getPruefungsDatum() { return pruefungsDatum; }

	public void setPruefungsDatum(LocalDate pruefungsDatum) { this.pruefungsDatum = pruefungsDatum; }

	public int getPunktzahl() { return punktzahl; }

	public void setPunktzahl(int punktzahl) { this.punktzahl = punktzahl; }

	@Override
	public String toString() {
		return "OCAPruefung [name=" + name + ", pruefungsDatum=" + pruefungsDatum + ", punktzahl=" + punktzahl + "]";
	}

	@Override
	public int compareTo(OCAPruefung o) {
		int comparevalue = Integer.compare(this.punktzahl,o.punktzahl);
		if (comparevalue == 0)
			comparevalue = this.name.compareTo(o.name);
		return comparevalue;
	}
}
