package S1T4N1Ex1;

import java.lang.reflect.Array;
import java.text.DateFormatSymbols;
import java.util.Arrays;

public class A�adirMeses {

	public static String[] a�adirMeses(String[] a�adir) {
		a�adir = new DateFormatSymbols().getMonths();
		a�adir = Arrays.copyOf(a�adir, a�adir.length -1);
		return a�adir;
	}
}
