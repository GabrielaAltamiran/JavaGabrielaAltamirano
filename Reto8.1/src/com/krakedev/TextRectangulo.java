package com.krakedev;

public class TextRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		//area 
		int areaR1;
		int areaR2;
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		System.out.println("-------------------AREA---------------------");
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		System.out.println("Area de r1 :"+areaR1);
		System.out.println("Area de r2 :"+areaR2);
		
		//Perimetro
		double perimetro1;
		double perimetro2;
		
		r1.base1=10;
		r1.altura1=5;
		

		r2.base1=8;
		r2.altura1=3;
		System.out.println("------------------Perimetro-----------------");
		
		perimetro1 = r1.calcularPerimetro();
		perimetro2 = r2.calcularPerimetro();
		System.out.println("Perimetro de r1 :"+perimetro1);
		System.out.println("Perimetro de r2 :"+perimetro2);
		System.out.println("--------------------------------------------");

	}

}
