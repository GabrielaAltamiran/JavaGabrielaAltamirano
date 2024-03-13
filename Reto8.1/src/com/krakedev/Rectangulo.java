package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	// Perimetro
	private double base1;
	private double altura1;

	// metodo
	public int calcularArea() {
		int area;
		area = base * altura;
		return area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getBase1() {
		return base1;
	}

	public void setBase1(double base1) {
		this.base1 = base1;
	}

	public double getAltura1() {
		return altura1;
	}

	public void setAltura1(double altura1) {
		this.altura1 = altura1;
	}

	public double calcularPerimetro() {

		double perimetro;
		perimetro = 2 * base1 + 2 * altura1;
		return perimetro;
	}

}
