import java.awt.desktop.ScreenSleepEvent;

public class MinhaThread implements Runnable {
	String nome;
	int tempo;



	public MinhaThread(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		//Thread t = new Thread(this);
		//t.start();
	}



	@Override
	public void run() {
		try {
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(nome + " " + (i+1));
			Thread.sleep(tempo);
			
		}
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(nome + "Terminou a execução");
		}

	}


