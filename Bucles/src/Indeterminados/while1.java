package Indeterminados;

import java.util.*;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -------- ACCESO
				
		String clave = "Alvaro";
		String password = "";
		
		Scanner sc = new Scanner(System.in);
		
		
		while(clave.equals(password) == false) {
			System.out.println("Introduce la contraseña:");
			String txt = sc.nextLine();
			
			if(txt.equals(clave) == false) {
				System.out.println("La contraseña es incorrecta.");		
			
			} else if(txt.equals(clave) == true) {
				System.out.println("La contraseña es correcta. Acceso Permitido.");
					break;
			}
		}
		
	}

}
