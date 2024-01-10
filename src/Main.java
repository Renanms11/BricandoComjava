import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		String [] nomes = {"Romeo miranda Sena","Enzo miranda sena","Renan Miranda sena","Katianny maia oliveria miranda " 
				            , "Kamila miranda Sena " , "Francisco de Assis Queiros de Sena", "Francimar miranda de moraes sena"};
		String path = "C:\\Users\\renan\\OneDrive\\Área de Trabalho\\Programas\\meuTexto.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for(String nome : nomes) {
				bw.write(nome);
				bw.newLine();
			}
			bw.close();
			

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
			

		} catch (IOException e) {
			e.printStackTrace();

		} 
		

	}

}
