package saludo;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
    	List<SaludoThread> listaSaludos = new ArrayList<>();
        for (int i = 0; i<5; i++) {
            SaludoThread saludoThread = new SaludoThread(i+1);
            saludoThread.start();
            listaSaludos.add(saludoThread);
         //   saludoThread.join(); // espera a que el hilo acabe
        }
           
        for(Thread saludo : listaSaludos) {
        	saludo.join();
        }   
        
        System.out.println("Fin de la ejecución del programa");
    }
}
