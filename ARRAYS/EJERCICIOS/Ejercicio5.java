package ARRAYS.EJERCICIOS;

/**
* Programa que lee una serie de nombres por teclado y los ordena alfabéticamente
* Una vez ordenados los imprime por pantalla
* Antes ha de preguntar cuantos nombres se van a introducir pues sabemos que los ARRAYS "nacen" con un 
* tamaño fijo.
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println ("¿Cuantos nombres vas a teclear? ");  
        n=sc.nextInt();
        String[] nombres =new String[n];
        
        //llenar el Array con n nombres
        for (int i=1;i<=n; i++)
        {
          if (i==n)
          {
            System.out.println ("El último nombre por favor: "+ i);
            nombres[i-1]=sc.next();
          } else { 
            System.out.println ("Vamos con el nombre num "+ i);
            nombres[i-1]=sc.next();
          }
        }
         
        //ordenar los nombres
        String menor = new String(); 
        
        for (int i=0;i<nombres.length; i++)
        {
            menor = nombres[i];
            int posMenor = i;
            /* partiendo de la 1ª posición asumo que el elemento que hay en esa
             * posición inicial es el menor y lo almaceno en el string auxiliar "menor",
             * y su posición en "posMenor".
             * A partir de ahí voy iterando posición a posición del Array,
             * comparando uno a uno cada nuevo elemento con el String "menor" actual.
             * Si el nuevo elemento es menor que "menor", ese nuevo elemento pasa a
             * ser el nuevo "menor", y su posición la nueva "posmenor".
             * Al final de cada pasada el string "menor" y la posición "posMenor"
             * contienen el menor elemento de toda esa pasada y su posición. 
             * 
             * Lo intercambio con la posición de partida de esa pasada y ya está.
             * 
             * la 1ª pasada empieza en la posición i=0 y despues de ella ya tendré 
             * el menor valor en la posición 0
             * A partir de ahí sigo haciendo pasadas desde la siguiente 
             * posición del Array, y así hasta el final. 
             */
            for (int j=i;j<nombres.length; j++) //busca el menor de todos los elementos
            {
              if (menor.compareTo(nombres[j]) > 0)
              {
                menor = nombres[j];
                posMenor = j;
              } 
            }
            nombres[posMenor]=nombres[i];
            nombres[i]=menor;
        }
        
        //listar los nombres ordenados por pantalla FOR EACH
        for (String nombre:nombres)
        {
             System.out.println (nombre);                      
        }      
    }
}

