package app;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		 int[] numeros = new int[5];
	        Random rand = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rand.nextInt(10) + 1;

	}
	}
}

