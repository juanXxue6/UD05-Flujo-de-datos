import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia = JOptionPane.showInputDialog("Introduce el nombre ");
		
		
		switch (dia.toLowerCase()) {
		case "lunes":
	    case "martes":
	    case "míercoles":
	    case "jueves":	    	
	    case "viernes":
			JOptionPane.showMessageDialog(null, "Es dia laboral");
	        break;
	     case "sábado":
	     case "domingo":
				JOptionPane.showMessageDialog(null, "No es dia laboral");
	         break;
	     default:
				JOptionPane.showMessageDialog(null, "Introduzca un dato valido");
			break;
		}
		
		

	}

}
