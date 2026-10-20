package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private int lengde;

	private Innlegg[] innleggSamling = new Innlegg[lengde];

	public Blogg() {
		this.innleggSamling = new Innlegg[20];
	}

	public Blogg(int lengde) {
		this.innleggSamling = new Innlegg[lengde];
		this.lengde = lengde;
	}

	public int getAntall() {
		int count = 0;
		for(Innlegg i : this.innleggSamling){
			if(i != null){
				count++;
			}
		}
		return count;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggSamling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i = 0; i < this.innleggSamling.length; i++){
			if(this.innleggSamling[i].erLik(innlegg)){
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(Innlegg i : this.innleggSamling){
			if(i.erLik(innlegg)){
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		for(Innlegg i : this.innleggSamling){
			if(i == null){
				return true;
			}
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean res = false;

		for(int i = 0; i < this.innleggSamling.length; i++){
			if(!(this.innleggSamling[i].erLik(innlegg))){
				res = true;
			}
			else res = false;
		}

		if(ledigPlass()){
			for(int i = 0; i < this.innleggSamling.length; i++){
				if(this.innleggSamling[i] == null){
					this.innleggSamling[i] = innlegg;
					break;
				}
			}
		}
		return res;
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}