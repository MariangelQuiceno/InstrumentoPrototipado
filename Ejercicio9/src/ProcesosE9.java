import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProcesosE9 {
	
	public static void calcularPromedio(String txtPrimerTrimestre, String txtSegundoTrimestre, String txtTercerTrimestre, JLabel texto) {
	    double valor1 = Double.parseDouble(txtPrimerTrimestre);
	    double valor2 = Double.parseDouble(txtSegundoTrimestre);
	    double valor3 = Double.parseDouble(txtTercerTrimestre);
	    
	    Color c = new Color(207, 163, 105);
	    

	    
	    double promedio = (valor1 + valor2 + valor3) / 3;
	    
	    double promedioRedondeado = Math.round(promedio * 100.0) / 100.0;
	    
	    
	    if(promedioRedondeado < 5 ) {
	    	texto.setText("¡Oh no,  Usted ha Suspendido...");
	    	texto.setForeground(Color.red.darker());
	    } 
	    
	    if(promedioRedondeado > 5) {
	    	texto.setText("¡Felicidades,  Usted ha Aprobado");
	    	texto.setForeground(Color.GREEN.darker());
	    } 
	    
	}
	
	
	
	
	
	

}
