package practica1TallerWeb1;

public class Circulo {
	double pi = 3.14;
	
	public double caluloDeArea(Integer radio) {
		return (this.pi * radio * radio);
	}
	
	public double caluloDePerimetro(Integer radio) {
		return ((this.pi * 2) * radio); 
	}
	
	
}
