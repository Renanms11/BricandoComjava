import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		Comparator<Aluno> comp = (aluno1,aluno2)->aluno1.getName().toUpperCase().compareTo(aluno2.getName().toUpperCase());
		Predicate<Aluno> pred = (aluno) -> aluno.getMedia()>7;
		Consumer<Aluno> cons =  aluno -> {
			
			aluno.setMedia(aluno.getMedia()+1);
		};

		Predicate<Integer> pred2 = (x) -> x <5;
			
		Integer[] listaarray = { 10, 4, 7, 5, 6, 7, 8, 6, 1, 2, 3, 5, 8, 4 };
		List<Integer> lista = new ArrayList<>(Arrays.asList(listaarray));

		
		Collections.sort(lista);
		lista.removeIf(pred2);
		
		
		
		
		// foreach metodo da lista
		//referencia a metodo
		lista.forEach(System.out::println);
		System.out.println("****************************************");
		
		lista.stream().map(x -> x+=10).collect(Collectors.toList());
		
		lista.forEach(System.out:: println);
		

	}

}
