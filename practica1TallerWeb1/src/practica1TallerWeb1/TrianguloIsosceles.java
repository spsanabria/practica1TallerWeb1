package practica1TallerWeb1;

public class TrianguloIsosceles {
	
	Double lado;
	Double base;
	
	public TrianguloIsosceles(Double valorLado, Double valorBase){
		this.lado= valorLado;
		this.base= valorBase;
	}

	public Double obtenerAltura(){
		return (Math.sqrt(Math.pow(this.lado,2)-(Math.pow((this.base/2),2))));
	}
	public Double obtenerArea(){
		return((this.obtenerAltura()*this.base)/2);
	}
	public Double obtenerPerimetro(){
		return ((this.obtenerAltura()*2)+ this.base);
	}
}
