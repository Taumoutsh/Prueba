package Prueba;

public class Prueba {

	private String nombre;
	private String appellido;
	
	public Prueba() {
		
	}
	
	public Prueba(String nombre, String appellido)
	{
		this.appellido = appellido;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setNombre(String nombre){
		
		this.nombre = nombre;
		
	}
	
	public String getAppellido() {
		
		return appellido;
		
	}
	
	public void setAppellido(String appellido){
		
		this.appellido = appellido;
		
	}
	
	public String getNombreCompleto() {
		return nombre+" "+appellido;
	}
	
	public static void main(String args[]) {
		
		Prueba p = new Prueba("Thomas", "SINAN");
		
		System.out.println(p.getNombreCompleto());
		
		
	}
	
	
}
