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
		productoA.setNombre("Mentol 300ml");
		productoA.setDescripcion("para golpes y resfriado");
		productoA.setPrecio(3.50);
		productoA.setStockActual(25);
		System.out.println("Su pedido de la farmacia ECONOMICA es de un "+productoA.getNombre());
		System.out.println("Sirve para "+productoA.getDescripcion());
		System.out.println("El precio de su producto es $:"+productoA.getPrecio());
		System.out.println("El stock actual :"+productoA.getStockActual());
		System.out.println("------------------------------------------------");
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoB-----------------------------
		productoB.setNombre("Crema 1L");
		productoB.setDescripcion("Para la hidratacion de cuerpo y cara");
		productoB.setPrecio(20.35);
		productoB.setStockActual(5);
		System.out.println("Su pedido de la farmacia TORRES es de un "+productoB.getNombre());
		System.out.println("Sirve para :"+productoB.getDescripcion());
		System.out.println("El precio de su producto es $:"+productoB.getPrecio());
		System.out.println("El stock actual :"+productoB.getStockActual());
		System.out.println("------------------------------------------------");
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoC-----------------------------
		productoC.setNombre("Paracetamol 500g");
		productoC.setDescripcion("Dolor muscular");
		productoC.setPrecio(0.50);
		productoC.setStockActual(59);
		System.out.println("Su pedido de la farmacia SANA SANA es de un "+productoC.getNombre());
		System.out.println("Sirve para :"+productoC.getDescripcion());
		System.out.println("El precio de su producto es $:"+productoC.getPrecio());
		System.out.println("El stock actual :"+productoC.getStockActual());
		System.out.println("------------------------------------------------");
	}

}
