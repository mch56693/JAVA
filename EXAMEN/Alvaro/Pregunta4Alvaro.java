package EXAMEN.Alvaro;
/**
  
  2 PUNTOS
 
  Este ejercicio es para utilizar la clase Utilidades (vista en clase), que ofrece
  una serie de métodos estáticos para trabajar con Arrays con elementos de tipo int
  
  Hacer un programa que:
  
  1. (1 PUNTO) Crea un Array llamado arrayAlumn de números aleatorios de tipo int.
      
      El tamaño del Array se pide por teclado (int tamaño)
      Los números aleatorios serán entre [int n1 - int n2] que también se piden por teclado
  
      Si no se sabe hacer esta parte, para poder hacer el resto del
      ejercicio se puede crear el Array "a mano" con 10 números enteros cualquiera
      
  
     (1 PUNTO)
  2. Imprime el array por pantalla sin ordenar, DE LA FORMA  -- 4 3 5 2 8 9 1 3 3 9 
  3. Imprime el Array ordenado de Menor a Mayor              -- 1 2 3 3 3 4 5 8 9 9
  4. Imprime el Array ordenado de Mayor a Menor              -- 9 9 8 5 4 3 3 3 2 1
  5. Calcula el MÁXIMO, el MÍNIMO y la MEDIA de los valores del Array 
     y los imprime por pantalla CON UNA ÚNICA INSTRUCCIÓN System.out.println();
                                ----------------------------------------------
*/

import java.util.*;

public class Pregunta4Alvaro
{
   public static void main(String[] args) {
	   int n1, n2, tamaño;
	   Scanner teclado = new Scanner (System.in);
	   System.out.print("Introduzca el tamaño del array: ");
	   tamaño= teclado.nextInt();
	   System.out.println("Introduzca el valor MÁXIMO del array: ");
	   n1= teclado.nextInt();
	   System.out.println("Introduzca el valor MÍNIMO del array: ");
	   n2= teclado.nextInt();
	   
	   int[] arrayAlvaro = new int [tamaño];
	   
	   for(int i=0; i < arrayAlvaro.length; i++) {
	   arrayAlvaro[i] = (int) (Math.random()*n1 + n2);
	   }
	   for(int i=0; i < arrayAlvaro.length; i++) {
		   System.out.print(arrayAlvaro[i] + " ");
			 
	   }
	   
   }
}
