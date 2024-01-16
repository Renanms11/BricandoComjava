import java.util.Locale;
import java.util.Scanner;

class Main {
	public static int i = 0;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		MinhaThread tt = new MinhaThread();

		ThreadTiqueTaque tique = new ThreadTiqueTaque("tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("taque", tt);

		try {

			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
