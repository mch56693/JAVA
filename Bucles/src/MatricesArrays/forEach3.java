package MatricesArrays;

import java.util.*;

public class forEach3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[8];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<8; i++) {
			
			System.out.println("Introduce un país: " + (i+1));
			String paises = sc.next();
		}
		
		for(String elemento: paises) {
			
			System.out.println("País: " + paises);
			
		}
	}

}
