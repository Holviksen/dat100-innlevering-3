package no.hvl.dat100.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.oppgave1.Innlegg;

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
			if(this.innleggSamling[i] != null && this.innleggSamling[i].erLik(innlegg)){
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(Innlegg i : this.innleggSamling){
			if(i != null && i.erLik(innlegg)){
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

		for(Innlegg il : this.innleggSamling){
			if(il != null && il.erLik(innlegg)){
				return false;
			}
		}

		if(ledigPlass()){
			for(int i = 0; i < this.innleggSamling.length; i++){
				if(this.innleggSamling[i] == null){
					this.innleggSamling[i] = innlegg;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String innleggString = Integer.toString(getAntall()) + "\n";

		for(Innlegg i : this.innleggSamling){
			if(i != null){
				innleggString += i.toString();
			}
		}

		return innleggString;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nySamling = new Innlegg[lengde * 2];

		for(int i = 0; i < this.innleggSamling.length; i++){
			nySamling[i] = this.innleggSamling[i];	
		}
		this.innleggSamling = nySamling;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if(finnes(innlegg)){
			return false;
		}

		if(!ledigPlass()){
			utvid();
		}

		return leggTil(innlegg);
	}
	
	public boolean slett(Innlegg innlegg) {
		
		if(finnes(innlegg)){
			this.innleggSamling[finnInnlegg(innlegg)] = null;
			return true;
		}

		return false;
	}
	
	public int[] search(String keyword) {

		int[] id = new int[getAntall()];

		int i = 0;
		
		for(Innlegg il : this.innleggSamling){
			if(il != null && il.toString().contains(keyword)){
				id[i] = il.getId();
				i++;
			}
		}

		return Arrays.copyOf(id, i);
		

	}
}