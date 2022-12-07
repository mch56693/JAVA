package EXAMEN.RESUELTO;
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

import java.util.Scanner;
public class Pregunta4Alumn
{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Tamaño del ARRAY de numeros aleatorios?");
	int tamaño = sc.nextInt();
	int arrayAlumn[] = new int[tamaño];
	System.out.println("Introduce el valor inferior para los aleatorios: ");
	int min = sc.nextInt();
	System.out.println("Ahora el valor superior: ");
	int max = sc.nextInt();
	for (int i = 0; i < arrayAlumn.length; i++) {
        	 arrayAlumn[i] = ((int) (Math.random() * (max - min + 1) + min));
        }   
	System.out.println("EL ARRAY SIN ORDENAR ES: ");
	for (int i : arrayAlumn) {
        	System.out.print(i + " ");
	}

	Utilidades.ordenaMenorMayor(arrayAlumn);

	System.out.println("\nEL ARRAY ORDENADO DE MENOR A MAYOR ES: ");
	for (int i : arrayAlumn) {
        	System.out.print(i + " ");
	}

	Utilidades.ordenaMayorMenor(arrayAlumn);
	
        System.out.println("\nEL ARRAY ORDENADO DE MAYOR A MENOR: ");
	for (int i : arrayAlumn) {
        	System.out.print(i + " ");
	}
	
	System.out.println("\nEL MAYOR NUMERO DEL ARRAY ES: " + Utilidades.maxArray(arrayAlumn)
    	                   + " EL MENOR NUMERO DEL ARRAY ES : " + Utilidades.minArray(arrayAlumn)
			   + " Y LA MEDIA ES: " + ((float)Utilidades.totalArray(arrayAlumn) / arrayAlumn.length));
	sc.close();
    } 
}
