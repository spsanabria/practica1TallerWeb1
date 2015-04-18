package cuenta;

public class Cuenta {
	Double saldo;
	
	public Cuenta(Double valor) {
		this.saldo = valor;
	}
	
	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public void extraerSaldo(Double saldoExtraido) {
		if(saldoExtraido > 0) {			
			Double saldo = consultarSaldo();			
			if((saldo - saldoExtraido) >= 0 ) {
				this.saldo = this.saldo - saldoExtraido;			
			}
		}
	}

	public void depositarSaldo(Double saldoDepositado) {
		if(saldoDepositado > 0) {					
			this.saldo = this.saldo + saldoDepositado;
		}
		
	}
	
}
