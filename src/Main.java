import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		
		imprimeFibonacciRecursivo(10);

	}

	
	
	  public static void imprimeFibonacciRecursivo(int n) {
	        for (int i = 0; i <= n; i++) {
	            System.out.print(fibonacciRecursivo(i) + " ");
	        }
	    }

	    public static int fibonacciRecursivo(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	        }
	    }
	

}
