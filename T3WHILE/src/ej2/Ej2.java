package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int suma = 0;
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		while (numero >= 0) {
		suma= suma + 1;
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		{
		
		}
			
	}
		System.out.println("Números introducidos totales: " + suma);	
		sc.close();

	}

}
