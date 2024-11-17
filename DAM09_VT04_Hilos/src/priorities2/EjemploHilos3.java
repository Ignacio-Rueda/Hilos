package priorities2;

public class EjemploHilos3 extends Thread {
	
	public void run(){
	//Mostramos la información por pantalla
	  System.out.println(
	  "DENTRO DEL HILO: " + Thread.currentThread().getName() +
	  "\n\tPrioridad: " + Thread.currentThread().getPriority() +
	  "\n\tID: " + Thread.currentThread().threadId() +
	  "\n\tHilos activos: " + Thread.currentThread().activeCount());
	}
 }
