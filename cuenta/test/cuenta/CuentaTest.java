package cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void testSaldo5Deposito5() {
		Double saldo;
		Cuenta cuenta1 = new Cuenta(5.0);
		cuenta1.depositarSaldo(5.0);
		saldo = cuenta1.consultarSaldo();
		assertTrue( saldo == 10.0);	
	}
	
	@Test
	public void testSaldoIgual0() {
		Double saldo;
		Cuenta cuenta1 = new Cuenta(0.0);
		saldo = cuenta1.consultarSaldo();
		assertTrue( saldo == 0.0);	
	}
	
	@Test
	public void testSaldo10Extracion5() {
		Double saldo;
		Cuenta cuenta1 = new Cuenta(10.0);
		cuenta1.extraerSaldo(5.0);
		saldo = cuenta1.consultarSaldo();
		assertTrue( saldo == 5.0);	
	}
	
	@Test
	public void testSaldo5Extracion6() {
		Double saldo;
		Cuenta cuenta1 = new Cuenta(5.0);
		cuenta1.extraerSaldo(6.0);
		saldo = cuenta1.consultarSaldo();
		assertTrue( saldo == 5.0);	
	}
	
	@Test
	public void testExtracionNegativo() {
		Double saldo;
		Cuenta cuenta1 = new Cuenta(10.0);
		cuenta1.extraerSaldo(-6.0);
		saldo = cuenta1.consultarSaldo();
		assertTrue( saldo == 10.0);	
	}
	
	@Test
	public void testDepositoNegativo() {
		Double saldo;
		Cuenta cuenta1 = new Cuenta(10.0);
		cuenta1.depositarSaldo(-6.0);
		saldo = cuenta1.consultarSaldo();
		assertTrue( saldo == 10.0);	
	}

}
