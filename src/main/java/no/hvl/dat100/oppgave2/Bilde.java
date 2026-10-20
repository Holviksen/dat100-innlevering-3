package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		setUrl(url);
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		setUrl(url);
		for(int i = 0; i < likes; i++){
			doLike();
		}
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + 
		"\n" + getLikes() + "\n" + getTekst() + "\n" + getUrl() + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
