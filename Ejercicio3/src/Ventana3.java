import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame implements KeyListener, ActionListener  {

	private JPanel contentPane;
	private JButton btnVaciar;
	private JTextField txtTexto;
	private JLabel etiTexto;
	


	public Ventana3() {
		getContentPane().setForeground(new Color(153, 102, 51));
		getContentPane().setBackground(new Color(255, 204, 102));
		getContentPane().setLayout(null);
		iniciarComponentes();
		}
	
		
		
		
	private void iniciarComponentes() {
			txtTexto = new JTextField();
			txtTexto.setForeground(new Color(255, 153, 0));
			txtTexto.setBounds(10, 71, 429, 45);
			getContentPane().add(txtTexto);
			txtTexto.setColumns(10);
			txtTexto.addKeyListener(this);
			
			JLabel lblNewLabel = new JLabel("Ingrese un texto");
			lblNewLabel.setForeground(new Color(255, 51, 0));
			lblNewLabel.setFont(new Font("Bookman Old Style", Font.ITALIC, 19));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(130, 39, 196, 20);
			getContentPane().add(lblNewLabel);
			
			etiTexto = new JLabel("");
			etiTexto.setFont(new Font("Tahoma", Font.BOLD, 11));
			etiTexto.setForeground(new Color(255, 102, 51));
			etiTexto.setVerticalAlignment(SwingConstants.TOP);
			etiTexto.setBounds(10, 188, 429, 85);
			getContentPane().add(etiTexto);
			
			btnVaciar = new JButton("Vaciar");
			btnVaciar.setBackground(new Color(255, 245, 238));
			btnVaciar.setForeground(new Color(255, 69, 0));
			btnVaciar.setBounds(185, 127, 89, 23);
			getContentPane().add(btnVaciar);
			btnVaciar.addActionListener(this);
			btnVaciar.setBounds(144, 138, 148, 23);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(465, 340);
			setLocationRelativeTo(null);
	}




	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnVaciar ) {
			etiTexto.setText("");
			txtTexto.setText("");
		}
		
	}
	
	 public void keyTyped(KeyEvent e) {
	        etiTexto.setText(txtTexto.getText());
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	        
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
	      
	    }	
		
		

}
