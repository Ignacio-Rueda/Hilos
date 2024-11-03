package DiscoDuroRoerHiloNumeroLetra;

public class HiloNumeroLetra implements Runnable {

	private int tipo;

	public HiloNumeroLetra(int tipo) {
		this.tipo = tipo;
	}

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
				for (char i = 'a'; i < 'z'; i++) {
					System.out.println(i);
				}
				break;

			}
		}

	}

}
