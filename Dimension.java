package es2025;

public class Dimension {
	private double alto;
	private double ancho;
	private double profundidad;
	
	public Dimension() {
		super();
	}

	public Dimension(double alto, double ancho, double profundidad) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}


	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	public double getVolumen() {
		return alto * ancho * profundidad;
	}
	
    @Override
    public String toString() {
        return "Dimensiones:" +
               "\n  Alto: " + alto +
               "\n  Ancho: " + ancho +
               "\n  Profundidad: " + profundidad +
               "\n  Volumen: " + getVolumen();
    }
}
