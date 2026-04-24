package com.krakedev.fabricaAliens.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.krakedev.fabricaAliens.Alien;

public class AlienJUnit {
	
	@Test
    public void testAsignacionAtributos() {
        Alien alien = new Alien(10, "Verde");

        assertEquals(10, alien.getTamanio());
        assertEquals("Verde", alien.getColor());
    }

    @Test
    public void testTamanioMinimo() {
        Alien alien = new Alien(3, "Rojo");
        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testTamanioMaximo() {
        Alien alien = new Alien(50, "Azul");
        assertEquals(30, alien.getTamanio());
    }

    @Test
    public void testValoresIniciales() {
        Alien alien = new Alien(10, "Negro");

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }

    @Test
    public void testPreciosBase() {
        Alien alien = new Alien(10, "Verde");

        assertEquals(2.0, alien.getPrecioCuerpo(), 0.001);
        assertEquals(1.0, alien.getPrecioExtremidad(), 0.001);
        assertEquals(0.5, alien.getPrecioOjo(), 0.001);
    }

}
