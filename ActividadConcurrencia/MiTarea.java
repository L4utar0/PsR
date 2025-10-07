
public class MiTarea implements Runnable{

	public static void main(String[] args) {
		MiTarea obj = new MiTarea();
		Thread hilo = new Thread(obj);
		hilo.start();
		System.out.println("Hola desde el hilo principal");
	}

	public void run() {
		System.out.println("Hola desde mi tarea con runnable");
	}
	
	/*Pregunta: ¿Cuál es la principal ventaja de usar Runnable en lugar de extender Thread?
	 *
	 *Respuesta: La principal ventaja de usar Runnable es que no ocupa la herencia ya que en JAVA no existe la herencia multiple lo que
	 *permite una mayor reutilizacion.
	 */
}
