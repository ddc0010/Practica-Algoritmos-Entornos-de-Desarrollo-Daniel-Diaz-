package app;

import modelo.Circulo;

public class CirculoMain {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		
		int area1 = c1.getArea();
		int perimetro2 = c2.getPerimetro();
		
		System.out.println("El area del circulo 1 es" + area1);
		System.out.println("El perimetro del circulo 2 es" + perimetro2);
	}

}
