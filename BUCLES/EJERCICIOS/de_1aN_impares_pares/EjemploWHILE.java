package de_1aN_impares_pares;

import java.util.Scanner;
public class EjemploWHILE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Teclea un número: ");
		
		int n = sc.nextInt();
		int i = 1;
		
		while (i <= n) {
			System.out.print(i + " ");
			i+=2;
			}
			System.out.println();
			i=2;
		
		while (i <= n) {
			System.out.print(i + " ");i+=2;
		}
	}
}

