import java.util.Scanner;

public class Ejercicio5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		System.out.println("Introduce un numero ");
		try {
		numero = sc.nextDouble();
		if((numero%2) == 0)
			System.out.println("Es divisible entre dos");
		else
			System.out.println("No es divisible entre dos");
		}catch (Exception e) {
			System.err.println("Introduce un numero valido");
		}
		sc.close();
	}

}
