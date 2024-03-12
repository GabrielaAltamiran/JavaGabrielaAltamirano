package com.krakedev;

public class TextAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		auto1.marca="KIA";
		auto1.anio=2018;
		auto1.precio=1680.35;
		System.out.println("------------------------------------------");
		System.out.println("La marca de su auto es "+auto1.marca);
		System.out.println("Su auto es del año "+auto1.anio);
		System.out.println("El costo de su auto es "+auto1.precio);
		System.out.println("------------------------------------------");
		auto2.marca="MERCEDEZ BENZ";
		auto2.anio=2000;
		auto2.precio=2900.50;
		
		System.out.println("La marca de su auto es "+auto2.marca);
		System.out.println("Su auto es del año "+auto2.anio);
		System.out.println("El costo de su auto es "+auto2.precio);
		System.out.println("------------------------------------------");

	}

}
