
public class Sinal  {
	
	Thread t = null;
	static Integer coresDoSina;
	String nome;
	int tempo;
	
	public void Sinal(String nome , int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		
		
	}
	
	
	
	public synchronized void sinalVerde(int x){
		
		if(coresDoSina == 1) {
			System.out.println("SINAL VERDE");
		}
		
		try {
			Thread.sleep(x);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coresDoSina = 2;
		  notify();
		  
		  
		  while(coresDoSina != 1) {
			  try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		
	}
	
	
public synchronized void sinalAmarelo(int x){
		
		if(coresDoSina == 2) {
			System.out.println("SINAL AMARELO");
		}
		
		try {
			Thread.sleep(x);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coresDoSina = 3;
		  notify();
		  
		  
		  while(coresDoSina != 2) {
			  try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  
		  
		  public synchronized void sinalVermelho(int x){
				
				if(coresDoSina == 3) {
					System.out.println("SINAL AMARELO");
				}
				
				try {
					Thread.sleep(x);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				coresDoSina = 3;
				  notify();
				  
				  
				  while(coresDoSina != 3) {
					  try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
		
	}



	
	
	
	
	
	

}
