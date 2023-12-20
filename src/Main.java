import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		int[] numeros = { 10, 2, 3, 45, 9, 4, 31, 1, 9, 482, };
		int [] numerosOrdenados= ordenarLista(numeros);
		for(int i =0 ; i < numerosOrdenados.length;i++) {
			System.out.println(numerosOrdenados[i]);
		}
		 
		
	}

	public static int[] ordenarLista(int[] lista) {
		int aux = 0;
		for (int i = 0; i < lista.length - 1; i++) {
			for (int ii = 0; ii < lista.length - 1; ii++) {
				if (lista[ii] > lista[ii + 1]) {
					aux = lista[ii + 1];
					lista[ii + 1] = lista[ii];
					lista[ii] = aux;
				}

			}
		}
		return lista;

	}

}
