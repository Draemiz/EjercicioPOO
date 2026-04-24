package com.krakedev.fabricaAliens.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.krakedev.fabricaAliens.Alien;

public class AlienExtremidadesJUnit {

    @Test
    public void agregarBrazosCorrecto() {
        Alien alien = new Alien(10, "Verde");

        boolean resultado = alien.agregarBrazos(4);

        assertTrue(resultado);
        assertEquals(4, alien.getNumeroBrazos());
    }

    @Test
    public void agregarPiernasCorrecto() {
        Alien alien = new Alien(10, "Azul");

        boolean resultado = alien.agregarPiernas(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroPies());
    }

    @Test
    public void noPermiteExcederLimite() {
        Alien alien = new Alien(10, "Rojo");

        alien.agregarBrazos(6);
        boolean resultado = alien.agregarPiernas(5);

        assertFalse(resultado);
        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }
}
