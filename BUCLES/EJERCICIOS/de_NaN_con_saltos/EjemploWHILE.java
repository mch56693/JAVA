package de_NaN_con_saltos;

import java.util.Scanner;
public class EjemploWHILE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Iniciar en: ");
		int inicio = sc.nextInt();
		
		System.out.print("Finalizar en: ");
		int fin = sc.nextInt();
		
		System.out.print("Saltar de: ");
		int salto = sc.nextInt();
		
		int i = inicio;
		
		while (i <= fin) {
			System.out.print(i + " ");
			i=i+salto;
		}
	}
}
