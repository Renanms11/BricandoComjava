import java.util.Locale;
import java.util.Scanner;

class Main {
	public static int i = 0;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		Semaforo sem = new Semaforo();
		
		
		sem.t.start();
		
	  try{
		  Thread.sleep(100000);
		  sem.stop();
		  
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	 
	  System.out.println("FIM DO PROGRAMA !!");

	}

}
