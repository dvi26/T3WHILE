package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int numero;
		int contador = 0;
		int totaln;
		int sumap = 0;
		int suman = 0;
		int suman2 = 0;
		double median = 0;
		int totalc = 0;
		int errores = 0;
		Scanner sc = new Scanner(System.in);
		
		while (contador < 10) {
			System.out.println("Introduzca un número entero: ");
			numero = sc.nextInt();
			
			contador = contador + 1;
			if (numero > 0) {
				sumap = sumap + numero;
				
			} else if (numero < 0) {
				suman = suman + numero;
				totaln = suman2 + 1;
				median = suman / totaln;
				
			} else if (numero == 0) {
				totalc = totalc + 1;
				
			} else {
				errores = errores + 1;

			}

		}
		System.out.println("La media de los numeros negativos es: " + median);
		System.out.println("La sumna de los numeros positivos es: " + sumap);
		System.out.println("Has introducido: " + totalc + " ceros");
		System.out.println("Numero de errores: " + errores);
		sc.close();
	}
}
