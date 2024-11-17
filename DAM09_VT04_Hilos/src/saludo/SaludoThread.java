package saludo;

public class SaludoThread extends Thread {

    private int numHilo;

    public SaludoThread(int numHilo) {
        this.numHilo = numHilo;
    }

    @Override
    public void run() {
        System.out.println("Arranca el hilo " + numHilo);

        for (int i = 0; i<10; i++) {
            System.out.println("Hilo " + numHilo + ": hola por vez numero " + (i+1));
        }

        System.out.println("Fin del hilo " + numHilo);
    }
}
