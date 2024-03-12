package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	//Perimetro
	public double base1;
	public double altura1;
	//metodo
	public int calcularArea() {
		int area;
		area = base * altura;
		return area;
	}
	public double calcularPerimetro() {
		
		double perimetro;
		perimetro = 2*base1 + 2*altura1;
		return perimetro;
	}
	
}
