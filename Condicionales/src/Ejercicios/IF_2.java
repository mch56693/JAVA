package Ejercicios;

import java.util.Scanner;

public class IF_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		
		int edad = sc.nextInt();
		
		if(edad <= 19) {
			System.out.println("Eres un adolescente.");
			
		}else if(edad <= 16) {
			System.out.println("Eres un crio");
			
		}else if(edad <= 30) {
			System.out.println("Eres joven");
			
		}else if(edad <= 40) {
			System.out.println("Eres adulto");
		
		}else if(edad <= 55) {
			System.out.println("Estas maduro");
		
		}else {
			System.out.println("Estas mayor");
		}

	}

}
