package S1T4N1Ex2;

import java.util.Scanner;

public class S1T4N1Ex2Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		/*- Exercici 2
		Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el n?mero com a par?metre.
		Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perqu? el test rebi un espectre de dades ampli i validi si el c?lcul ?s correcte per a 10 n?meros de DNI predefinits.*/
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
			System.out.println("Introdueix el n?mero de DNI:");
			numDni = scan.nextDouble();
			
			if((int)(Math.log10(numDni)+1) == 8){
				dniCorrecte = true;
			}else {
				System.out.println("No es un n?mero de DNI correcte.\n");
			}
		}while(dniCorrecte != true);
		
		return (int)numDni;
	}
	
	
}