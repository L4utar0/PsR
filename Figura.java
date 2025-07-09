package es2025;

public class Figura extends Superheroe{

	private String codigo;
	private double precio;
	private Dimension dimension;
	private Superheroe superheroe;

	
	public Figura(String Nombre, String codigo, double precio, Dimension dimension, Superheroe superheroe) {
		super(Nombre);
		this.codigo = codigo;
		this.precio = precio;
		dimension.setAlto(0);
		dimension.setAncho(0);
		dimension.setProfundidad(0);
		this.superheroe = superheroe;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }
    
    @Override
    public String toString() {
        return "Figura:" +
               "\nCódigo: " + codigo +
               "\nPrecio: " + precio + "$" +
               "\n" + superheroe.toString() +
               "\n" + dimension.toString();
    }
}
