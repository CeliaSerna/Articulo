package com.cursoceat.main;

public class Articulo {

	private String referencia = "";
	private String nombre ="";
	private double precio=0;
	
	
	public Articulo(String referencia, String nombre, double precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Articulo() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
	
}
