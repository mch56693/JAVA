package ARRAYS.EJERCICIOS;

 /**
* Romper una frase en palabras con el método split de la clase String
* Se utiliza el caracter " " como delimitador y 0 como segundo parámetro para "romper" toda la frase
* El resultado es un array de Strings (2 dimensiones) que se recorre con 2 bucles anidados
* 1 FOR EACH para ir palabra a palabra y un for interno para ir letra a letra
*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println ("teclea una frase para descomponer en palabras: ");
        String frase = new String (sc.nextLine());
        
        String[] palabras = frase.split(" ",0);
        
        for (String palabra:palabras)
        {
            for (int i=0;i < palabra.length() ; i++)
            {
               System.out.print(palabra.charAt(i));
            }
            System.out.println();
        }

	/* SIMPLIFICANDO, EN REALIDAD SE PUEDE OBTENER CADA PALABRA COMPLETA DEL ARRAY DE STRINGS QUE DEVUELVE EL METODO SPLIT
	
    for (String palabra:palabras)
        {
            System.out.println(palabra.charAt(i));
        } */
    }
}
   

