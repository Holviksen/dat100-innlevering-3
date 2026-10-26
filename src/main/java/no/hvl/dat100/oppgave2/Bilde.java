package no.hvl.dat100.oppgave2;

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
	@Override
	public String toHTML() {
		
		return "\t\t<h2>" + getBruker() + "@" + getDato() + " [" + getId() + "]</h2>" + "\n" +
		"\t\t<p>" + getTekst() + "</p>\n" + "\t\t<iframe src=" + getUrl() +"height=600 width=800></iframe>\n" + 
		"\t\t<hr>\n";
				
	}
}
