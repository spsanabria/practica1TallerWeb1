package practica1TallerWeb1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	@Test
	public void testArea() {
		Integer area;
		Rectangulo rectanguloArea = new Rectangulo();
		rectanguloArea.setBase(4);
		rectanguloArea.setAltura(2);
		area = rectanguloArea.calculodeArea();		
		assertTrue(area == 8);		
	}

	@Test
	public void testPerimetro() {
		Integer perimetro;
		Rectangulo rectanguloPerimetro = new Rectangulo();
		rectanguloPerimetro.setBase(4);
		rectanguloPerimetro.setAltura(2);
		perimetro = rectanguloPerimetro.calculodePerimetro();		
		assertTrue(perimetro == 12);		
	}

}
