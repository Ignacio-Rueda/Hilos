package HiloNumeroLetra;

public class Main {
	public static void main(String args[]) {
		
		HiloNumeroLetra h1 = new HiloNumeroLetra(1);
		HiloNumeroLetra h2 = new HiloNumeroLetra(2);

		//Aunque podr�amos hacer un h1.run, lo aconsejable es que lo haga desde el propio hilo porque tiene el m�todo start as� como otro m�todos
		
		//Crear un hilo
		
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		
		t1.start();
		t2.start();
		
	}
}
