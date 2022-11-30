package Ejercicios;

/**  2 PUNTOS
   
  CON LOS 3 TIPOS de bucles Java que hemos trabajado (for | while | do while)
 
  Hacer un programa que recorre un Array de enteros {3,4,5,1,6,0,8,11,0,2,4,7} y mostrar por pantalla:
  LA SUMA DE LOS PARES DEL ARRAY ES : 
  LA SUMA DE LOS IMPARES DEL ARRAY ES: 
  EL NUMERO DE CEROS QUE HAY ES: 
  
  Sólo se valora el ejercicio si el PROCESO está bien hecho. Mostrar sólo el resultado no puntúa
  
  SE OBTIENEN 2 PUNTOS SI SE HACE BIEN CON LOS 3 TIPOS DE BUCLE.
 */

import java.util.*;

public class Pregunta1Alvaro
{
    public static void main (String[] args)
    {
        int[] numerosAlvaro = {3,4,5,1,6,0,8,11,0,2,4,7};    
        
        int sumaPares1 = 0, sumaImpares1 = 0, ceros1 = 0;
        
		for (int i = 0; i < numerosAlvaro.length; i++) {
        	
			if((numerosAlvaro[i]%2==0) && (numerosAlvaro[i]!=0)) {
        		sumaPares1+=numerosAlvaro[i];
        	
        	}else if (numerosAlvaro[i]==0) {
        		ceros1++;
        		
        	}else
        		sumaImpares1+=numerosAlvaro[i];
        		
        	if(i ==0) {
        		ceros1 ++;
        	
        	System.out.println("LA SUMA DE LOS PARES DEL ARRAY ES : " + sumaPares1);
        	System.out.println("LA SUMA DE LOS IMPARES DEL ARRAY ES: " + sumaImpares1);
        	System.out.println("EL NUMERO DE CEROS QUE HAY ES: " + ceros1);
        	}
        }
    }
}
        	
////////////////////////////////////////////////////////////////////////////////////////////
        	
        	/*int sumaPares2 = 0, sumaImpares2 = 0, ceros2 = 0;
        	int r = 0;
        	
        	do {
        		if((numerosAlvaro[r]%2==0) && (numerosAlvaro[r]!=0)) {
        		sumaPares2+=numerosAlvaro[r];
        		
        	}else if (numerosAlvaro[r]==0) {
        		ceros2++;
        		
        	}else
        		sumaImpares2+=numerosAlvaro[r];
        	
        	}while (numerosAlvaro[r]<=numerosAlvaro.length);
        	
        	System.out.println("LA SUMA DE LOS PARES DEL ARRAY ES : " + sumaPares2);
        	System.out.println("LA SUMA DE LOS IMPARES DEL ARRAY ES: " + sumaImpares2);
        	System.out.println("EL NUMERO DE CEROS QUE HAY ES: " + ceros2);     	
        	}
        }  */
        	
/////////////////////////////////////////////////////////////////////////////////////////////////
 
        	/*int sumaPares3 = 0, sumaImpares3 = 0, ceros3 = 0;
        	int n = 0;
        	
        	while ((numerosAlvaro[n]%2==0) && (numerosAlvaro[n]!=0)) {
        		sumaPares3+=numerosAlvaro[n];
            	
        	while ((numerosAlvaro[n]%2!=0) && (numerosAlvaro[n]==0)) {
        		sumaImpares3+=numerosAlvaro[n];
        		
            while (numerosAlvaro[n]==0) {
                	ceros3++;
               
        	
        	}while (numerosAlvaro[n]<=numerosAlvaro.length);
        		
        	}
        	System.out.println("LA SUMA DE LOS PARES DEL ARRAY ES : " + sumaPares3);
        	System.out.println("LA SUMA DE LOS IMPARES DEL ARRAY ES: " + sumaImpares3);
        	System.out.println("EL NUMERO DE CEROS QUE HAY ES: " + ceros3);
    		}
    }
}*/

