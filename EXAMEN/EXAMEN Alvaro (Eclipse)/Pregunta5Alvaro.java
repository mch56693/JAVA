package Ejercicios;

import java.util.Scanner;

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

import java.util.*;

public class Pregunta5Alvaro{
    public static void main(String[] args) {
        
        String charsAlvaro = new String("abcdefghijklmnñopqrstuvxyzABCDEFGHYJKLMNÑOPQRSTUVXYZ1234567890");
        
        Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe los usuarios aleatorios requeridos: ");
		int entrada = teclado.nextInt();

		int [] numsAlvaro = new int [entrada];
		for (int i=0; i < numsAlvaro.length; i++) {
			numsAlvaro[i] = (int)Math.random()*123456789+1;
		}
		for (int i=0; i < numsAlvaro.length; i++) {
			
		System.out.println(numsAlvaro [i]+ "@educastur.es");
        // TAMBIEN SE PUEDE HACER USANDO LA TABLA DE CODIGOS INTERNA DEL SISTEMA
        // PERO ESO NO LO DIMOS EN CLASE. SI ALGUIÉN LO HACE ASÍ SE LE VALORARÁ IGUALMENTE
       
        
		}        
    }
}