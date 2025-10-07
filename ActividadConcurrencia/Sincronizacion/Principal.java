package sincronizacion;

public class Principal {

    public static void main(String[] args) {
        Contador contador = new Contador();

        Incrementador[] hilos = new Incrementador[5];

        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Incrementador(contador);
            hilos[i].start();
        }

        for (Incrementador h : hilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Valor final del contador: " + contador.getValor());
    }

    /*Pregunta: ¿Por qué synchronized resuelve el problema? ¿Qué es lo que bloquea exactamente?
     * 
     *Respuesta: syncronized resuelve el problema al bloquear el acceso concurrente al metodo. Cuando un hilo entra en el metodo, bloquea el
     *objeto y ningun otro hilo puede ejecutar el metodo sobre la misma instancia hasta que el hilo actual termine y libere el bloqueo.
     */
}
