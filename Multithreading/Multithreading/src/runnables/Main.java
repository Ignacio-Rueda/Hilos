package runnables;

public class Main {
    public static void main(String[] args) {
        MiHiloRunnable miHiloRunnable = new MiHiloRunnable("H1");

        Thread miThread = new Thread(miHiloRunnable);
        miThread.start();
    }

}
