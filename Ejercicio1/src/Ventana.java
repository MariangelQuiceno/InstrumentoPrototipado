import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField txtNombre, txtCiudad;
	private JLabel etiNombre, etiCiudad;
	private JButton btnDatos, btnVisuCiudad, btnOcultarCiudad, btnOcultarNombre, btnVisuNombre;
	

	 
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 340);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}
	
		
		private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(10, 23, 64, 14);
		contentPane.add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad: ");
		lblCiudad.setHorizontalAlignment(SwingConstants.LEFT);
		lblCiudad.setBounds(10, 60, 64, 14);
		contentPane.add(lblCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(41, 193, 149, 23);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setBounds(41, 227, 149, 23);
		contentPane.add(btnVisuNombre);
		btnVisuNombre.addActionListener(this);
		
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(265, 193, 144, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setBounds(265, 227, 144, 23);
		contentPane.add(btnVisuCiudad);
		btnVisuCiudad.addActionListener(this);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(84, 20, 298, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(84, 57, 298, 20);
		contentPane.add(txtCiudad);
		
		btnDatos = new JButton("Ingresar Datos");
		btnDatos.setBounds(169, 88, 137, 23);
		contentPane.add(btnDatos);
		btnDatos.addActionListener(this);
		
		etiNombre = new JLabel("Su nombre aparecera aqui");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(28, 155, 173, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Su ciudad aparecera aqui");
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setBounds(260, 155, 149, 14);
		contentPane.add(etiCiudad);
	}
		
		
		public void actionPerformed(ActionEvent e) {
			
			String nombre = txtNombre.getText();
			String ciudad = txtCiudad.getText();
			
		if (e.getSource() == btnDatos) {
			
			etiNombre.setText(nombre);
			etiCiudad.setText(ciudad);
		}
		
		if(e.getSource() == btnOcultarNombre)
		{
			etiNombre.setVisible(false);
		}
		
		if(e.getSource() == btnVisuNombre)
		{
			etiNombre.setVisible(true);
		}
		
		if(e.getSource() == btnOcultarCiudad)
		{
			etiCiudad.setVisible(false);
		}
		
		if(e.getSource() == btnVisuCiudad)
		{
			etiCiudad.setVisible(true);
		}
		
			
		}
		
		
		

		
		
		
}
