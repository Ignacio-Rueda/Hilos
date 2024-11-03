package DiscoDuroRoerContadoresYjoin;

public class Contador implements Runnable {
	private int contador;
	private String nombre;
	private int limite;
	
	public Contador(String nombre,int limite) {
		this.nombre = nombre;
		this.limite = limite;
		this.contador = 0;
	}
	
	@Override
	public void run() {
		
		while(contador < limite) {
			System.out.println("Hilo "+this.nombre+": "+contador);
			contador++;
		}
		System.out.println("Hilo "+this.nombre+" ya ha acabado");
		
	}

}
