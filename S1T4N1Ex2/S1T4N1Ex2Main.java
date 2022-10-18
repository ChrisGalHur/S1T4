package S1T4N1Ex2;

import java.util.Scanner;

public class S1T4N1Ex2Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		/*- Exercici 2
		Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
		Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.*/
		int numSenseLletra;
		char letraDni;
		
		numSenseLletra = dniCorrecte();
		letraDni = CalculDni.calcularLletra(numSenseLletra);
		
		System.out.println("El teu DNI complet es " + numSenseLletra + letraDni);
	}
	

	public static int dniCorrecte() {
		double numDni;
		boolean dniCorrecte = false;
		
		do {
			System.out.println("Introdueix el número de DNI:");
			numDni = scan.nextDouble();
			
			if((int)(Math.log10(numDni)+1) == 8){
				dniCorrecte = true;
			}else {
				System.out.println("No es un número de DNI correcte.\n");
			}
		}while(dniCorrecte != true);
		
		return (int)numDni;
	}
	
	
}