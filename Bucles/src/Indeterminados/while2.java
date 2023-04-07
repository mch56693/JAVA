package Indeterminados;

import java.util.*;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -------- ADIVINA UN NUMERO
		
		int numAleatorio = (int)(Math.random()*100);
		
		Scanner teclado = new Scanner(System.in);
		
			int num = 0;
			int intentos = 0;
		
		while(num != numAleatorio) {
			intentos++; 
			
			System.out.println("Introduce un numero:");
			num = teclado.nextInt();
			
			if(numAleatorio < num) {
				System.out.println("Mas abajo\n");
				
			}else if(numAleatorio > num) {
				System.out.println("Mas arriba\n");
			}
		}
		System.out.println("\nCorrecto");
		System.out.println("\tNumero de intentos: " + intentos);
	}

}
