import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		System.out.print("Digite seu nome :");
	    String texto = read.nextLine();
		
		System.out.println(inverterString(texto));
		
	}
	
	
	public static String inverterString(String texto) {
		char[] chars = texto.toCharArray();
		char aux;
		int tamanho = chars.length;
		for(int i = 0 ; i < tamanho/2 ;i++) {
			aux =chars[tamanho-1-i];
			chars[tamanho-1-i] = chars[i];
			chars[i] = aux;
	
		}
		String textoJunto = new String(chars);
		
		
		return textoJunto;
	}

	

}
