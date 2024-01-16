import java.awt.desktop.ScreenSleepEvent;

public class MinhaThread {

	public boolean tique;

	public synchronized void tique(boolean estaExecutando) {

		if (!estaExecutando) {

			tique = true;
			notify();
			return ;
		}
		
		System.out.print("Tique ");
		tique = true;
		notify();
		
		while(tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public synchronized void taque(boolean estaExecutando) {

		if (!estaExecutando) {

			tique = false;
			notify();
			return ;
		}
		
		System.out.println("Taque");
		tique = false;
		notify();
		
		while(!tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
