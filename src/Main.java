
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String args[]) throws IOException   {
		 Locale.setDefault(Locale.US);
		 Scanner read = new Scanner(System.in);
		 String path = "res/dog.png";
		 File imagem = new File(path);
		 BufferedImage bimagem =  ImageIO.read(imagem);
		 
		    BufferedImage imagemCinza = converterParaCinza(bimagem);

            // Salvar a nova imagem em tons de cinza
            File arquivoImagemCinza = new File("res/imagem_cinza.jpg");
            ImageIO.write(imagemCinza, "jpg", arquivoImagemCinza);
	
	

	}
	
	
	 private static BufferedImage converterParaCinza(BufferedImage imagem) {
	        int largura = imagem.getWidth();
	        int altura = imagem.getHeight();

	        // Criar uma nova imagem em tons de cinza
	        BufferedImage imagemCinza = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

	        // Iterar sobre todos os pixels da imagem original
	        for (int y = 0; y < altura; y++) {
	            for (int x = 0; x < largura; x++) {
	                // Obter o valor RGB do pixel
	                int rgb = imagem.getRGB(x, y);

	                // Calcular a média dos componentes de cor
	                int media = calcularMedia(rgb);

	                // Criar novo valor RGB usando a média
	                int novoRgb = (media << 16) | (media << 8) | media;

	                // Definir o novo valor RGB na imagem em tons de cinza
	                imagemCinza.setRGB(x, y, novoRgb);
	            }
	        }

	        return imagemCinza;
	    }

	    // Método auxiliar para calcular a média dos componentes de cor
	    private static int calcularMedia(int rgb) {
	        int red = (rgb >> 16) & 0xFF;
	        int green = (rgb >> 8) & 0xFF;
	        int blue = rgb & 0xFF;

	        // Calcular a média dos componentes de cor
	        return (red + green + blue) / 3;
	    }
	}



