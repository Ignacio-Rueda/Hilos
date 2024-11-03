package DiscoDuroRoerContadoresYjoin;

public class Main {

	public static void main(String[] args) {
		
		Contador c1 = new Contador("Contador 1",40);
		Contador c2 = new Contador("Contador 2",50);
		Contador c3 = new Contador("Contador 3",20);
		Contador c4 = new Contador("Contador 4",70);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		/*
		 * Cuando llamas a join() en un hilo, el hilo que lo invoca se pausa y espera
		 * a que el hilo en el que se llamó termine su ejecución.
		 * En este caso tenemos 5 hilos, los 4 que hemos creado + el principal
		 * */
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin del programa");
	}

}
