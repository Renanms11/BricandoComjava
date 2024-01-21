import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Janela extends JDialog  {

	JPanel janela = new JPanel(new GridBagLayout());
	JLabel label1 = new JLabel("Nome");
	JLabel label2 = new JLabel("Idade");
    
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("inciar");
	JMenuItem item1 = new JMenuItem("abri");
	JMenuItem item2 = new JMenuItem("Salvar");
	JMenuItem item3 = new JMenuItem("Sair");


	JTextField areaTexto = new JTextField();
	JTextField areaTexto2 = new JTextField();

	JButton botao = new JButton("Enviar");
	JButton botao2 = new JButton("Receber");

	public Janela() {

		setTitle("Programa que marca o tempo");
		setSize(new Dimension(460, 500));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.anchor = gbc.WEST;

		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		menuBar.setPreferredSize(new Dimension(0,30));
		menu.setPreferredSize(new Dimension(70,25));
		menu.add(item1);
		item1.setPreferredSize(new Dimension(70,25));
		item1.addActionListener(e -> showFileChooseOpen());
		menu.add(item2);
		item2.setPreferredSize(new Dimension(70,25));
		item2.addActionListener(e -> showFileChooseSave());

		menu.add(item3);
		item3.setPreferredSize(new Dimension(70,25));
        item3.addActionListener(e -> System.exit(0));
		

		menuBar.add(menu);
		this.setJMenuBar(menuBar);

		gbc.gridy++;
		
		label1.setPreferredSize(new Dimension(200, 25));
		label1.setFont(new Font("arial", Font.PLAIN, 16));
		janela.add(label1, gbc);

		gbc.gridy++;
		areaTexto.setPreferredSize(new Dimension(200, 25));
		janela.add(areaTexto, gbc);

		gbc.gridy++;
		label2.setPreferredSize(new Dimension(200, 25));
		label2.setFont(new Font("arial", Font.PLAIN, 16));
		janela.add(label2, gbc);

		gbc.gridy++;
		areaTexto2.setPreferredSize(new Dimension(200, 25));
		janela.add(areaTexto2, gbc);

		gbc.gridwidth--;
		gbc.gridy ++;

		janela.add(botao, gbc);
		botao.setPreferredSize(new Dimension(200, 25));
		botao.addActionListener(e -> System.out.println("print"));
		
		gbc.gridx ++;

		janela.add(botao2, gbc);
		botao2.setPreferredSize(new Dimension(200, 25));
		botao2.addActionListener(e -> System.out.println("olá mundo"));
		
		
		add(janela, BorderLayout.WEST);
		setVisible(true);
		
		

		
	}

	public void showFileChooseOpen() {

		JFileChooser fileChooser = new JFileChooser();

		int result = fileChooser.showOpenDialog(fileChooser);
		
		if (result == JFileChooser.APPROVE_OPTION) {
            // O usuário escolheu um arquivo
            System.out.println("Arquivo selecionado: " + fileChooser.getSelectedFile());
        } else if (result == JFileChooser.CANCEL_OPTION) {
            // O usuário cancelou a seleção
            System.out.println("Seleção cancelada");
        }
	}
	
	
	public void showFileChooseSave() {

		JFileChooser fileChooser2 = new JFileChooser();

		int result = fileChooser2.showSaveDialog(fileChooser2);
	}




	

	

}
