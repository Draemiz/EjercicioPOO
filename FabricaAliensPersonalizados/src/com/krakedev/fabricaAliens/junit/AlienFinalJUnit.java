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
    
    @Test
    public void noPermiteExcesoExtremidades() {
        Alien alien = new Alien(15, "Verde");

        assertTrue(alien.agregarBrazos(6));
     // pasa de 10
        assertFalse(alien.agregarPiernas(5));

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }
    
    @Test
    public void respetaLimiteOjos() {
    	// max 3
        Alien alien = new Alien(8, "Rojo"); 

        assertTrue(alien.agregarOjos(3));
        
        //se pasa
        assertFalse(alien.agregarOjos(1)); 

        assertEquals(3, alien.getNumeroOjos());
    }
    
    @Test
    public void precioTotalCorrecto() {
        Alien alien = new Alien(10, "Azul");

        alien.agregarBrazos(2);
        alien.agregarPiernas(2);
        alien.agregarOjos(2);

        double esperado = 2.0 + (4 * 1.0) + (2 * 0.5);

        assertEquals(esperado, alien.getPrecioTotal(), 0.001);
    }
}