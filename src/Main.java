import java.util.Locale;
import java.util.Scanner;

class Main {
	public static int i = 0;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		MinhaThread tt = new MinhaThread("thread1");
		MinhaThread tt2 = new MinhaThread("thread2");
		
		tt.suspend();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tt2.suspend();

		tt.resume();

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tt2.resume();
		
		
		tt2.stop();

	}

}
