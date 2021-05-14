package test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import repaso.*;

public class FiguraTest {
	
	Figura cuadrado;
	Figura circulo;

	@Before
	public void setUp() throws Exception {
		cuadrado = new Cuadrado("c1", 10);
		circulo = new Circulo("ci1", 5);
	}

	@After
	public void tearDown() throws Exception {
		cuadrado = null;
		circulo = null;
	}

	@Test
	public void testCalcularPerimetroCuadrado() {
		assertEquals(31.41, circulo.calcularPerimetro(), 0.01);
	}

	@Test
	public void testCalcularSuperficieCuadrado() {
		assertEquals(78.53, circulo.calcularSuperficie(), 0.01);
	}

	@Test
	public void testGetValores() {
		assertEquals("lado=10.0", cuadrado.getValores());
	}

	@Test
	public void testGetNombre() {
		assertEquals("c1", cuadrado.getNombre());
	}

}
