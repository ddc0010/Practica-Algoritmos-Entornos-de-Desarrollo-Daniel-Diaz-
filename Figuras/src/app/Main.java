package app;

import modelo.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		int area1 = r1.getArea();
		int perimetro2 = r2.getPerimetro();
		
		System.out.println("El area del rectangulo 1 es" + area1);
		System.out.println("El perimetro del rectangulo 2 es" + perimetro2);
	}

}
