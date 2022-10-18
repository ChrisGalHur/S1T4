package S1T4N1Ex3;

import java.io.IOException;
import java.sql.Array;

public class S1T4N1Ex3Main {

	public static void main(String[] args) throws Exception {
		/*- Exercici 3
		Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
		Verifica el seu correcte funcionament amb un test jUnit.*/
		
		String[] treballadores = new String[6];
		Llista.veureNoms(treballadores);
	}

}
