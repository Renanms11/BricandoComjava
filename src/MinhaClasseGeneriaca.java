import java.util.List;

public class MinhaClasseGeneriaca <T>{
	
	private T objeto = null;
	private List<T> lista = null;
	
	public MinhaClasseGeneriaca(){
	}
	
	public MinhaClasseGeneriaca(T objeto){
		this.objeto = objeto;
		
	}
	
	
	

	public T getOjeto() {
		return objeto;
	}
	
	
	public void showTipo() {
		System.out.println("T tipo é " + this.objeto.getClass().getName());
	}
	
	public void setObjeto(T objetoNovo) {
	
		this.objeto = objetoNovo;
	}

}
