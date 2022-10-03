import javax.swing.JOptionPane;

public class Ejercicio12 {

	static  String contrasena = "tsystem";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intentos = 3;
		boolean correcto = false;
		String contrasenaUsuario;
		
		
		do {
			
			 contrasenaUsuario = JOptionPane.showInputDialog("Introduce la contraseña, le quedan " + intentos + " intentos");

			if(contrasenaUsuario.toLowerCase().equals(contrasena.toLowerCase())) {
				correcto = true;

				
			}else {
				
				intentos--;
			}
			
		}while((intentos > 0) && (!correcto));
		
		if(correcto) {
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		}else {
			JOptionPane.showMessageDialog(null, "Vuelva a intentarlo");
		}
	}

}
