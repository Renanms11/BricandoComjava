import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		System.out.println(fatorial(6));
		

	}

	
	
	
	
	public static int fatorial(int x){
		if(x == 0 || x == 1) {
			return 1;
		}
		return x*fatorial(x-1);
		
	}
	

}
