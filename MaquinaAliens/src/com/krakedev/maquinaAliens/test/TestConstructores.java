package com.krakedev.maquinaAliens.test;

import com.krakedev.maquinaAliens.Aliens;

public class TestConstructores {

	public static void main(String[] args) {
		Aliens alien1 = new Aliens(2, "rojo"); 
		Aliens alien2 = new Aliens(26, "negro");
		Aliens alien3 = new Aliens(20, "azul");

		System.out.println("ALIEN 1 ");
		alien1.imprimir();

		System.out.println("ALIEN 2 ");
		alien2.imprimir();

		System.out.println("ALIEN 3 ");
		alien3.imprimir();
	}

}
