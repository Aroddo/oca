package wbs.uml.kundenverwaltung;

import java.util.List;

public class Konto {
	List<Kunde> zeichnungsBerechtigte;

	public GeldBetrag saldo() {
		return new GeldBetrag();
	}

	public void einzahlen(GeldBetrag betrag) {

	}
}

class GeldBetrag {
}
