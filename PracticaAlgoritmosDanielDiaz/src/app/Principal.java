package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		 int[] num = new int[5];
	        Random random = new Random();
	        for (int i = 0; i < num.length; i++) {
	            num[i] = random.nextInt(10) + 1;
	            
	            int [] FibonacciResultado = new int[5];
	            int [] FactorialResultado = new int[5];
	            boolean[] PrimosResultado = new boolean[5];

	            FibonacciResultado[i] = Algoritmos.fibonacci(num[i]);
	            FactorialResultado[i] = Algoritmos.factorial(num[i]);
	            PrimosResultado[i] = Algoritmos.esPrimo(num[i]);

	}
	}
	}
