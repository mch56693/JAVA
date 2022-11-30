package ARRAYS.EJERCICIOS;
/* En el ejercicio del Array de faltas, lo reducimos a 10 alumnos y lo complementamos
* Con un Array con los nombres de los alumnos/as para escribir los nombres de los alumnos
* que más faltan tienen y los que menos faltas tienen
* 
* NO SE INTRODUCEN DATOS POR TECLADO. RESULTADOS DISTINTOS SE OBTIENEN MODIFICANDO
* LOS DATOS DE LOS ARRAYS
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] faltas = {0,11,0,5,6,8,0,3,11,5};
        String[] nombres = {"Luisa", "Antonio", "Noelia", "Eva", "Juan", "Lucas",
                            "Ana", "Luis", "Pepa", "Pepe"};
        int maxFaltas, minFaltas;
        maxFaltas = minFaltas = 0;  
        for (int i=0; i<faltas.length; i++)
        {
            maxFaltas = Math.max(maxFaltas,faltas[i]);
            minFaltas = Math.min(minFaltas,faltas[i]);
        }
        
        // Nuevos bucles para averiguar en que posiciones se encuentran maxFaltas y minFaltas
        
        System.out.println ("ALUMNOS/AS QUE MÁS FALTAN: "); 
        int totMax = 0;
        for (int i=0; i<faltas.length; i++)
        {
            if (faltas[i] == maxFaltas) {
                System.out.println ("El alumno/a: " + nombres[i] + " tiene "+ maxFaltas + " faltas");
                totMax++;
            }
        }
        System.out.println ("En total, " + totMax + " alumnos/as tienen " + maxFaltas + " faltas"); 
        
        System.out.println ("ALUMNOS/AS QUE MENOS FALTAN: "); 
        int totMin = 0;
        for (int i=0; i<faltas.length; i++)
        {
            if (faltas[i] == minFaltas) {
                System.out.println ("El alumno/a: " + nombres[i] + " tiene "+ minFaltas + " faltas");
                totMin++;
            }
        }
        System.out.println ("En total, " + totMin + " alumnos/as tienen " + minFaltas + " faltas"); 
    }
}
