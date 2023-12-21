import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		int[] listaDesordenada = { 5, 2, 3, 1, 48, 4, 6, 5, 9, 11 };

		// int [] listaDesordenada = new int[10];
		/*
		 * for(int i = 0 ; i<listaDesordenada.length ; i++) {
		 * System.out.println("digite o primeiro valor :"); listaDesordenada[i]=
		 * read.nextInt(); }
		 */

		selectionSort(listaDesordenada);

		for (int i = 0; i < listaDesordenada.length ; i++) {
			System.out.print(listaDesordenada[i] + " ");

		}

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

}
