import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaE9 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel etiResultado;
	private JButton btnCalcular;
	
	public VentanaE9() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 340);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		iniciarComponentes();
	}
	
	
private void iniciarComponentes() {
	
	JLabel lblTitulo = new JLabel("Nota Final");
	lblTitulo.setFont(new Font("Sitka Small", Font.BOLD, 19));
	lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
	lblTitulo.setBounds(137, 11, 188, 52);
	getContentPane().add(lblTitulo);
	
	txtPrimerTrimestre = new JTextField();
	txtPrimerTrimestre.setBounds(48, 110, 140, 20);
	getContentPane().add(txtPrimerTrimestre);
	txtPrimerTrimestre.setColumns(10);
	
	txtSegundoTrimestre = new JTextField();
	txtSegundoTrimestre.setColumns(10);
	txtSegundoTrimestre.setBounds(258, 110, 140, 20);
	getContentPane().add(txtSegundoTrimestre);
	
	txtTercerTrimestre = new JTextField();
	txtTercerTrimestre.setColumns(10);
	txtTercerTrimestre.setBounds(159, 166, 140, 20);
	getContentPane().add(txtTercerTrimestre);
	
	JLabel lblNewLabel = new JLabel("Primer Trimestre");
	lblNewLabel.setBounds(48, 85, 140, 14);
	getContentPane().add(lblNewLabel);
	
	JLabel lblSegundoTrimestre = new JLabel("Segundo Trimestre");
	lblSegundoTrimestre.setBounds(258, 85, 121, 14);
	getContentPane().add(lblSegundoTrimestre);
	
	JLabel lblTercerTrimestre = new JLabel("Tercer Trimestre");
	lblTercerTrimestre.setBounds(159, 141, 121, 14);
	getContentPane().add(lblTercerTrimestre);
	
	JLabel etiNotaFinal = new JLabel("Nota Final: ");
	etiNotaFinal.setFont(new Font("Tahoma", Font.BOLD, 11));
	etiNotaFinal.setBounds(48, 235, 82, 14);
	getContentPane().add(etiNotaFinal);
	
	 etiResultado = new JLabel("");
	etiResultado.setBounds(48, 259, 350, 31);
	getContentPane().add(etiResultado);
	
	 btnCalcular = new JButton("Calcular");
	btnCalcular.setBounds(191, 210, 89, 23);
	getContentPane().add(btnCalcular);
	btnCalcular.addActionListener(this);

}

public void actionPerformed(ActionEvent e) { 

if (e.getSource() == btnCalcular) {
		ProcesosE9.calcularPromedio(txtPrimerTrimestre.getText(), txtSegundoTrimestre.getText(), txtTercerTrimestre.getText(), etiResultado);
	
}
}

}
