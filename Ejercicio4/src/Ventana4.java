import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ventana4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnAceptar, btnActivar, btnDesactivar;
	private JLabel txFrase;


	public Ventana4() {
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(465, 340);
			setLocationRelativeTo(null);
			
			iniciarComponentes();
		}
		
		
	
		
		
		
	private void iniciarComponentes() {
		getContentPane().setForeground(new Color(153, 102, 51));
		getContentPane().setBackground(new Color(143, 188, 143));
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 28, 54, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad: ");
		lblCiudad.setBounds(10, 63, 54, 14);
		getContentPane().add(lblCiudad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(70, 25, 342, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(70, 60, 342, 20);
		getContentPane().add(txtCiudad);
		
		txFrase = new JLabel("");
		txFrase.setHorizontalAlignment(SwingConstants.CENTER);
		txFrase.setBackground(new Color(60, 179, 113));
		txFrase.setForeground(new Color(85, 107, 47));
		txFrase.setBounds(10, 146, 429, 80);
		getContentPane().add(txFrase);	
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(160, 91, 113, 23);
		getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(54, 250, 105, 23);
		getContentPane().add(btnActivar);
		btnActivar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(288, 250, 124, 23);
		getContentPane().add(btnDesactivar);
		btnDesactivar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String ciudad = txtCiudad.getText();
		String nombre = txtNombre.getText();
		
		if(e.getSource() == btnAceptar ) {
			txFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad);
			
		}
		
		if(e.getSource() == btnDesactivar ) {
			txtCiudad.setEnabled(false);
			txtNombre.setEnabled(false);
		}
		
		if(e.getSource() == btnActivar ) {
			txtCiudad.setEnabled(true);
			txtNombre.setEnabled(true);
		}
		
	}
	
}
