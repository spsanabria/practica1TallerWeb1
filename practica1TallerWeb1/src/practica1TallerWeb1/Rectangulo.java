package practica1TallerWeb1;

public class Rectangulo {
	Integer base;	
	Integer altura;
	Integer area;
	Integer perimetro;

	public void setBase(Integer base) { 
		this.base = base; 
	}

	public void setAltura(Integer altura) { 
		this.altura = altura; 
	}
	
	public Integer calculodeArea() {
		if(this.base == this.altura) {
			 area = this.base * this.base;			
		} else {
			area = this.base * this.altura;						
		}
		
		return area;
	}

	public Integer calculodePerimetro() {
		if(this.base == this.altura) {
			perimetro = ((this.base*2) + (this.base*2));			
		} else {
			perimetro = ((this.base * 2) + (this.altura * 2));						
		}
		
		return perimetro;
	}

	
}
