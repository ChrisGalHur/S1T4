package S1T4N1Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class S1T4N1Ex1Main {

	public static void main(String[] args) {
		/*- Exercici 1
		Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
		Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'.*/
		
		String mesos[] = new String[12];
		mesos = AñadirMeses.añadirMeses(mesos);
		
		for (int i = 0; i < mesos.length; i++) {
		      String mes = mesos[i];
		      System.out.println("mes = " + mes);
		}
		

	}

}
