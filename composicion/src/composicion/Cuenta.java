package composicion;

public class Cuenta {
	private double saldo;
	private int limite;
	private double numeroDeCuenta;
	private Usuario miUsuario = new Usuario("Roberto", "Braile", 25771484, 32);
	
	public Cuenta(double saldo, int limite, int movimientos, double numeroDeCuenta) {
		this.saldo = saldo;
		this.limite = limite;
		this.numeroDeCuenta = numeroDeCuenta;
	}	
	
	public Usuario moistrarTitularCuenta() {
		return this.miUsuario;
	}
	
	public double mostrarNumeroDeCuenta() {
		return this.numeroDeCuenta;
	}
	
	public double mostrarLimite() {
		return this.limite;
	}
	
	public double mostrarSaldo() {
		return this.saldo;
	}
	
	public void restarASaldo(double aRestar) {
		this.saldo -= aRestar;
	}
	
	public void sumarASaldo(double aSumar) {
		this.saldo += aSumar;
	}
}
