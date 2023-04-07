package pack;

import java.util.Scanner;

public class PruebaUtilidades
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array1={4,55,76,2,4,90,78};
        int[] array2={55,79,111,34,5,7,87,7,64,55,76};
        int[] array3={33,41,5,76,22,14,9,7,15,65,32,6,44,21};
        
        System.out.println("Máximo Array 1: " + Utilidades.maxArray(array1));  
        System.out.println("Máximo Array 2: " + Utilidades.maxArray(array2));
        System.out.println("Máximo Array 3: " + Utilidades.maxArray(array3));
        System.out.println("Mínimo Array 1: " + Utilidades.minArray(array1));
        System.out.println("Mínimo Array 2: " + Utilidades.minArray(array2));
        System.out.println("Mínimo Array 3: " + Utilidades.minArray(array3));
        System.out.println("Total Array 1: " + Utilidades.totalArray(array1));
        System.out.println("Total Array 2: " + Utilidades.totalArray(array2));
        System.out.println("Total Array 3: " + Utilidades.totalArray(array3));
        Utilidades.ordenaMenorMayor(array1);
        Utilidades.ordenaMenorMayor(array2);
        Utilidades.ordenaMenorMayor(array3);
        for (int n:array1)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:array2)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:array3)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        
        Utilidades.ordenaMayorMenor(array1);
        Utilidades.ordenaMayorMenor(array2);
        Utilidades.ordenaMayorMenor(array3);
        for (int n:array1)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:array2)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:array3)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        
        System.out.println("Teclea el número de relleno para el Array 1: ");
        Utilidades.rellenaArray(array1, sc.nextInt());
        System.out.println("Teclea el número de relleno para el Array 2: ");
        Utilidades.rellenaArray(array2, sc.nextInt());
        System.out.println("Teclea el número de relleno para el Array 3: ");
        Utilidades.rellenaArray(array3, sc.nextInt());
        for (int n:array1)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:array2)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int n:array3)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
