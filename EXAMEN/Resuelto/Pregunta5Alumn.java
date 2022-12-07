package EXAMEN.RESUELTO;
/** 
 2 PUNTOS
 
 Crear de forma aleatoria usuarios de educastur de la siguiente forma: "c4Z5gTy2@educastur.es"

  "8 CARACTERES ALFANUMÉRICOS (Mezcla de Minúsculas|Mayúsculas|números) + @educastur.es"

PARTIMOS de un String charsAlumn con todas las minúsculas, Mayúsculas y números.
Sabemos que podemos acceder a cualquier caracter individual del String con el método charAt(posicion);
Sólo hay que sacar 8 posiciones aleatorias y con esos 8 caracteres crear el usuario educastur:

          8 posiciones aleatorias de charsAlumn + @educastur.es

Hay que crear tantos usuarios educastur como se nos indique por teclado, y mostrarlos por pantalla.
Lo recomendable es intentar crear al menos un usuario, y posteriormente ampliar el ejercicio
para que pida por teclado cuantos usuarios queremos crear.

*/

//HAY MÚLTIPLES ALTERNATIVAS PARA REALIZAR ESTE EJERCICIO. SE PROPONE UNA

import java.util.Scanner;

public class Pregunta5Alumn{
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String charsAlumn = new String("abcdefghijklmnñopqrstuvxyzABCDEFGHYJKLMNÑOPQRSTUVXYZ1234567890");
       System.out.println("Cuantos usuarios quieres crear: ?");
       int tamaño=sc.nextInt();
       
       char[] cadena= new char[8];  //Array de 8 chars para cada usuario individual (tamaño 8)
       String[] usuarios = new String[tamaño]; //Array de Strings para todos los usuarios
       
       for (int i=0; i<usuarios.length; i++) //Bucle for para crear tantos usuarios como me pidan
       {
            for(int j=0; j<8;j++) 
            {
                //lleno el Array cadena con 8 caracteres aleatorios
                cadena[j]=charsAlumn.charAt((int)(Math.random()*charsAlumn.length()));
            } 
            usuarios[i]=usuarios[i].valueOf(cadena) + "@educastur.es";
            //almaceno el usuario creado en el Array de usuarios
       }
       
       //IMPRIMO EL ARRAY DE STRINGS
       for (String s:usuarios)
       {
           System.out.println(s); 
       }       
    }
       
}  