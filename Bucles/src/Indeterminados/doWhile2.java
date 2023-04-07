package Indeterminados;

import java.util.*;

public class doWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub -------- PESO IDEAL HOMBRE / MUJER
		
		String genero = "";
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Eres hombre (H) o mujer (M)");
			genero = teclado.next();
			
		}while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
			System.out.println("Teclea cuanto mides en (cm):");
				int altura = teclado.nextInt();
				int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoIdeal = altura - 110;
			
		}else if(genero.equalsIgnoreCase("M")) {
			
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + "kg");
	}

}
