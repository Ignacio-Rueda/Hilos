package HiloNumeroLetra;

import java.util.Iterator;

/*
 * Si queremos que sea un hilo podemos hacerlo de dos formas
 * -extends Thread
 * -implements Runnable
 * */
public class HiloNumeroLetra implements Runnable {
	private int tipo;

	public HiloNumeroLetra(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * Ejecuta el código cuando inicia el hilo
	 */
	@Override
	public void run() {

		while (true) {
			switch (tipo) {
			case 1:
				for (int i = 0; i < 30; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				for (char c='a';c<'z';c++) {
					System.out.println(c);
				}
				break;

			}
		}

	}

}
