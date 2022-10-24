package S1T4N2Ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.FeatureMatcher;

public class S1T4N2Ex1Main {

	public static void main(String[] args) {
		/*- Exercici 1
		Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher de longitud per a un String.
		Volem usar la classe ->FeatureMatcher.
		Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de l'Objecte prova ha de coincidir i
		proporcionar un missatge d'error agradable. El constructor de FeatureMatcher t� els seg�ents arguments en aquest ordre:
		El matcher que volem embolicar.
		Una descripci� de la funci� que provem.
		Una descripci� del possible mismatch (desajustament).
		L'�nic m�tode que hem de sobreescriure �s featureValueOf (T actual), que retorna el valor que es passar� al m�tode 
		match () / matchesSafely (). Utilitza el seu comparador personalitzat en una prova per a comprovar si la cadena "Mordor" t� una longitud de 8.
		Ajusta la prova si �s necessari.*/


	}
	
	public static String enviarParaula() {
		String paraula = "Mordor";
		return paraula;
	}
	
}
