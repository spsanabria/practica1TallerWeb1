package practica1TallerWeb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void calcularArea() {
		Double area;
		Circulo newCirculo = new Circulo();
		area = newCirculo.caluloDeArea(5);
		assertTrue(area == 78.5);
	}
	
	@Test
	public void calcularPerimetro() {
		Double perimetro;
		Circulo newCirculo2 = new Circulo();
		perimetro = newCirculo2.caluloDePerimetro(5);
		assertEquals(perimetro,31.4,0.01);
	}
	
}



