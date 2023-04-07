package Extras;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String cadena = new String();
		
		System.out.println("Introduzca un número entero de 4 cifras: ");
		numero = sc.nextInt();
		cadena = sc.next();
		
		System.out.println("El número entero que has introducido es: " + cadena);
		
		System.out.println("El número puesto del revés es: " + cadena.charAt(3) + cadena.charAt(2) 
		+ cadena.charAt(1) + cadena.charAt(0));
	}
}
