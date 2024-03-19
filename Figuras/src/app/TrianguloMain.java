package app;

import modelo.Triangulo;

public class TrianguloMain {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		double area1 = t1.getArea();
		double perimetro2 = t2.getPerimetro();
		
		System.out.println("El area del triangulo 1 es" + area1);
		System.out.println("El perimetro del triangulo 2 es" + perimetro2);

	}

}
