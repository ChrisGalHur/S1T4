package S1T4N1Ex1;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class S1T4N1MainTest {

	@Test
	void testAñadirMeses() {
		String inicial[] = new String[12];
		int esperado = inicial.length;
		
		String modificado[] = AñadirMeses.añadirMeses(inicial);
		int actual = modificado.length;
		assertEquals(esperado, actual);
	}
	
	@Test
	void arrayNulla() {
		String nulla[] = new String[12];
		
		nulla = AñadirMeses.añadirMeses(nulla);
		assertNotNull(nulla);
	}
	
	@Test
	void testContieneAgosto() {
		String mesesTest[] = new String[12];
		mesesTest = AñadirMeses.añadirMeses(mesesTest);
		for (String Busca : mesesTest) {
			Busca.equals("Agosto");
		}
	}

}
