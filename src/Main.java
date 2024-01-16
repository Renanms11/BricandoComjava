import java.util.Locale;
import java.util.Scanner;

class Main {
	public static int i = 0;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		final String lock1 = "Recurso 1";
		final String lock2 = "Recurso 2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 1 bloqueou recurso 1");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
					System.out.println("Thread 1 tentando acessar o recurso 2");
					
					synchronized (lock2) {
						System.out.println("Thread 1 bloqueou recurso 2");
					}
				}
			}
		};
		
		
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (lock2) {
					System.out.println("Thread 2 bloqueou recurso 2");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
					
					System.out.println("Thread 2 tentando acessar o recurso 1");
					synchronized (lock1) {
						System.out.println("Thread 2 bloqueou recurso 1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
