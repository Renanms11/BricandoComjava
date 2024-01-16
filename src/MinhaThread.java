import java.awt.desktop.ScreenSleepEvent;

public class MinhaThread implements Runnable {

	private boolean estaSuspensa, foiTerminada;
	String nome;
	Thread t = null;

	public MinhaThread(String nome) {
		this.nome = nome;
		this.estaSuspensa = false;
		t = new Thread(this, nome);
		t.start();
	}

	@Override
	public void run() {
		System.err.println("Execuntando " + this.nome);
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(this.nome + " " + i);
				Thread.sleep(300);
				synchronized (this) {
					while (estaSuspensa) {
						wait();
					}
					if(this.foiTerminada) {
						break;
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(this.nome + " Thread finalizada");

	}
	
	public synchronized void suspend() {
		this.estaSuspensa = true;
		notify();
	}
	public synchronized void resume() {
		this.estaSuspensa = false;
		notify();
	}
	public synchronized void stop() {
		this.foiTerminada = true;
		notify();
	}
}
