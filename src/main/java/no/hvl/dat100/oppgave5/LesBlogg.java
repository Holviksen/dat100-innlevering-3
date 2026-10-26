package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.Blogg;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

	

		try(BufferedReader leser = new BufferedReader(new FileReader(mappe + filnavn))) {

			Blogg samling = new Blogg(Integer.parseInt(leser.readLine()));

			String linje;

			String[] arr = new String[5];

			while((linje = leser.readLine()) != null){

				if(linje.equals(TEKST)){
					for(int i = 0; i < 4; i++){
						arr[i] = leser.readLine();
					}
					samling.leggTil(new Tekst(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3]));
				}

				if(linje.equals(BILDE)){
					for(int i = 0; i < 5; i++){
						arr[i] = leser.readLine();
					}
					samling.leggTil(new Bilde(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4]));
				}
			}

			return samling;

		} catch (IOException e) {
			System.err.println("Kan ikke lese fil");
		}

		return null;

	}
}
