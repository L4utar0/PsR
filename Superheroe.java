package es2025;

public class Superheroe {
	private String nombre;
	private String descripcion;
	private boolean capa;

	public Superheroe(String Nombre) {
		Nombre = nombre;
		descripcion = "";
		capa = false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean getCapa() {
		return capa;
	}
	public void setCapa(Boolean capa) {
		this.capa = capa;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + "\nDescripcion: " + getDescripcion() + "\nTiene Capa? " + getCapa();
	}
}
