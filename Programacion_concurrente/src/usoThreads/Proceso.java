package usoThreads;

public class Proceso extends Thread {

	public Proceso(String msg) {
		super(msg);
	}
	
	
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i+this.getName());
		}
	}
}
