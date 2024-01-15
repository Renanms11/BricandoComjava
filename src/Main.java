import java.util.Locale;
import java.util.Scanner;


class Main {

	public static void main(String[] args)  {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		
		int[] nums = {1,2,3,4,5};

		MinhaThread minhaThread  = new MinhaThread("# 1" , nums);
		MinhaThread minhaThread2 = new MinhaThread("# 2" , nums);


	}

}
