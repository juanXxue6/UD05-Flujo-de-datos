import java.util.Scanner;

public class CalculadoraInversa {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador1;
		int operador2;
		String operador;

		try {
		System.out.println("Introduce el operador 1");
		operador1 = sc.nextInt();
		
		System.out.println("Introduce el operador 2");
		operador2 = sc.nextInt();
		
		
		System.out.println("Introduce el operador de la operacion (+,-,*,/,%)");
		operador = sc.next();
		
		switch (operador.trim()) {
		case "+":
			
			System.out.println("Resultado de la suma: " + (operador1 + operador2));
			break;

		case "-":
			
			System.out.println("Resultado de la resta: " + (operador1 - operador2));
			break;
			
		case "*":
			
			System.out.println("Resultado de la multiplcacion: " + (operador1 * operador2));
			break;
			
		case "/":
			
			double division = operador1/operador2;
			System.out.println("Resultado de la resta: " + (division));
			break;
			
		case "%":
			
			System.out.println("Resultado de la resta: " + (operador1 % operador2));
			break;
			
		default:
			
			System.err.println("Introduce un valor valido");
			break;
		}
		
		
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Introduce un valor valido");
		}
		
	}

}
