package com.krakedev;

public class TextProductos {

	public static void main(String[] args) {
		Productos productoA;
		Productos productoB;
		Productos productoC;
		//--------------------------------Instancia----------------------------
		productoA=new Productos();
		productoB=new Productos();
		productoC=new Productos();
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoA-----------------------------
		productoA.nombre="Mentol 300ml";
		productoA.descripcion="para golpes y resfriado";
		productoA.precio=3.50;
		productoA.stockActual=25;
		System.out.println("Su pedido de la farmacia ECONOMICA es de un "+productoA.nombre);
		System.out.println("Sirve para "+productoA.descripcion);
		System.out.println("El precio de su producto es $:"+productoA.precio);
		System.out.println("El stock actual :"+productoA.stockActual);
		System.out.println("------------------------------------------------");
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoB-----------------------------
		productoB.nombre="Crema 1L";
		productoB.descripcion="Para la hidratacion de cuerpo y cara";
		productoB.precio=20.35;
		productoB.stockActual=5;
		System.out.println("Su pedido de la farmacia TORRES es de un "+productoB.nombre);
		System.out.println("Sirve para :"+productoB.descripcion);
		System.out.println("El precio de su producto es $:"+productoB.precio);
		System.out.println("El stock actual :"+productoB.stockActual);
		System.out.println("------------------------------------------------");
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoC-----------------------------
		productoC.nombre="Paracetamol 500g";
		productoC.descripcion="Dolor muscular";
		productoC.precio=0.50;
		productoC.stockActual=59;
		System.out.println("Su pedido de la farmacia SANA SANA es de un "+productoC.nombre);
		System.out.println("Sirve para :"+productoC.descripcion);
		System.out.println("El precio de su producto es $:"+productoC.precio);
		System.out.println("El stock actual :"+productoC.stockActual);
		System.out.println("------------------------------------------------");
	}

}
