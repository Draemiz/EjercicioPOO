package com.krakedev.maquinaAliens.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.krakedev.maquinaAliens.Aliens;


public class JUnit {
	@Test
	public void testCrearAlienNormal() {
		Aliens alien = new Aliens(3, "rojo");
		assertEquals(5, alien.getTamanio());
		assertEquals("rojo", alien.getColor());
	    assertEquals(1.0, alien.getPrecioCuerpo(),0.01);
	    assertEquals(0.5, alien.getPrecioExtremidad(),0.01);
	    assertEquals(0.25, alien.getPrecioOjo(),0.01);
	}
	
	//Codigo relizado con IA
	// ✔ Tamaño mayor al máximo
		@Test
		public void testTamanioMaximo() {
			Aliens alien = new Aliens(50, "negro");
			assertEquals(30, alien.getTamanio());
		}

		// ✔ Tamaño dentro del rango
		@Test
		public void testTamanioNormal() {
			Aliens alien = new Aliens(20, "azul");
			assertEquals(20, alien.getTamanio());
		}

		// ✔ Validación de color
		@Test
		public void testColor() {
			Aliens alien = new Aliens(10, "verde");
			assertEquals("verde", alien.getColor());
		}

		// ✔ Cálculo de precio cuerpo
		@Test
		public void testPrecioCuerpo() {
			Aliens alien = new Aliens(10, "rojo");
			assertEquals(2.0, alien.getPrecioCuerpo(), 0.01);
		}

		// ✔ Cálculo de precio extremidad
		@Test
		public void testPrecioExtremidad() {
			Aliens alien = new Aliens(10, "rojo");
			assertEquals(1.0, alien.getPrecioExtremidad(), 0.01);
		}

		// ✔ Cálculo de precio ojo
		@Test
		public void testPrecioOjo() {
			Aliens alien = new Aliens(10, "rojo");
			assertEquals(0.5, alien.getPrecioOjo(), 0.01);
		}
		
		//--------------------------
		
		@Test
		public void testAlienAgregaBrazosSinProblema() {
			Aliens alien = new Aliens(10, "verde");
			boolean resultado = alien.agregarBrazos(4);

			assertTrue(resultado);
			assertEquals(4, alien.getNumeroBrazos());
		}

		@Test
		public void testAlienNoPuedeTenerMilBrazos() {
			Aliens alien = new Aliens(10, "rojo");
			boolean resultado = alien.agregarBrazos(11);

			assertFalse(resultado);
			assertEquals(0, alien.getNumeroBrazos());
		}

		@Test
		public void testAlienCombinacionDeExtremidades() {
			Aliens alien = new Aliens(10, "azul");

			alien.agregarBrazos(5);
			boolean resultado = alien.agregarPiernas(5);

			assertTrue(resultado);
			assertEquals(5, alien.getNumeroBrazos());
			assertEquals(5, alien.getNumeroPies());
		}

		@Test
		public void testAlienSePasaDeExtremidadesYFalla() {
			Aliens alien = new Aliens(10, "morado");

			alien.agregarBrazos(6);
			boolean resultado = alien.agregarPiernas(5);

			assertFalse(resultado);
			assertEquals(6, alien.getNumeroBrazos());
			assertEquals(0, alien.getNumeroPies());
		}

}
