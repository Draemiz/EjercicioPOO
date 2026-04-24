package com.krakedev.fabricaAliens.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.krakedev.fabricaAliens.Alien;

public class AlienFinalJUnit {

    @Test
    public void flujoCompleto() {
        Alien alien = new Alien(20, "Morado");

        assertTrue(alien.agregarBrazos(4));
        assertTrue(alien.agregarPiernas(4));
        assertTrue(alien.agregarOjos(5));

        assertEquals(8, alien.getNumeroBrazos() + alien.getNumeroPies());
        assertEquals(5, alien.getNumeroOjos());

        assertTrue(alien.getPrecioTotal() > 0);
    }
}