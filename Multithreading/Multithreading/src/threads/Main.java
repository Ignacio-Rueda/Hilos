package threads;

public class Main {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo("H2");
        // Le indico al hilo que puede iniciarse
        hilo.start();
    }
}
