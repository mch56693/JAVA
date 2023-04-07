package Indeterminados;

import java.util.Scanner;

public class doWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -------- ADIVINA UN NUMERO
		
		int numAleatorio = (int)(Math.random()*100);
		
		Scanner teclado = new Scanner(System.in);
		
			int num = 0;
			int intentos = 0;
		
		do{
			intentos++; 
			System.out.println("Introduce un numero:");
			
			num = teclado.nextInt();
			
			if(numAleatorio < num) {
				
				System.out.println("Mas abajo\n");
				
			}
			
			else if(numAleatorio > num) {
				
				System.out.println("Mas arriba\n");
			}
		
		} 
		
		while(num != numAleatorio); 
		
			System.out.println("\nCorrecto");
			System.out.println("\tNumero de intentos: " + intentos);
	}

}
