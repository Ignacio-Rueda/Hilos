package Contador;

public class Main {
	
	
	public static void main(String args[]) {
		
		Contador hilo1 = new Contador("1",30);
		Contador hilo2 = new Contador("2",40);
		Contador hilo3 = new Contador("3",20);
		Contador hilo4 = new Contador("4",10);
		Contador hilo5 = new Contador("5",60);
		
		
		
		Thread t1 = new Thread(hilo1);
		Thread t2 = new Thread(hilo2);
		Thread t3 = new Thread(hilo3);
		Thread t4 = new Thread(hilo4);
		Thread t5 = new Thread(hilo5);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		//Con el join conseguimos que se espere el programa
		//Si quit�semos estos join, lo primero que se ejecutar�a, ser�a la sentencia de "FIN DEL PROGRAMA"
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
	}
}