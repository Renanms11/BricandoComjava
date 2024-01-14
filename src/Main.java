import java.util.Locale;
import java.util.Scanner;

import com.azul.crs.runtime.utils.PackedDataEntriesMap.Entry;

class Main {

	public static void main(String[] args)  {

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

/*
		try {
			// as thread 2 e3 e a principal so vamo comecar quando a thread1 acabar ou passar 200 mili segundos

			thread.join(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// as thread 3 e a principal so vamo comecar quando a thread2 acabar
			
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		try {
			thread.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

		System.out.println("Programa finalizado !! ");

	}

}
