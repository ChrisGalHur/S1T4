package S1T4N1Ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1T4N1Ex3MainTest2 {

	@Test
	void testVeureNoms() {
		String[] arVuit = new String[9];
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()-> {
			arVuit[50] = "9";
		});
	}

}
