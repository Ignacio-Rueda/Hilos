package ejemplo0;

public class SaludoRunnable implements Runnable {
    private int numHilo;

    public SaludoRunnable(int numHilo) {
        this.numHilo = numHilo;
    }

    @Override
    public void run() {
        System.out.println("Arranca el hilo runnable " + numHilo);

        for (int i = 0; i<10; i++) {
            System.out.println("Hilo runnable " + numHilo + ": hola por vez numero " + (i+1));
        }

        System.out.println("Fin del hilo runnable " + numHilo);
    }
}
