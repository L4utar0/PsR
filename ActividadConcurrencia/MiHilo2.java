
public class MiHilo2 extends Thread{
    private final int id;

    public static void main(String[] args) {
        int numHilos = 5;
        MiHilo2[] hilos = new MiHilo2[numHilos];

        for (int i = 0; i < numHilos; i++) {
            hilos[i] = new MiHilo2(i + 1);
            hilos[i].start();
        }

        for (MiHilo2 h : hilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Todos los hilos terminaron.");
    }
    
    public MiHilo2(int id) {
        this.id = id;
        this.setName("MiHilo2-" + id);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " — iteración " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrumpido");
            Thread.currentThread().interrupt();
        }
    }
    
    /*Pregunta: ¿El orden de las salidas siempre es el mismo? ¿Por qué sí o por qué no?
     * 
     *Respueta: El orden de las salidas no es siemprer el mismo. Esto se debe a que hilos se ejecutan al mismo tiempo y el Sistema Operativo
     *y la JVM no determinan las ejecuciones, lo que provoca que algunos hilos se ejecuten antes que otros de forma impredecible.
     */
}
