import java.util.Scanner;

public class Ejercicio6 {

	final static double IVA = 0.21;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		System.out.println("Introduce el precio sin iva ");
		try {
		numero = sc.nextDouble();
		
			System.out.println("El precio del producto con iva es: " + ((IVA*numero)+numero));

		}catch (Exception e) {
			System.err.println("Introduce un numero valido");
		}
		sc.close();
	}
	
}
