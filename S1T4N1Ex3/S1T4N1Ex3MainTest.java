package S1T4N1Ex3;

import java.lang.reflect.Array;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

class S1T4N1Ex3MainTest {


	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testVeureNoms() {
		String[] arVuit = new String[9];
		System.out.println("hola");
		
		arVuit[50] = "hola";
		//Llista.veureNoms(arVuit);
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, null);
	}
}//Revisar no se ejecuta