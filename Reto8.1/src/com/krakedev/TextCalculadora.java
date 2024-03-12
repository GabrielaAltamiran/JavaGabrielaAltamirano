package com.krakedev;

public class TextCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		calcu = new Calculadora();
		resultadoResta = calcu.restar(10, 5);
		resultadoSuma  = calcu.sumar(5,8);
		System.out.println("Resultado suma : "+resultadoSuma);
		System.out.println("Resultado resta :"+resultadoResta);
		
		

	}

}
