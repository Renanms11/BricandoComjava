import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Main {
	static int tempo = 0, i;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		Timer timer = new Timer();

		TimerTask tt = new TimerTask() {

			@Override
			public void run() {
				i++;
				System.out.println("ola mundo " + i);
				tempo++;
				if (tempo == 10) {
					cancel();
					timer.cancel();
					
				}

			}
		};


		timer.scheduleAtFixedRate(tt, 500, 1000);
	

		System.out.println("fim do programa !!!");

	}
}
