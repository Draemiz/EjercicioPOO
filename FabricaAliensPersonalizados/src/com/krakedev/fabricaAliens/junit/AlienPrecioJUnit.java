package com.krakedev.fabricaAliens.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.krakedev.fabricaAliens.Alien;

public class AlienPrecioJUnit {

    @Test
    public void calcularPrecioTotalCorrecto() {
        Alien alien = new Alien(10, "Verde");

        alien.agregarBrazos(2);
        alien.agregarPiernas(2);
        alien.agregarOjos(2);

        double esperado = 2.0 + (4 * 1.0) + (2 * 0.5);

        assertEquals(esperado, alien.getPrecioTotal(), 0.001);
    }

    @Test
    public void precioInicialEsCero() {
        Alien alien = new Alien(10, "Azul");

        assertEquals(0, alien.getPrecioTotal(), 0.001);
    }
}