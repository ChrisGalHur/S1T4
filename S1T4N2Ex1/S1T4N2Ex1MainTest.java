package S1T4N2Ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import org.hamcrest.Description; 
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;

class S1T4N2Ex1MainTest {
	
	@Test
	void EnviarParaulaTest() {
//		try {
			MatcherAssert.assertThat(S1T4N2Ex1Main.enviarParaula(),length(is(8)));//Importem la llibrería de hamcret per poder tenir els Matchers y comparar amb més facilitat per la llectura del codi 
//        } catch (AssertionError EssertErr) {
//            System.out.println("La palabra no tiene 8 letras\n" + isex.getMessage());
//        }
	}
	
	public static  FeatureMatcher<String, Integer> length(Matcher<? super Integer> matcher ){//Utilizem la classe FeatureMatcher per dirlo que ha de comparar la llargaria de un String
        return new FeatureMatcher<String, Integer>(matcher, "La longitud escrita ", "La longitud real ") {//Li donem el dos missatges, del que se ens demana y el que es
            @Override
            protected Integer featureValueOf(String actual) {
              return actual.length();
            }
        };
    }

	
	
}