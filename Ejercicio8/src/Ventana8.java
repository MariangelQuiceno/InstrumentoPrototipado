import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana8 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAzul, btnRojo, btnverde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;
	private JLabel etiTexto;
	

	public Ventana8() {
		getContentPane().setBackground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 340);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}
	
private void iniciarComponentes() {
	
	getContentPane().setLayout(null);

	 etiTexto = new JLabel("HOLA (O\u203Fo)");
	etiTexto.setFont(new Font("Verdana", Font.PLAIN, 15));
	etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
	etiTexto.setBounds(149, 29, 119, 41);
	getContentPane().add(etiTexto);
	
	 btnAzul = new JButton("Texto Azul");
	btnAzul.setBounds(28, 143, 119, 23);
	getContentPane().add(btnAzul);
	btnAzul.addActionListener(this);
	
	 btnRojo = new JButton("Texto Rojo");
	btnRojo.setBounds(167, 143, 119, 23);
	getContentPane().add(btnRojo);
	btnRojo.addActionListener(this);
	
	
	 btnverde = new JButton("Texto Verde");
	btnverde.setBounds(303, 143, 119, 23);
	getContentPane().add(btnverde);
	btnverde.addActionListener(this);
	
	 btnFondoAzul = new JButton("Fondo Azul");
	btnFondoAzul.setBounds(28, 183, 119, 23);
	getContentPane().add(btnFondoAzul);
	btnFondoAzul.addActionListener(this);
	
	 btnFondoRojo = new JButton("Fondo Rojo");
	btnFondoRojo.setBounds(167, 183, 119, 23);
	getContentPane().add(btnFondoRojo);
	btnFondoRojo.addActionListener(this);
	
	 btnFondoVerde = new JButton("Fondo Verde");
	btnFondoVerde.setBounds(303, 183, 119, 23);
	getContentPane().add(btnFondoVerde);
	btnFondoVerde.addActionListener(this);
	
	 btnTransparente = new JButton("Transparente");
	btnTransparente.setBounds(89, 234, 113, 30);
	getContentPane().add(btnTransparente);
	btnTransparente.addActionListener(this);
	
	 btnOpaca = new JButton("Opaca");
	btnOpaca.setBounds(240, 234, 102, 30);
	getContentPane().add(btnOpaca);
	btnOpaca.addActionListener(this);

}

public void actionPerformed(ActionEvent e) {
	
	//Texto
	
	if(e.getSource() == btnAzul ) {
		etiTexto.setForeground(Color.BLUE);
	}
	
	if(e.getSource() == btnRojo ) {
		etiTexto.setForeground(Color.RED);
	}
	
	if(e.getSource() == btnverde ) {
		etiTexto.setForeground(Color.GREEN);
	}
	
	//Fondo
	

	if(e.getSource() == btnFondoAzul ) {
		etiTexto.setBackground(Color.BLUE);
	}
	
	if(e.getSource() == btnFondoRojo ) {
		etiTexto.setBackground(Color.RED);
	}
	
	if(e.getSource() == btnFondoVerde ) {
		etiTexto.setBackground(Color.GREEN);
	}
	
	// Transparente y Opaca
	
	if(e.getSource() == btnTransparente ) {
		etiTexto.setOpaque(false);
	}
	
	if(e.getSource() == btnOpaca ) {
		etiTexto.setOpaque(true);
	}
	
	
	
}


}
