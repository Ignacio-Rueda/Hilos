package Contador;

public class Contador implements Runnable {
	/**
	 * Crea una clase llamada Contador que contenga un atributo que sea el nombre del hilo y otro que sea el l�mite del contador, es
	 * decir, d�nde acabar.
	 * 
	 * Crea varios contadores y ejec�talos.
	 */

	private String nombreHilo;
	private int limiteContador;

	public Contador(String nombreHilo, int limiteContador) {
		this.nombreHilo = nombreHilo;
		this.limiteContador = limiteContador;
	}

	@Override
	public void run() {
		for (int i = 0; i < limiteContador; i ++) {
			System.out.println("Hilo -> "+nombreHilo+" "+i);
		}
		
		System.out.println("HILO: "+nombreHilo+" FINALIZADO");
	}

}
