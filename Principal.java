package es2025;

public class Principal {

	public static void main(String[] args) {
		
        Superheroe batman = new Superheroe("Batman");
        batman.setDescripcion("Caballero oscuro de Gotham");
        batman.setCapa(true);
        
        Superheroe superman = new Superheroe("Superman");
        superman.setDescripcion("El hombre de acero de Krypton");
        superman.setCapa(true);
        
        Superheroe spiderman = new Superheroe("Spiderman");
        spiderman.setDescripcion("El trepamuros de Nueva York");
        spiderman.setCapa(false);
        
        //Dimensiones
        Dimension dim1 = new Dimension(30, 15, 10);
        Dimension dim2 = new Dimension(25, 12, 8);
        Dimension dim3 = new Dimension(20, 10, 5);
        
        //Figuras
        Figura fig1 = new Figura("El Hombre murcielago", "BAT001", 49.99, dim1, batman);
        Figura fig2 = new Figura("El Hombre de acero", "SUP001", 59.99, dim2, superman);
        Figura fig3 = new Figura("El Hombre araña", "SPI001", 39.99, dim3, spiderman);
        
        //Colecciones
        //Creacion de coleccion
        Coleccion coleccionHeroes = new Coleccion("Héroes Legendarios");
        
        //Añadir figuras a la coleccion
        coleccionHeroes.aniadirFigura(fig1);
        coleccionHeroes.aniadirFigura(fig2);
        coleccionHeroes.aniadirFigura(fig3);
        
        //Mostrar información
        System.out.println(coleccionHeroes.toString());
        System.out.println(coleccionHeroes.conCapa());
        
        //Subir precio de una figura
        coleccionHeroes.subirPrecio(10, "BAT001");
        
        //Mostrar figura más valiosa
        Figura masCara = coleccionHeroes.masValioso();
        System.out.println("La figura más valiosa es:\n" + masCara.toString());
        
        //Mostrar valor total de la colección
        System.out.println("Valor total de la colección: " + coleccionHeroes.getValorColeccion() + "$");
        
        //Mostrar volumen total de la colección
        System.out.println("Volumen total aproximado de la colección: " + coleccionHeroes.getVolumenColeccion() + " cm³");
	}

}
