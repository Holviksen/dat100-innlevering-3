package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		for(int i = 0; i < likes; i++){
			doLike();
		}
	}
	
	public String getTekst() {
		return this.tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "TEKST\n" + getId() + "\n" + getBruker() + "\n" + getDato() +
		"\n" + getLikes() + "\n" + getTekst() + "\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
