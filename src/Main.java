import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		
		boolean da;
		
		
		MinhaClasseGeneriaca<Double> objdouble = new MinhaClasseGeneriaca<>(1.5);
		MinhaClasseGeneriaca<Float> objfloat= new MinhaClasseGeneriaca<>(1.5f);

		System.out.println(objdouble.isAbsu(objfloat));
				
	
	}
}
