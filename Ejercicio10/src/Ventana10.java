import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Ventana10 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JButton btnConcatena;
	private JLabel etiTexto;
	
	public Ventana10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 340);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		iniciarComponentes();
	}
	
	

	
	
	
private void iniciarComponentes() {
	
	JLabel lblNewLabel = new JLabel("ConcaKonka");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
	lblNewLabel.setBounds(137, 11, 153, 39);
	getContentPane().add(lblNewLabel);
	
	txtPalabra1 = new JTextField();
	txtPalabra1.setBounds(29, 90, 153, 20);
	getContentPane().add(txtPalabra1);
	txtPalabra1.setColumns(10);
	
	txtPalabra2 = new JTextField();
	txtPalabra2.setColumns(10);
	txtPalabra2.setBounds(271, 90, 153, 20);
	getContentPane().add(txtPalabra2);
	
	JLabel lblP1 = new JLabel("Palabra 1");
	lblP1.setBounds(75, 65, 82, 14);
	getContentPane().add(lblP1);
	
	JLabel lblP2 = new JLabel("Palabra 2");
	lblP2.setBounds(321, 65, 72, 14);
	getContentPane().add(lblP2);
	
	 btnConcatena = new JButton("Concatenar");
	btnConcatena.setBounds(155, 140, 153, 23);
	getContentPane().add(btnConcatena);
	btnConcatena.addActionListener(this);
	
	 etiTexto = new JLabel("");
	etiTexto.setBounds(29, 229, 383, 49);
	getContentPane().add(etiTexto);
	
}

public void actionPerformed(ActionEvent e) {
	
	String texto1 =txtPalabra1.getText();
	String texto2 =txtPalabra2.getText();
	
	
	if(e.getSource() == btnConcatena ) {
		etiTexto.setText(texto1+texto2);
	}
	

	
}

}
