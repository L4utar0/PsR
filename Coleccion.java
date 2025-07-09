package es2025;

import java.util.ArrayList;

public class Coleccion {
	private String nombreColeccion;
	private ArrayList<Figura> listaFiguras;
	
	public Coleccion(String nombreColeccion) {
		super();
		this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
	}
	
	public String getNombreColeccion() {
		return nombreColeccion;
	}
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	
	public void aniadirFigura(Figura Fig) {
		listaFiguras.add(Fig);
	}
	
    public void subirPrecio(double cantidad, String id) {
        for (Figura figura : listaFiguras) {
            if (figura.getCodigo().equals(id)) {
                figura.setPrecio(cantidad);
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Colección: ").append(nombreColeccion).append("\n");
        sb.append("Figuras en la colección:\n");
        for (Figura figura : listaFiguras) {
            sb.append(figura.toString()).append("\n\n");
        }
        return sb.toString();
    }
    
    public String conCapa() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figuras con capa en la colección ").append(nombreColeccion).append(":\n");
        for (Figura figura : listaFiguras) {
            if (figura.getSuperheroe().getCapa()) {
                sb.append(figura.toString()).append("\n\n");
            }
        }
        return sb.toString();
    }

    public Figura masValioso() {
        if (listaFiguras.isEmpty()) {
            return null;
        }
        
        Figura masValor = listaFiguras.get(0);
        for (Figura figura : listaFiguras) {
            if (figura.getPrecio() > masValor.getPrecio()) {
            	masValor = figura;
            }
        }
        return masValor;
    }

    public double getValorColeccion() {
        double total = 0;
        for (Figura figura : listaFiguras) {
            total += figura.getPrecio();
        }
        return total;
    }

    public double getVolumenColeccion() {
        double volumenTotal = 200;
        for (Figura figura : listaFiguras) {
            volumenTotal += figura.getDimension().getVolumen();
        }
        return volumenTotal;
    }

}
