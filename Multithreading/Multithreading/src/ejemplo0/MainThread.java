package ejemplo0;

public class MainThread {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            SaludoThread saludoThread = new SaludoThread(i+1);
            saludoThread.start();
        }
    }
}
