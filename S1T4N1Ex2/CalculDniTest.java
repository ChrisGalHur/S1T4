package S1T4N1Ex2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class CalculDniTest {
	
	@Parameters
	public static Map<Integer, Character> dniDades (){
		Map<Integer, Character> baseDades = new HashMap<Integer, Character>();
		baseDades.put(89745632, 'T');	baseDades.put(54789632, 'K');	baseDades.put(96385274, 'W');
		baseDades.put(74185296, 'S');	baseDades.put(85274196, 'V');	baseDades.put(98745632, 'P');
		baseDades.put(12347896, 'R');	baseDades.put(12345678, 'Z');	baseDades.put(87654321, 'X');
		baseDades.put(13467258, 'E');
		
		
	return baseDades;    
	}
	
	@Parameters
	public static ArrayList dniSolNum () {
	ArrayList<Integer> numeros = new ArrayList<>();
	numeros.add(89745632);	numeros.add(54789632);	numeros.add(96385274);	numeros.add(74185296);
	numeros.add(85274196);	numeros.add(98745632);	numeros.add(12347896);	numeros.add(12345678);
	numeros.add(87654321);	numeros.add(13467258);
	return numeros;
	}
	
	@Test
	void testcalcularLletra() {
		int cantParametros = 10;
		Map<Integer, Character> ambLletra = dniDades();
		ArrayList<Integer> claus = dniSolNum();
		
		for(int k: claus) {
			assertEquals(ambLletra.get(k), CalculDni.calcularLletra(k));
		}
	}
	
	

}
