
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String args[]) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		Thread t = new Thread("number 1")  {
			public void run() {
				System.out.print("ola");
			}
		};
		Thread t2 = new Thread(thread2);
		t.start();
		t2.start();

	}
	
	
	
	public static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			System.out.print(" mundo ");
			
			
		}
		
	};

}
