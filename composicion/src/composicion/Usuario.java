package composicion;

public class Usuario {
	private String nombre;
	private String apellido;
	private double dni;
	private int edad;
	
	public Usuario(String nombre, String apellido, double dni, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;	
		this.edad = edad;	
	}
	
	public String mostrarNombre() {
		return this.nombre;
	}
	
	public String mostrarApellido() {
		return this.apellido;
	}
	
	public double mostrarDni() {
		return this.dni;
	}
	
	public double mostrarEdad() {
		return this.edad;
	}
	
	public void modificarEdad(int edad) {
		this.edad = edad;
	}
	

}
