package atletas;

import java.util.Random;

public class Atleta extends Thread {
	
    private String nombre;
    private int distanciaRecorrida;

    public Atleta(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }
    
    public void run() {
        Random distancia = new Random();
        int distanciaMeta = 100;

        while (distanciaRecorrida < distanciaMeta) {
            int metrosAvanzados = distancia.nextInt(11); // Genera un número aleatorio entre 0 y 10.
            distanciaRecorrida += metrosAvanzados;

            if (distanciaRecorrida > distanciaMeta) {
                distanciaRecorrida = distanciaMeta;
            }

            System.out.println(nombre + " ha recorrido " + distanciaRecorrida + " metros.");
        }

        System.out.println(nombre + " ha cruzado la línea de meta.");
    }

}
