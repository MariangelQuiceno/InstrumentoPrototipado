import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class Ventana6 extends JFrame implements ActionListener, MouseListener {
	
	

	private JPanel contentPane;
	private JButton btnAchicar, btnAgrandar, btnCentro, btnEsquina;
	private JLabel lblNombre;

	public Ventana6() {
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		getContentPane().setForeground(new Color(0, 0, 128));
		getContentPane().setBackground(new Color(207, 204, 244));
		getContentPane().setLayout(null);
		
		iniciarComponentes();
	}
	
	

	
	
	
private void iniciarComponentes() {
	
	 lblNombre = new JLabel("HOLA (O\u203Fo)\r\n  \n");
	lblNombre.setBackground(new Color(185, 185, 221));
	lblNombre.setFont(new Font("Serif", Font.PLAIN, 17));
	lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
	lblNombre.setBounds(177, 58, 198, 52);
	lblNombre.setOpaque(true);
	getContentPane().add(lblNombre);
	
	 btnEsquina = new JButton("Esquina");
	btnEsquina.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnEsquina.setForeground(new Color(147, 112, 219));
	btnEsquina.setBackground(new Color(230, 230, 250));
	btnEsquina.setBounds(67, 245, 147, 37);
	getContentPane().add(btnEsquina);
	btnEsquina.addActionListener(this);
	btnEsquina.addMouseListener(this);
	
	 btnCentro = new JButton("Centro");
	btnCentro.setForeground(new Color(147, 112, 219));
	btnCentro.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnCentro.setBackground(new Color(230, 230, 250));
	btnCentro.setBounds(67, 320, 147, 37);
	getContentPane().add(btnCentro);
	btnCentro.addActionListener(this);
	btnCentro.addMouseListener(this);
	
	 btnAgrandar = new JButton("Agrandar");
	btnAgrandar.setForeground(new Color(147, 112, 219));
	btnAgrandar.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnAgrandar.setBackground(new Color(230, 230, 250));
	btnAgrandar.setBounds(327, 253, 147, 37);
	getContentPane().add(btnAgrandar);
	btnAgrandar.addActionListener(this);
	btnAgrandar.addMouseListener(this);
	
	
	 btnAchicar = new JButton("Achicar");
	btnAchicar.setForeground(new Color(147, 112, 219));
	btnAchicar.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnAchicar.setBackground(new Color(230, 230, 250));
	btnAchicar.setBounds(327, 320, 147, 37);
	getContentPane().add(btnAchicar);
	btnAchicar.addActionListener(this);
	btnAchicar.addMouseListener(this);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(579, 438);
	setLocationRelativeTo(null);

}

public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource() == btnEsquina ) {
		lblNombre.setLocation(0, 0);
	}
	
	if(e.getSource() == btnCentro ) {
		lblNombre.setLocation(180, 134);
	}
	
	if(e.getSource() == btnAchicar ) {
		Dimension lblSize = lblNombre.getSize();
	    int newWidth = lblSize.width - 10; 
	    int newHeight = lblSize.height - 10;
	    lblNombre.setSize(newWidth, newHeight);
	}
	
	if(e.getSource() == btnAgrandar ) {
		Dimension lblSize = lblNombre.getSize();
	    int newWidth = lblSize.width + 10; 
	    int newHeight = lblSize.height + 10;
	    lblNombre.setSize(newWidth, newHeight);
	}
	
}


@Override
public void mouseEntered(MouseEvent e) {
    JButton button = (JButton) e.getSource();
    int newWidth = button.getWidth() + 20;
    int newHeight = button.getHeight() + 20;
    button.setSize(newWidth, newHeight);
}

@Override
public void mouseExited(MouseEvent e) {
    JButton button = (JButton) e.getSource();
    int originalWidth = button.getWidth() - 10;
    int originalHeight = button.getHeight() - 10;
    button.setSize(originalWidth, originalHeight);
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



	


}
