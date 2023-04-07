package Extras;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Teclea una frase: ");
		String frase = new String(sc.next());
		
		String fraseM = new String(frase.toUpperCase());
		
		System.out.println(fraseM);
	}
}
