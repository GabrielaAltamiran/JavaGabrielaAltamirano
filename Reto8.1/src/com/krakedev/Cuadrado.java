package com.krakedev;

public class Cuadrado {
	private double lado;
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
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
