package DiscoDuroRoerHiloNumeroLetra;

public class Main {

	public static void main(String[] args) {
		HiloNumeroLetra h1 = new HiloNumeroLetra(1);
		HiloNumeroLetra h2 = new HiloNumeroLetra(2);

		// Para crear un hilo, se crea un objeto de la clase thread y se le pasa como
		// parámetro 'algo' que implemente runnable
		System.out.println("INICIAMOS");
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		// Iniciamos hilos, ejecutarán el método run
		// Cada uno va a tener su ejecución
		t1.start();
		t2.start();
	}

}
