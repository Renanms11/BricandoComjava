
public class MinhaClasseGeneriaca <T>{
	
	private T objeto = null;
	
	
	public MinhaClasseGeneriaca(T objeto){
		this.objeto = objeto;
	}
	
	public MinhaClasseGeneriaca(){
	}
	
	public T getOjeto() {
		return objeto;
	}
	
	
	public void showTipo() {
		System.out.println("T tipo é " + this.objeto.getClass().getName());
	}
	
	public void setObjeto(T objetoNovo) {
	
		this.objeto = objeto;
	}

}
