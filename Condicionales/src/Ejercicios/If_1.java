package Ejercicios;

import java.util.*;

public class IF_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			
			System.out.println("Eres MAYOR de edad.");
			
		}else {
			
			System.out.println("Eres MENOR de edad.");
			
		}
	}

}
