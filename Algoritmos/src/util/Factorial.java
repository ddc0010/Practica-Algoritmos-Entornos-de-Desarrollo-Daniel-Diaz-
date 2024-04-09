package util;

public abstract class Factorial {
	
	/**
	 * Devuelve el sumatorio del numero especificado 
	 * @param numero el numero del que queremos calcular el sumatorio 
	 * @return el sumatorio del numero especificado 
	 */
	
	public static int factorial(int n) {
		int factorial = 0;
		
		for(int i=1;i<=n;i++) {
			factorial *= 1;
		}
		
		return factorial;
		
	}

}
