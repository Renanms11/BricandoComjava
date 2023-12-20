
public class Main {

	public static void main(String args[]) {

		fibonacci(15);

	}

	public static void fibonacci(int x) {
		int aux, a = 0, b = 1;

		for (int i = 0; i < x; i++) {
			System.out.print(a + " ");
			aux = b;
			b += a;
			a = aux;

		}

	}

}
