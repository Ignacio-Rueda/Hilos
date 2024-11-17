package atletas;

public class Main extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.out.println("La carrera ha comenzado.");
		Atleta[] atletas = new Atleta[10];

        for (int i = 0; i < 10; i++) {
            atletas[i] = new Atleta("Atleta " + (i + 1));
            atletas[i].start();
        }
        
        for(Thread atleta:atletas) {
        	atleta.join();
        }

        System.out.println("La carrera ha finalizado.");

	}

}
