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
			MatcherAssert.assertThat(EnviarParaula.enviarParaula(),length(is(8)));
//        } catch (AssertionError EssertErr) {
//            System.out.println("La palabra no tiene 8 letras\n" + isex.getMessage());
//        }
	}
	
//	public static FeatureMatcher <String, Integer> lenght(Matcher<? super Integer> matcher){
//		return new Feature
//		
//		@Override 
//		protected abstract String featureValueOf(String paraula) {
//			return 
//		}
//			
//	}

	public static  FeatureMatcher<String, Integer> length(Matcher<? super Integer> matcher ){
        return new FeatureMatcher<String, Integer>(matcher, "La longitud escrita es ", "longitud real") {
            @Override
            protected Integer featureValueOf(String actual) {
              return actual.length();
            }
        };
    }

	
	
}