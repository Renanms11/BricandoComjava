
public class Aluno implements Comparable<Aluno>{
	private String name;
	private String CPF;
	private String RG;
	
	
	@Override
	public int compareTo(Aluno other) {
		
		return this.CPF.compareToIgnoreCase(other.CPF);
	}

}
