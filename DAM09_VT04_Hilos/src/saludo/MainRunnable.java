package saludo;

public class MainRunnable {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<5; i++) {
            SaludoRunnable saludoRunnable = new SaludoRunnable(i+1);
            Thread thread = new Thread(saludoRunnable);
            thread.start();
            ///thread.join(); // espera a que el hilo acabe
        }
        System.out.println("Fin de la ejecución del programa");
        }
}
