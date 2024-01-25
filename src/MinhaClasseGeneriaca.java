import java.util.List;

public class MinhaClasseGeneriaca <T,K>{
	
	private T objeto = null;
	private K objeto2 =null;
	private List<T> lista = null;
	
	public MinhaClasseGeneriaca(){
	}
	
	public MinhaClasseGeneriaca(T objeto,K objeto2){
		this.objeto = objeto;
		this.objeto2 = objeto2;

		
	}
	
	
	

	public T getOjeto() {
		return objeto;
	}
	public K getOjeto2() {
		return objeto2;
	}
	
	
	public void showTipo() {
		System.out.println("T tipo é " + this.objeto.getClass().getName());
		System.out.println("K tipo é " + this.objeto2.getClass().getName());
	}
	
	public void setObjeto(T objetoNovo) {
	
		this.objeto = objetoNovo;
	}
	
	public void setObjeto2(K objetoNovo2) {
		
		this.objeto2 = objetoNovo2;
	}

}
