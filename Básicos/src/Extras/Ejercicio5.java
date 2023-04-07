package Extras;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Introduzca el primer número entero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número entero: ");
		num2 = sc.nextInt();
		
		System.out.println("El número MAYOR de los 2 es: " + Math.max(num1, num2));
		System.out.println("El resultado de " + num1 + "elevado a " + num2 + "es" + Math.pow(num1, num2));
	}
}
