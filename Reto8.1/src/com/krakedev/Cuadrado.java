package com.krakedev;

public class Cuadrado {
	double lado;
	//Area del cuadrado
	public double calcularAreaCuadrado() {
		double area;
		area = lado * lado;
		return area;
	}
	//Perimetro
	public double calcularPerimetroCuadrado() {
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}
}
