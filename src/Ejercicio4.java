import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		
		try {
		String numeroString = JOptionPane.showInputDialog("Introduce el radio: ");
		numero = Double.parseDouble(numeroString);
		
		
		JOptionPane.showMessageDialog(null, "El area del circulo es " + (Math.PI*Math.pow(numero, 2)));
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Introduzca un valor valido");
		}
	}

}
