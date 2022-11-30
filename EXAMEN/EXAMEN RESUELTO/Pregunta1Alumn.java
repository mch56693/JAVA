
/**  2 PUNTOS
   
  CON LOS 3 TIPOS de bucles Java que hemos trabajado (for | while | do while)
 
  Hacer un programa que recorre un Array de enteros {3,4,5,1,6,0,8,11,0,2,4,7} y mostrar por pantalla:
  LA SUMA DE LOS PARES DEL ARRAY ES : 
  LA SUMA DE LOS IMPARES DEL ARRAY ES: 
  EL NUMERO DE CEROS QUE HAY ES: 
  
  Sólo se valora el ejercicio si el PROCESO está bien hecho. Mostrar sólo el resultado no puntúa
  
  SE OBTIENEN 2 PUNTOS SI SE HACE BIEN CON LOS 3 TIPOS DE BUCLE.
 */

public class Pregunta1Alumn
{
    public static void main (String[] args)
    {
        int[] numerosAlumn = {3,4,5,1,6,0,8,11,0,2,4,7};    
        
        int totPares, totImpares, totCeros;
        totPares = totImpares = totCeros = 0;
        
        for (int i=0; i<numerosAlumn.length; i++)
        {
            if (numerosAlumn[i] == 0)
            {
                totCeros++;
            }
            else if (numerosAlumn[i] % 2 == 0)
                {
                    totPares+=numerosAlumn[i];
                }else
                    {
                        totImpares+=numerosAlumn[i];
                    }
        }
        System.out.println("LA SUMA DE LOS PARES DEL ARRAY ES: " + totPares);
        System.out.println("LA SUMA DE LOS IMPARES DEL ARRAY ES: " + totImpares);
        System.out.println("LA SUMA DE LOS CEROS DEL ARRAY ES: " + totCeros);
    }
    
    /* FALTARÍA REALIZAR EL MISMO PROCESO CON UN BUCLE WHILE Y UN BUCLE DO-WHILE
     CADA NUEVO PROCESO SE REINICIAN totPares = totImpares = totCeros = 0;
     Y SE DECLARA UNA VARIABLE DE CONTROL (por ejemplo i) para el WHILE Y DO-WHILE */
    
}
