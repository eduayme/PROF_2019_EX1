package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import org.junit.Test;

public class ClaseExamenTest {

	private ClaseExamen examen;

	@Before
	public void setup() {
		examen = new ClaseExamen();
	}

	// c1: 1,2,1,3,4,6
	@Test
	public void test_A_higher_than_B_OK() {
		int a = 1;
		int b = 0;

		float result = 0;
		assertEquals(result, examen.metodoAProbar(a,b), 0.0f);
	}

	// c2: 1,3,4,6 (redundante)
	@Test
	public void test_A_smaller_than_B_OK() {
		int a = 0;
		int b = 1;

		float result = 0;
		assertEquals(result, examen.metodoAProbar(a,b), 0.0f);
	}

}
