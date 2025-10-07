
public class MiHilo extends Thread{
	
	
	public static void main(String[] args) {
		MiHilo hilo = new MiHilo();
		hilo.start();
		//hilo.run();
		System.out.println("Hola desde el hilo principal");
	}

	@Override
	public void run() {
		System.out.println("Hola desde mi hilo");
	}
	
	/*Pregunta: ¿Qué sucede si llamas a hilo.run() en lugar de hilo.start()? ¿Cuál es la diferencia?
	 *
	 *Respuesta: Cuando se llama a hilo.start(), se crea un nuevo hilo y llama internamente a el metodo run() dentro de ese hilo.
	 *Cuando se llama a hilo.run(), no se crea un nuevo hilo, solo se llama al metodo run() dentro del hilo principal.
	 */
}
