package com.krakedev.fabricaAliens.test;

import com.krakedev.fabricaAliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
        
        System.out.println("===== PRUEBA 1: TAMAÑO MENOR AL MÍNIMO =====");
        Alien alien1 = new Alien(3, "Verde");
        alien1.imprimir();

        System.out.println("===== PRUEBA 2: TAMAÑO MAYOR AL MÁXIMO =====");
        Alien alien2 = new Alien(40, "Rojo"); 
        alien2.imprimir();

        System.out.println("===== PRUEBA 3: TAMAÑO NORMAL =====");
        Alien alien3 = new Alien(15, "Azul");
        alien3.imprimir();
	}
	
}
