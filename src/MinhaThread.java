import java.awt.desktop.ScreenSleepEvent;

public class MinhaThread implements Runnable {
	private String nome;
	private int[] numes;
	private static Calculadora calc = new Calculadora();

	public MinhaThread(String nome, int[] numes) {
		super();
		this.nome = nome;
		this.numes = numes;
		new Thread(this, nome).start();
		;
	}

	@Override
	public void run() {
		System.err.println(this.nome + " iniciada ");
		int soma = calc.soma(numes);
		System.out.println("resultado da soma é : " + soma);
		System.out.println(this.nome + " finalizada ");
	}

}
