package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void dividirPorCero() {
		Calculadora c = new Calculadora();
		c.getResultado(10.0, 0.0);
	}
	
	@Test(expected = Exception.class)
	public void dividirPorCero2() throws Exception {
		Calculadora c = new Calculadora();
		try {
			c.getResultado2(10.0, 0.0);
		} catch (Exception e){
			throw(e);
		}
		
	}

	@Test
	public void dividirPorNumeros() {
		Double resultado;
		Calculadora c2 = new Calculadora();
		resultado = c2.getResultado(10.0, 1.0);
		assertEquals(10.0, resultado, 0.1);
	}

}
