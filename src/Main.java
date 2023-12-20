
public class Main {

	public static void main(String args[]) {

		System.out.println(fatorial(5));
		
		
	}

	
	
	
	public static int fatorial(int x) {
       int fat = 1;
       for(int i = x ; i > 0 ;i--) {
    	   fat  *=i;
    	   
       }
       return fat;
	
	}

}
