package S1T4N1Ex3;



import java.lang.reflect.Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1T4N1Ex3MainTest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testVeureNoms() {
		String[] arVuit = new String[9];
		Llista.veureNoms(arVuit);
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, null);
	}
}