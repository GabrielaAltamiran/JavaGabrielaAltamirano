package com.krakedev;

public class TextCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadra =new Cuadrado();
		//Area primer cuadrado
		System.out.println("------------------------------------AREAS-----------------------------");
		System.out.println("--------------------------Primer cuadrado-----------------------------");
		double area1;
		cuadra.lado = 2;
		area1 = cuadra.calcularAreaCuadrado();
		System.out.println("El area del cuadrado es: "+area1);
		//Area segundo cuadrado
		System.out.println("--------------------------Segundo cuadrado----------------------------");
		double area2;
		cuadra.lado = 4;
		area2 = cuadra.calcularAreaCuadrado();
		System.out.println("El area del cuadrado es: "+area2);
		//Area tercer cuadrado 
		System.out.println("--------------------------Tercer cuadrado-----------------------------");
		double area3;
		cuadra.lado = 8;
		area3 = cuadra.calcularAreaCuadrado();
		System.out.println("El area del cuadrado es: "+area3);
		//Perimetro primer cuadrado
		System.out.println("--------------------------PERIMETROS ---------------------------------");
		System.out.println("--------------------------Primer cuadrado-----------------------------");
		double perimetro1;
		cuadra.lado = 3;
		perimetro1 = cuadra.calcularPerimetroCuadrado();
		System.out.println("El perimetro del es : "+perimetro1);
		//Perimetro segundo cuadrado
		System.out.println("--------------------------Segundo cuadrado-----------------------------");
		double perimetro2;
		cuadra.lado = 25;
		perimetro2 = cuadra.calcularPerimetroCuadrado();
		System.out.println("El perimetro del es : "+perimetro2);
		//Perimetro tercer cuadrado
		System.out.println("--------------------------Tercer cuadrado------------------------------");
		double perimetro3;
		cuadra.lado = 5;
		perimetro3 = cuadra.calcularPerimetroCuadrado();
		System.out.println("El perimetro del es : "+perimetro3);

	}

}
