import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

public class Ventana5 extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel lblPal1, lblPal2, lblPal3,  lblPal4, lblOcultar;

	public Ventana5() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(465, 340);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
		agregarEventosMouse();
	}
	
	private void iniciarComponentes() {
	getContentPane().setForeground(new Color(153, 102, 51));
	getContentPane().setBackground(new Color(233, 150, 122));
	getContentPane().setLayout(null);
	
	 lblPal1 = new JLabel("Palabra 1");
	lblPal1.setHorizontalAlignment(SwingConstants.CENTER);
	lblPal1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblPal1.setBounds(83, 37, 111, 48);
	getContentPane().add(lblPal1);
	
	 lblPal2 = new JLabel("Palabra 2");
	lblPal2.setHorizontalAlignment(SwingConstants.CENTER);
	lblPal2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblPal2.setBounds(228, 37, 111, 48);
	getContentPane().add(lblPal2);
	
	 lblPal3 = new JLabel("Palabra 3");
	lblPal3.setHorizontalAlignment(SwingConstants.CENTER);
	lblPal3.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblPal3.setBounds(83, 100, 111, 48);
	getContentPane().add(lblPal3);
	
	 lblPal4 = new JLabel("Palabra 4");
	lblPal4.setHorizontalAlignment(SwingConstants.CENTER);
	lblPal4.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblPal4.setBounds(238, 100, 111, 48);
	getContentPane().add(lblPal4);
	
	lblOcultar = new JLabel("Ocultar");
	lblOcultar.setForeground(new Color(165, 42, 42));
	lblOcultar.setBackground(new Color(240, 128, 128));
	lblOcultar.setFont(new Font("Rockwell", Font.PLAIN, 21));
	lblOcultar.setHorizontalAlignment(SwingConstants.CENTER);
	lblOcultar.setBounds(157, 174, 121, 57);
	lblOcultar.setOpaque(true);
	getContentPane().add(lblOcultar);
	}
	
	private void agregarEventosMouse() {
        lblOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblPal1.setVisible(false);
                lblPal2.setVisible(false);
                lblPal3.setVisible(false);
                lblPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblPal1.setVisible(true);
                lblPal2.setVisible(true);
                lblPal3.setVisible(true);
                lblPal4.setVisible(true);
            }
        });
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
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
