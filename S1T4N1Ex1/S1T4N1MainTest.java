package S1T4N1Ex1;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class S1T4N1MainTest {

	@Test
	void testA�adirMeses() {
		String inicial[] = new String[12];
		int esperado = inicial.length;
		
		String modificado[] = A�adirMeses.a�adirMeses(inicial);
		int actual = modificado.length;
		assertArrayEquals(esperado, actual);;
	}

	private void assertArrayEquals(int esperado, int actual) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	void testContieneAgosto() {
		String mesesTest[] = new String[12];
		mesesTest = A�adirMeses.a�adirMeses(mesesTest);
		for (String Busca : mesesTest) {
			Busca.equals("Agosto");
		}
	}

}
