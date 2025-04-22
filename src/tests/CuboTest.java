package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class CuboTest {

	@Test
	void testSuperficie() {
		Cubo c = new Cubo(2);
		
		//Calculamos la superficie que nos da el metodo
		double superficieObtenida = c.superficie();
		//"Hardcodeamos la superficie que sabemos que debería dar"
		double superficieEsperada = 24;
		
		assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cubo c = new Cubo(2);
		
		//Calculamos el volumen que nos da el metodo
		double volumenObtenido = c.volumen();
		//"Hardcodeamos el volumen que sabemos que debería dar"
		double volumenEsperado = 8;
		
		assertEquals(volumenEsperado, volumenObtenido);
	}

}
