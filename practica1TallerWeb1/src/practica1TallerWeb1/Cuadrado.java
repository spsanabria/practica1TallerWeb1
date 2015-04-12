package practica1TallerWeb1;

public class Cuadrado {

	Double lado;
	
	public Cuadrado(Double valorLado){
		this.lado= valorLado;
	}
	public Double obtenerArea(){
		return (Math.pow(this.lado, 2));
	}
	public Double obtenerPerimetro(){
		return(4*this.lado);
	}
}
