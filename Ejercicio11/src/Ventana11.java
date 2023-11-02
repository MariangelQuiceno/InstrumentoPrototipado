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
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana11 extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JLabel etiUna, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve, etiDiez;
	private JButton btnBorrar;

	public Ventana11() {
		getContentPane().setBackground(SystemColor.activeCaption);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(575, 432);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		iniciarComponentes();
		
	}
	
	

	
	
	
private void iniciarComponentes() {
	
	 etiUna = new JLabel("0");
	etiUna.setBackground(SystemColor.inactiveCaption);
	etiUna.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiUna.setHorizontalAlignment(SwingConstants.CENTER);
	etiUna.setBounds(47, 31, 66, 51);
	getContentPane().add(etiUna);
	etiUna.setOpaque(true);
	etiUna.addMouseListener(this);
	
	 etiDos = new JLabel("1");
	etiDos.setOpaque(true);
	etiDos.setHorizontalAlignment(SwingConstants.CENTER);
	etiDos.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiDos.setBackground(SystemColor.inactiveCaption);
	etiDos.setBounds(141, 31, 66, 51);
	getContentPane().add(etiDos);
	etiDos.addMouseListener(this);
	
	 etiTres = new JLabel("2");
	etiTres.setOpaque(true);
	etiTres.setHorizontalAlignment(SwingConstants.CENTER);
	etiTres.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiTres.setBackground(SystemColor.inactiveCaption);
	etiTres.setBounds(244, 31, 66, 51);
	getContentPane().add(etiTres);
	etiTres.addMouseListener(this);
	
	
	 etiCuatro = new JLabel("3");
	etiCuatro.setOpaque(true);
	etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
	etiCuatro.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiCuatro.setBackground(SystemColor.inactiveCaption);
	etiCuatro.setBounds(348, 31, 66, 51);
	getContentPane().add(etiCuatro);
	etiCuatro.addMouseListener(this);
	
	 etiCinco = new JLabel("4");
	etiCinco.setOpaque(true);
	etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
	etiCinco.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiCinco.setBackground(SystemColor.inactiveCaption);
	etiCinco.setBounds(437, 31, 66, 51);
	getContentPane().add(etiCinco);
	etiCinco.addMouseListener(this);
	
	 etiSeis = new JLabel("5");
	etiSeis.setOpaque(true);
	etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
	etiSeis.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiSeis.setBackground(SystemColor.inactiveCaption);
	etiSeis.setBounds(47, 116, 66, 51);
	getContentPane().add(etiSeis);
	etiSeis.addMouseListener(this);
	
	 etiSiete = new JLabel("6");
	etiSiete.setOpaque(true);
	etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
	etiSiete.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiSiete.setBackground(SystemColor.inactiveCaption);
	etiSiete.setBounds(141, 116, 66, 51);
	getContentPane().add(etiSiete);
	etiSiete.addMouseListener(this);
	
	 etiOcho = new JLabel("7");
	etiOcho.setOpaque(true);
	etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
	etiOcho.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiOcho.setBackground(SystemColor.inactiveCaption);
	etiOcho.setBounds(244, 116, 66, 51);
	getContentPane().add(etiOcho);
	etiOcho.addMouseListener(this);
	
	 etiNueve = new JLabel("8");
	etiNueve.setOpaque(true);
	etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
	etiNueve.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiNueve.setBackground(SystemColor.inactiveCaption);
	etiNueve.setBounds(348, 116, 66, 51);
	getContentPane().add(etiNueve);
	etiNueve.addMouseListener(this);
	
	 etiDiez = new JLabel("9");
	etiDiez.setOpaque(true);
	etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
	etiDiez.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
	etiDiez.setBackground(SystemColor.inactiveCaption);
	etiDiez.setBounds(437, 116, 66, 51);
	getContentPane().add(etiDiez);
	etiDiez.addMouseListener(this);
	
	txtNumero = new JTextField();
	txtNumero.setBackground(SystemColor.inactiveCaptionBorder);
	txtNumero.setBounds(47, 210, 456, 25);
	getContentPane().add(txtNumero);
	txtNumero.setColumns(10);
	
	 btnBorrar = new JButton("Borrar");
	btnBorrar.setBounds(236, 271, 89, 23);
	getContentPane().add(btnBorrar);
	btnBorrar.addActionListener(this);
	
}




@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == btnBorrar ) {
		txtNumero.setText("");
	}
	
}



public void mouseEntered(MouseEvent e) {
	
    if (e.getSource() instanceof JLabel) {
        JLabel etiqueta = (JLabel) e.getSource();
        String numero = etiqueta.getText();
        String textoActual = txtNumero.getText();
        txtNumero.setText(textoActual + numero);
    }
    
}




@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}






@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}






@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}






@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



}
