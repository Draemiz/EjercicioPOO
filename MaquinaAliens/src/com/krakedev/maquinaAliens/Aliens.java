package com.krakedev.maquinaAliens;

public class Aliens {
	private int tamanio;
	private String color;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private int numeroOjos;
	
	//Constructor
	public Aliens(int tamanio, String color) {
		//Validación del tamanio
		if(tamanio < 5) {
			this.tamanio=5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}

		this.color = color;

		//precios
		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
		
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	
	public void imprimir() {
		System.out.println("Tamaño: " + tamanio);
		System.out.println("Color: " + color);
		System.out.println("Número de brazos: " + numeroBrazos);
		System.out.println("Número de pies: " + numeroPies);
		System.out.println("Precio cuerpo: " + precioCuerpo);
		System.out.println("Precio extremidad: " + precioExtremidad);
		System.out.println("Precio ojo: " + precioOjo);
	}
	
	public boolean agregarBrazos(int cantidad) {
		if (this.numeroBrazos + this.numeroPies + cantidad <= 10) {
			this.numeroBrazos += cantidad;
			return true;
		} else {
			return false;
		}
	}

	public boolean agregarPiernas(int cantidad) {
		if (this.numeroBrazos + this.numeroPies + cantidad <= 10) {
			this.numeroPies += cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	// parte 8: Agregar ojos
	
	public boolean agregarOjos(int cantidad) {
		int maxOjos;

		
		if (this.tamanio >= 5 && this.tamanio <= 10) {
			maxOjos = 3;
		} else if (this.tamanio > 10 && this.tamanio <= 20) {
			maxOjos = 5;
		} else {
			maxOjos = 7;
		}

		
		if (this.numeroOjos + cantidad <= maxOjos) {
			this.numeroOjos += cantidad;
			return true;
		} else {
			return false;
		}
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}
	
	
}