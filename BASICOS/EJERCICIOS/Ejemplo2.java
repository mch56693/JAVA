package Ejercicios;

import java.util.Scanner;
public class Ejemplo2 {
    
    public static void main( String[] args ){
        
        Scanner teclado = new Scanner( System.in );
            
        System.out.print("Teclea una frase: "); 
        String frase = new String(teclado.nextLine());
        /* Declaro un objeto de tipo String y en la misma instrucción 
         * llamo al constructor pasándole como parámetro una llamada al método 
         * nextLine del objeto teclado que sirve para solicitar por teclado una cadena 
         * Es el método resumido de hacer las cosas. Hay que acostumbrarse, 
         * pues estamos haciendo de una tacada:
         * 
         *  String frase;
         *  frase = new String();
         *  frase = teclado.nextLine();
         */

        String fraseM = new String (frase.toUpperCase()); 
        /* en otro objeto String almaceno la frase pasada a Mayúsculas.
         * También se podía haber hecho en 3 pasos, pero es mejor hacerlo en 1
         *  String fraseM;
         *  fraseM = new String();
         *  fraseM = frase.toUpperCase();
         */
        
        System.out.println(fraseM); 
     }
}