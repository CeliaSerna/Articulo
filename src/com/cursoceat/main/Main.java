package com.cursoceat.main;

import java.util.Scanner;

public class Main {
	
static Scanner entrada = new Scanner(System.in);

public static void main(String[] args) {
		// TODO Auto-generated method stub
String referencia ;
String nombre ;
double precio;

	//creación del objeto
	Articulo miArticulo = new Articulo();
		
	System.out.println("Escriba la referencia del artículo");
    referencia = entrada.nextLine();
    miArticulo.setReferencia(referencia);
	
    System.out.println("Escriba el nombre del artículo");
	nombre= entrada.nextLine();
	miArticulo.setNombre(nombre);
	
	System.out.println("Escriba el precio del artículo");
	precio = entrada.nextDouble();
	miArticulo.setPrecio(precio);
	
	System.out.println("El artículo introducido se llama: "+ nombre);
	System.out.println("su referencia es: " + referencia);
	System.out.println("y su precio es: " + precio + "€");
	}

}
