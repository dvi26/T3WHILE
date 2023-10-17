package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int suma = 0;
		int total2 = 1;
		int numero;
		double media;
		int total = 0;
		int errores = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		while (numero > 0) {
		suma= suma + numero;
		total= total + 1;
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		if (numero >= 18) {
			total2=total2+1;
		} else {
			errores = errores + 1;
		{
		
		}
			
	}
		
		

	}
		media = (double)suma/total;
		System.out.println("La media de los números introducidos es: " + media);
		System.out.println("La suma total es: " + suma);
		System.out.println("El número de alumnos es de: " + total);
		System.out.println("El número de alumnos mayores de edad es de: " + total2);
		sc.close();
		

}}
