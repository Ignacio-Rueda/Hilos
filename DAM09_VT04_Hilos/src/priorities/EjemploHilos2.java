package priorities;

public class EjemploHilos2 extends Thread {
	
	public void run(){
	Thread.currentThread();
	//Mostramos la información por pantalla
	  System.out.println("\n"+Thread.currentThread().toString()+
	  "\nDENTRO DEL HILO: " + Thread.currentThread().getName() +
	  "\n\tPrioridad: " + Thread.currentThread().getPriority() +
	  "\n\tID: " + Thread.currentThread().threadId() +
	  "\n\tHilos activos: " + Thread.activeCount());
	}
 }
