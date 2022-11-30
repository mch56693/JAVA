package de_1aN;

import java.util.Scanner;
public class EjemploFOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Teclea un número: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {System.out.print(i + " ");
		}
	}
}
