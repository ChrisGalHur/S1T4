package S1T4N1Ex2;

public class CalculDni {

	public static char calcularLletra(double numSinLetra) {
		int restaDiv;
		numSinLetra = (int)numSinLetra;
		String lletrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		restaDiv = (int) (numSinLetra % 23);
		char lletra = lletrasDni.charAt(restaDiv);

		return lletra;
	}
	
	
}
