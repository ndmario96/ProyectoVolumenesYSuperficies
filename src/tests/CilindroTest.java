package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;

class CilindroTest {

	
	@Test
	void testSuperficie() {
		Cilindro c1 = new Cilindro (2,2);
		
		//Calculamos la superficie que nos da el metodo
		double superficieObtenida = Math.round(c1.superficie()*100)/100;
		//"Hardcodeamos la superficie que sabemos que debería dar"
		double superficieEsperada = Math.round(50.27*100)/100;
		
		assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cilindro c1 = new Cilindro(2,2);
		
		//Calculamos el volumen que nos da el método
		double volumenObtenido = Math.round(c1.volumen()*100)/100;
		
		//Hardcodeamos el volumen que sabemos que debería dar
		double volumenEsperado = 25.13;
		
		assertEquals(volumenEsperado, volumenObtenido);
	}

}
