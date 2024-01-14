import java.util.Locale;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		MinhaThread t = new MinhaThread("thread 1 ", 500);
		MinhaThread t2 = new MinhaThread("thread 2 ", 500);
		MinhaThread t3 = new MinhaThread("thread 3 ", 500);

		Thread thread = new Thread(t);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);

		thread.start();
		thread2.start();
		thread3.start();

		while (thread.isAlive() || thread2.isAlive() || thread3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Programa finalizado !! ");
		

	}

}
