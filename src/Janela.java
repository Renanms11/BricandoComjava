import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JDialog {
	JPanel janela = new JPanel(new GridBagLayout());
	JLabel label1 = new JLabel("Nome");
	JLabel label2 = new JLabel("Idade");
	JTextField areaTexto = new JTextField();
	JTextField areaTexto2 = new JTextField();


	public Janela() {
		setTitle("Programa que marca o tempo");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 0;

		label1.setPreferredSize(new Dimension(200, 25));
		label1.setFont(new Font("arial", Font.PLAIN, 16));
		janela.add(label1, gbc);
		
		gbc.gridy++;
		areaTexto.setPreferredSize(new Dimension(200,25));
		janela.add(areaTexto,gbc);
		
		
		gbc.gridy ++;
		label2.setPreferredSize(new Dimension(200, 25));
		label2.setFont(new Font("arial", Font.PLAIN, 16));
		janela.add(label2, gbc);
		
		gbc.gridy++;
		areaTexto2.setPreferredSize(new Dimension(200,25));
		janela.add(areaTexto2,gbc);

		add(janela, BorderLayout.WEST);
		setVisible(true);

	}

}
