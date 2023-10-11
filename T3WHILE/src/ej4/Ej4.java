package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int numero;
		int resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		while (numero != 0) {
		resto = numero % 2;
		if (resto==0) {
			System.out.println("El número es par ");	
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		}else {
			System.out.println("El número es impar ");	
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		
		{
		
		}
			
	}
		


	}
		sc.close();

}}
