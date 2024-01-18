
public class Semaforo implements Runnable {

	public boolean isRunning = true;
	private static Cores coresDoSinal = null;
	Thread t = null;

	public Semaforo() {
		coresDoSinal = Cores.VERMELHO;
		t = new Thread(this);

	}

	@Override
	public void run() {
		while (isRunning) {
			try {
				if (coresDoSinal == Cores.VERMELHO) {
					System.out.println("VERMELHO VERMELHO VERMELHO");
					System.out.println();
					System.out.println();
					Thread.sleep(3000);
					TrocaDeCor();

				} else if (coresDoSinal == Cores.VERDE) {
					System.out.println("VERDE VERDE VERDE");
					System.out.println();
					System.out.println();
					Thread.sleep(1500);
					TrocaDeCor();

				} else if (coresDoSinal == Cores.AMARELO) {
					System.out.println("AMARELO AMARELO AMARELO");
					System.out.println();
					System.out.println();
					Thread.sleep(3000);
					TrocaDeCor();

				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public void stop() {
		isRunning = false;
	}

	public void TrocaDeCor() {
		switch (coresDoSinal) {

		case VERDE:
			coresDoSinal = Cores.AMARELO;
			break;
		case AMARELO:
			coresDoSinal = Cores.VERMELHO;
			break;
		case VERMELHO:
			coresDoSinal = Cores.VERDE;
			break;

		}

	}

}
