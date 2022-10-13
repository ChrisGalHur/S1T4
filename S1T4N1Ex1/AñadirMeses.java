package S1T4N1Ex1;

import java.lang.reflect.Array;
import java.text.DateFormatSymbols;
import java.util.Arrays;

public class AñadirMeses {

	public static String[] añadirMeses(String[] añadir) {
		añadir = new DateFormatSymbols().getMonths();
		añadir = Arrays.copyOf(añadir, añadir.length -1);
		return añadir;
	}
}
