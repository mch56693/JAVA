

/**
 * Vamos a hacer una Clase con utilidades para Arrays de números enteros (int) de 1 dimensión
 * 
 * Tendrá una serie de métodos:
 * 
 *  void ordenaMenorMayor (int[] a)  -- ordena de menor a mayor un Array  
 *  void ordenaMayorMenor (int[] a)  -- ordena de mayor a menor un Array 
 *  int maxArray (int[] a)           -- calcula el número MAYOR del Array
 *  int minArray (int[] a)           -- calcula el número MENOR del Array
 *  int totalArray (int[] a)         -- calcula el total del Array
 *  void rellenaArray(int[] a, int r)-- rellena el Array con un número que se pasa como parámetro
 *   
 * @author Eduardo 
 * @version 1.0 NOVIEMBRE 2022
 */
public class Utilidades
{
    static void ordenaMenorMayor (int[] a)
    {
       int menor = 0; 
       for (int i=0;i<a.length; i++)
       {
           menor = a[i];
           int posMenor = i;
           for (int j=i;j<a.length; j++) //busca el menor de todos los elementos
            {
              if (menor > a[j])
              {
                menor = a[j];
                posMenor = j;
              } 
            }
            a[posMenor]=a[i];
            a[i]=menor;
       }
    };  
    
    static void ordenaMayorMenor (int[] a)
    {
       int mayor = 0; 
       for (int i=0;i<a.length; i++)
       {
           mayor = a[i];
           int posMayor = i;
           for (int j=i;j<a.length; j++) //busca el mayor de todos los elementos
            {
              if (mayor < a[j])
              {
                mayor = a[j];
                posMayor = j;
              } 
            }
            a[posMayor]=a[i];
            a[i]=mayor;
       }    
    };
    
    static int maxArray (int[] a)
    {
        int max=a[0];
        for(int n:a)
        {
            max=Math.max(max,n);
        }
        return max;
    };
    
    static int minArray (int[] a)
    {
        int min=a[0];
        for(int n:a)
        {
            min=Math.min(min,n);
        }
        return min;
    };
    
    static int totalArray (int[] a)
    {
       int tot=0;
       for(int n:a)
       {
            tot+=n;
       }
       return tot; 
    };
    
    static void rellenaArray(int[] a, int r)
    {
       for(int i=0;i < a.length; i++)
       {
            a[i]=r;
       }
    };
}