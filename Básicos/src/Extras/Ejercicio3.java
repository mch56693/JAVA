package Extras;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número entero cualquiera: ");
		long numero = sc.nextLong();
		
		String cadena = new String();
		cadena = cadena.valueOf(numero);
		
		System.out.println("El número entero que has introducido tiene: " + cadena.length() + " cifras");
	}
}
