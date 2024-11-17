package priorities;
public class Main extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread.currentThread().setName("Principal");
		System.out.println(Thread.currentThread().toString());
		int numHilosCreados = 3;
			
		EjemploHilos2 h = null;
				for(int i = 0; i<numHilosCreados ; i++){
				 h = new EjemploHilos2(); //crear Hilo
				 h.setName("Hilo"+i ); //damos nombre al hilo
				 h.setPriority(i+1); //damos prioridad al hilo
				 h.start(); //iniciamos el hilo
				}
		
		System.out.println(numHilosCreados+" hilos creados...");
		System.out.println("Hilos activos:" + Thread.activeCount());

	}

}
