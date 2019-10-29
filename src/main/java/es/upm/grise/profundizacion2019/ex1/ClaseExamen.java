package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		
		float result = 0;

		// nodo 1
		while( a > b) {
			// nodo 2
			a--;
		}

		// nodo 3
		if (a <= b) {
			// nodo 4
			result = 0;
		}
		else {
			// nodo 5
			result = b;
		}

		// nodo 6
		return result;
	}

}
