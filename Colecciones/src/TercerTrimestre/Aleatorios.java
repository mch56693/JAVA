package TercerTrimestre;
/*
 * 	- (1) Crea un ArrayList llamado "Aleatorios", con 20 numeros aleatorios del 0 al 10
 *  - (2) Copiarlo a un Linked List llamado Aleatorios2
 *  - (3) Imprimir ambos (for-each)
 *  - (4) Ordenar Aleatorios1 de menor a mayor y Aleatorios2 de mayor a menor.
 *  - (5) Averiguar cuantas veces aparece el numero 7 en aleatorios1 (contains)
 *  - (6) Borrar todos los 7
 *  - (7) Calcular el máximo y el mínimo de la lista y rellenar: Aleatorio1 con el MAXIMO y Aleatorio2 con el MINIMO.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Aleatorios {

	public static void main(String[] args) {	

//Ej1 -------------------------------------------------------------------------------------------------------------------------------------------------------
		
		ArrayList<Integer> aleatorios1 = new ArrayList<Integer>();
		
		System.out.println("ArrayList de 20 numeros aleatorios:");
		for(int i = 0; i < 20; i++) {
			aleatorios1.add((int) (Math.random()*11));
		}
		
		
		
		
		
//Ej2 -------------------------------------------------------------------------------------------------------------------------------------------------------
		
		for(Integer i: aleatorios1) {
			
			System.out.println(i);
		}

		LinkedList<Integer> aleatorios2 = new LinkedList<Integer>();
		
		System.out.println("\nLinkedList de 20 numeros aleatorios:");
		
		for(Integer i: aleatorios1) {
			aleatorios2.add((int) (Math.random()*11));	
			
			System.out.println(i);
		}
		
		
		
		
		
//Ej3 -------------------------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("\nAleatorios1 de menor a mayor:");
			Collections.sort(aleatorios1);
		
			System.out.println(aleatorios1);
			
			
		System.out.println("\nAleatrios 2 de mayor a menor:");
			Collections.sort(aleatorios2);
			Collections.reverse(aleatorios2);
		
			System.out.println(aleatorios2);
			
			
			
			
			
//Ej6 -------------------------------------------------------------------------------------------------------------------------------------------------------
			
		System.out.println("\nEl numero minimo es:" + aleatorios1.get(0));
		System.out.println("El numero maximo es:" + aleatorios2.get(0));
	
	
		
		
	
//Ej4 -------------------------------------------------------------------------------------------------------------------------------------------------------
		
		int cont = 0;
		for(Integer i: aleatorios1) {
			if(aleatorios1.contains(7)) {
				if (i == 7) {
					cont++;
			}
				
		}else {
			System.out.println("\nNo aparece.");
			break;
			}
		}
			System.out.println("\nEl 7 aparce: " + cont + " veces en Aleatorios1.");

			
			
		
		
//Ej5 -------------------------------------------------------------------------------------------------------------------------------------------------------
		
		if (aleatorios1.contains(7) == true) {
			
			cont = 0;
			
			for(int i = 0; i < aleatorios1.size(); i++) {
				if(i == 7) {
					aleatorios1.remove(i);
					cont++;
				} 
			}
				System.out.println("Se han eliminado: " + cont + " siete/s");	
				
			}
		}		
	}


