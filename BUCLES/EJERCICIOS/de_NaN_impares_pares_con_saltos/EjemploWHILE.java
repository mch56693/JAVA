package de_NaN_impares_pares_con_saltos;

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
		
		int n = sc.nextInt();
		int r = 1;
		
		while (r <= n) {
			System.out.print(r + " ");
			r+=2;
			}
			System.out.println();
			r=2;
		
		while (r <= n) {
			System.out.print(r + " ");r+=2;
			
			
		}
	}
}}


