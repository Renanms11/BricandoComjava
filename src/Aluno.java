
public class Aluno {
	
	
	private String name;
	private String CPF;
	private String RG;
	private Integer media;
	
	
	
	public Aluno(String name, String cPF, String rG) {
		super();
		this.name = name;
		CPF = cPF;
		RG = rG;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public Integer getMedia() {
		return media;
	}
	public void setMedia(Integer media) {
		this.media = media;
	}
	

	

	
	
	
	

}
