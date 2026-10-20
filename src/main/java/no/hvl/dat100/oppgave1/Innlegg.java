package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	

	private int id;
	private int likes;

	private String bruker; 
	private String dato;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		setId(id);
		setBruker(bruker);
		setDato(dato);
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		setId(id);
		setBruker(bruker);
		setDato(dato);
		for(int i = 0; i < likes; i++){
			doLike();
		}
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public void setId(int id){
		this.id = id;
	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		if(getId() == innlegg.getId()){
			return true;
		}
		return false;

	}
	
	@Override
	public String toString() {
		
		return id + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n";
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
