package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int suma = 0;
		int numero;
		double media;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		while (numero >= 0) {
		suma= suma + numero;
		total= total + 1;
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		{
		
		}
			
	}
		media = (double)suma/total;
		System.out.println("La media de los números introducidos es: " + media);	
		sc.close();


	}

}
