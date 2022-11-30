package de_1aN;

import java.util.Scanner;
public class EjemploDO_WHILE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Teclea un número: ");
		int n = sc.nextInt();
		int i = 1;
		do {System.out.print(i + " ");
		
		i++;
		} while (i <= n);
	}
}
