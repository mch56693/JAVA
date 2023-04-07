package Determinados;

import java.util.*;

public class for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -------- COMPROBAR E-MAIL

		int arroba = 0;
		boolean punto = false;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce una direccion de correo electrónico:");
		String email = teclado.next();
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i) == '@') {
				arroba++;
			}
			if(email.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if(arroba == 1 && punto == true) {
			System.out.println("Es correcto.");
		}
			else {
				System.out.println("NO es correcto.");
		}
	}
}
