package calculadora;

public class Calculadora {
	public Double getResultado(Double dividendo, Double divisor) {
		if(divisor == 0) {
			try {
				throw new Exception("no nada"); 
			} catch (Exception e){
				System.err.println(e.getMessage());
			}
		} else {
			return dividendo/divisor;
		}
		return dividendo/divisor;
	}
	
	public Double getResultado2(Double dividendo, Double divisor) throws Exception {
		if(divisor == 0) {
			throw new Exception("no nada2"); 
		} else {
			return dividendo/divisor;
		}
	}
}
