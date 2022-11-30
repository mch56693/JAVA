package de_NaN_con_saltos;

import java.util.Scanner;
public class EjemploWHILEsentido {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		System.out.print("Iniciar en: ");
		int inicio = sc.nextInt();
			
		System.out.print("Finalizar en: ");
		int fin = sc.nextInt();
			
		System.out.print("Saltar de: ");
		int salto = sc.nextInt();
		
		System.out.print("Sentido (+) o (-):");
		String sentido = new String (sc.next());
		
		if (sentido.charAt(0) == '+')
		{
			int i = inicio;
			while (i <= fin) {
				System.out.print(i + " ");
				i=i+salto;
			}
		}else {
			int i = fin;
			while (i >= inicio) {
				System.out.print(i + " ");
				i=i-salto;
		}
	}
}}

