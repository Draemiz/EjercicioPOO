package com.krakedev.fabricaAliens.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.krakedev.fabricaAliens.Alien;

public class AlienOjosJUnit {

    @Test
    public void ojosTamanioPequenio() {
        Alien alien = new Alien(8, "Verde");

        boolean resultado = alien.agregarOjos(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroOjos());
    }

    @Test
    public void excesoOjos() {
        Alien alien = new Alien(8, "Rojo");

        boolean resultado = alien.agregarOjos(5);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());
    }

    @Test
    public void ojosTamanioGrande() {
        Alien alien = new Alien(25, "Azul");

        boolean resultado = alien.agregarOjos(7);

        assertTrue(resultado);
        assertEquals(7, alien.getNumeroOjos());
    }
}
