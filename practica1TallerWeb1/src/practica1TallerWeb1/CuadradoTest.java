package practica1TallerWeb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void obtenerArea() {
		Cuadrado cuadrado1= new Cuadrado(2.0);
		Double resultadoEsperado= 4.0;
		double resultado= cuadrado1.obtenerArea();
		assertEquals(resultadoEsperado,resultado,0.01);
	}
	
	@Test
	public void obtenerPerimetro() {
		Cuadrado cuadrado2= new Cuadrado(4.0);
		Double resultadoEsperado= 16.0;
		Double resultado= cuadrado2.obtenerPerimetro();
		assertEquals(resultadoEsperado,resultado,0.01);
	}
}
