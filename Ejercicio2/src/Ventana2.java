import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class Ventana2 extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnTraspasa1, btnTraspasa2;
	private JLabel etiTexto1, etiTexto2;

	 
	
		public Ventana2() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(465, 340);
			setLocationRelativeTo(null);
			
			iniciarComponentes();
		}
		
			
			private void iniciarComponentes() {
			contentPane = new JPanel();
			contentPane.setBackground(new Color(221, 160, 221));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			txtTexto = new JTextField();
			txtTexto.setBackground(new Color(248, 248, 255));
			txtTexto.setForeground(new Color(199, 21, 133));
			txtTexto.setBounds(28, 56, 396, 20);
			contentPane.add(txtTexto);
			txtTexto.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Ingrese un Texto");
			lblNewLabel.setFont(new Font("Bradley Hand ITC", Font.BOLD, 17));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(138, 29, 185, 20);
			contentPane.add(lblNewLabel);
			
			etiTexto1 = new JLabel("");
			etiTexto1.setVerticalAlignment(SwingConstants.TOP);
			etiTexto1.setBounds(28, 158, 151, 74);
			contentPane.add(etiTexto1);
			
			etiTexto2 = new JLabel("");
			etiTexto2.setVerticalAlignment(SwingConstants.TOP);
			etiTexto2.setBounds(273, 158, 151, 74);
			contentPane.add(etiTexto2);
			
			btnTraspasa1 = new JButton("Traspasa 1");
			btnTraspasa1.setForeground(new Color(199, 21, 133));
			btnTraspasa1.setBackground(new Color(248, 248, 255));
			btnTraspasa1.setBounds(28, 99, 151, 23);
			contentPane.add(btnTraspasa1);
			btnTraspasa1.addActionListener(this);
			
			btnTraspasa2 = new JButton("Traspasa 2");
			btnTraspasa2.setForeground(new Color(199, 21, 133));
			btnTraspasa2.setBackground(new Color(248, 248, 255));
			btnTraspasa2.setBounds(273, 99, 151, 23);
			contentPane.add(btnTraspasa2);
			btnTraspasa2.addActionListener(this);
			
			
			
		}
			
			
			public void actionPerformed(ActionEvent e) {
				
				String texto = txtTexto.getText();
					
				if (e.getSource() == btnTraspasa1) {
					etiTexto1.setText(texto);
					etiTexto2.setText("");
				}
				
				if (e.getSource() == btnTraspasa2) {
					etiTexto1.setText("");
					etiTexto2.setText(texto);
				}
				
				
			
				
			}
}
