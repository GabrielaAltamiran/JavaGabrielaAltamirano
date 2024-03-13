package com.krakedev;
//Con set se modifican los valores
//Con get se recupraar el valor
//This referencial al atributo cuando quiero se llamne de la misma manera dos varibeles
/*this.anio = anio;*/

public class Fecha {
	private int anio;
	private int mes;
	private int dia;
	
	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

}
