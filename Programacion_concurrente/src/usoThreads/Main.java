package usoThreads;

public class Main {
	
	public static void main(String args[]) {
		
		Thread hilo = new Proceso("proceso 1");
		Thread hilo2 = new Proceso("proceso 2");
		
		//Iniciar nuestros procesos
		hilo.start();
		hilo2.start();
		
	}

}
