/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package TercerTrimestre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AleatoriosSOL {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //CREACION ArrayList aleatorios1 - 20 numeros aleatorios entre 0 y 10
        ArrayList<Integer> aleatorios1 = new ArrayList<>(); 
       
        for (int i=1;i<=20;i++){
            aleatorios1.add((int)(Math.random() * 11));
        }
        
        //CREACION LinkedList aleatorios2  - copia directa en su misma declaración de (aleatorios1)
 
        LinkedList<Integer> aleatorios2 = new LinkedList<>(aleatorios1) ; 
       
        //IMPRIMO COLECCIONES PARA VER CONTENIDO
	System.out.print("\nArrayList Aleatorios1: " + aleatorios1  );
        System.out.print("\nLinkedList Aleatorios2: " + aleatorios2  );  	
      
	// ORDENAR aleatorios1 DE MENOR A MAYOR y aleatorios2 DE MAYOR A MENOR
	Collections.sort(aleatorios1);
        Collections.sort(aleatorios2);
        Collections.reverse(aleatorios2);
        
        //IMPRIMO COLECCIONES PARA VER CONTENIDO
	System.out.println();
        System.out.print("\nArrayList Aleatorios1: " + aleatorios1  );
        System.out.print("\nLinkedList Aleatorios2: " + aleatorios2  );
        System.out.println();
        
        // PREGUNTAR SI APARECE UN NÚMERO [1-10] INTRODUCIDO POR TECLADO
        // SI APARECE, CONTAR EL NÚMERO DE VECES QUE LO HACE
	System.out.print("\nNÚMERO PARA BUSCAR EN LAS LISTAS ?");
        int num=sc.nextInt();        
        int cont=0;
        if (aleatorios1.contains(num)){
            for (Integer i: aleatorios1){ 
                if (i==num) cont ++;  	
            }
            System.out.println("\nEl " + num + " aparece: " + cont + " veces");
        }else{
            System.out.println("\nEl " + num + " no aparece NUNCA");
        }
        
	//ELIMINAR TODAS LAS APARICIONES DEL NÚMERO ANTERIOR EN AMBAS COLECCIONES -
	/* Con aleatorios.remove(num) sólo logramos eliminar la 1ª aparición de num,
        pero si aparece varias veces no nos sirve.
        La solución es emplear el método removeAll() enviandole una lista de Integer como parámetro.
        Con eso se borran todos los números de la lista enviada, y todas las veces que aparezcan */

	ArrayList<Integer> aux = new ArrayList<Integer>(List.of(num));
        aleatorios1.removeAll(aux);
        aleatorios2.removeAll(aux);
        
	//IMPRIMO COLECCIONES PARA VER CONTENIDO        
	System.out.println();
        System.out.print("\nAL Aleatorios1 (num eliminado): " + aleatorios1  );
        System.out.print("\nLL Aleatorios2 (num eliminado): " + aleatorios2  );
        System.out.println();
        
        //CALCULO MÁXIMO Y MÍNIMO
        //EN UNA COLECCIÓN NO ORDENADA       
        int max=0,min=0;
        for (Integer i: aleatorios1){ 
            max=Math.max(max,i);
        }
        for (Integer i: aleatorios2){ 
            min=Math.min(min,i);
        }
        //EN UNA COLECCIÓN ORDENADA Y CON ACCESO POR ÍNDICE POSICIONAL
        max=aleatorios1.get(aleatorios1.size()-1); //aleatorios1 esta ordenado de < a >
        min=aleatorios1.get(0);
        
        
        //RELLENO aleatorios1 CON EL MAX Y aleatorios2 CON EL MIN
	Collections.fill(aleatorios1,max);
        Collections.fill(aleatorios2,min);
        
        //IMPRIMO COLECCIONES PARA VER CONTENIDO
	System.out.println();
        System.out.print("\nArrayList Aleatorios1: " + aleatorios1  );
        System.out.print("\nLinkedList Aleatorios2: " + aleatorios2  );
    }
}
