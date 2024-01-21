import java.util.Locale;
import java.util.Scanner;

class Main {
	public static int i = 0;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		
		Integer x =20;
		
	 MinhaClasseGeneriaca<Integer> minhaclasse = new MinhaClasseGeneriaca<Integer>(x);
	 minhaclasse.showTipo();

	
	}
}
