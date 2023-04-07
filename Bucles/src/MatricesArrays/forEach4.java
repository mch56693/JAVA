package MatricesArrays;

import java.util.*;

public class forEach4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numsAleatorios =  new int [150];
		
		for(int i=0; i<numsAleatorios.length; i++) {
			
			numsAleatorios[i] = (int) Math.round(Math.random()*100);
			
		}
		
		for(int numeros: numsAleatorios) {
			
			System.out.println(numeros + " ");
			
		}
	}

}
