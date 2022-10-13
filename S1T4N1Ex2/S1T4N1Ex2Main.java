package S1T4N1Ex2;

import java.util.Scanner;

public class S1T4N1Ex2Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		/*- Exercici 2
		Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
		Crea una classe jUnit que verifiqui el seu correcte funcionament,
		parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.*/
		
		String msje = dni();
		
		
		
	}
	
	public static boolean comprobarNumeroValido(Integer iNumero) {
		boolean cantidadCorrecta;
		String x = Integer.toString(iNumero);
		if
		
		return cantidadCorrecta;
	}

	public static String dni() {
		int numDni;
		boolean numVale, dniCorrecto;
		
		do {
			System.out.println("Introduce el numero de DNI:");
			numDni = scan.nextInt();
			numVale = comprobarNumeroValido(numDni);
			if(numVale = true) {
			
			}else {
			
			}
		}while(dniCorrecto = false);
		
		return "";
	}
}