import java.util.Scanner;

public class Ejercicio10 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ventas = 0;
		int numeroVentas;
		
		System.out.println("Introduce un numero de ventas");
		numeroVentas = sc.nextInt();
		
		for (int i = 0; i < numeroVentas; i++) {
			System.out.println("Valor de la venta: ");
			ventas = ventas + sc.nextDouble();
	}
		System.out.println("Ventas totales: " + ventas);
	}
}
