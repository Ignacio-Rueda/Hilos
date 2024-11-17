package ejemplo0;

public class MainRunnable {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            SaludoRunnable saludoRunnable = new SaludoRunnable(i+1);
            Thread thread = new Thread(saludoRunnable);
            thread.start();
        }
    }
}
