import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		
		MinhaClasseGeneriaca<String, Integer> minhag = 
				new MinhaClasseGeneriaca<String, Integer>("Renan miranda Sena",35);
		
		
		System.out.println(minhag.getOjeto() + " " + minhag.getOjeto2());
				
	
	}
}
