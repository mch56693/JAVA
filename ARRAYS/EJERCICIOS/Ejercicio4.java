package ARRAYS.EJERCICIOS;

/**
* PARECIDO AL EJERCICIO ANTERIOR, PERO ESTA VEZ SOLICITAMOS EL NOMBRE DE UN ALUMNO/A POR TECLADO
* PARA MOSTRAR LAS FALTAS QUE HA TENIDO ESE ALUMNO/A EN CADA MES DEL CURSO
* 
* EN EL EJERCICIO ANTERIOR USAMOS UN SWITCH PARA PASAR EL MES A NÚMERO Y ASÍ SABER QUE
* FILA DEL ARRAY BIDIMENSIONAL CORRESPONDE AL MES INTRODUCIDO POR TECLADO
* 
* PODRÍAMOS HACER LO MISMO EN ESTE EJERCICIO PARA AVERIGUAR QUE ALUMNO/A ME HAN TECLEADO Y
* TRABAJAR CON LA COLUMNA ADECUADA. PERO SI TENEMOS MUCHOS ALUMNOS EL SWITCH QUEDARÍA MUY GRANDE 
* 
* 
* EN LUGAR DE HACERLO CON UN SWITCH LO HAREMOS ESTA VEZ CON EL MÉTODO equalsIgnoreCase
* PARA BUSCAR EN EL ARRAY DE NOMBRES DEL ALUMNADO EL ALUMNO/A QUE ME HAN TECLEADO.
* 
* TANTO EL EJERCICIO ANTERIOR COMO ESTE SE PODRÍAN HACER DE VARIAS FORMAS
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][]faltasCurso ={
                            {1,0,0,5,6,8,0,3,11,5},
                            {0,12,0,4,5,6,8,20,1,0},
                            {9,0,2,4,5,0,0,8,6,0},
                            {0,0,2,5,6,5,0,3,0,5},
                            {0,0,0,4,5,6,8,20,1,0},
                            {0,0,2,4,5,3,0,8,6,0},
                            {0,2,0,5,6,8,0,3,6,5},
                            {0,5,0,4,5,6,8,20,1,0},
                            {12,0,2,4,5,0,0,8,6,0},
                            };
        String[] meses = {"OCTUBRE","NOVIEMBRE","DICIEMBRE","ENERO","FEBRERO","MARZO",
                        "ABRIL","MAYO","JUNIO"};                    
        String[] alumns = {"Luisa", "Antonio", "Noelia", "Eva", "Juan", "Lucas",
                           "Ana", "Luis", "Pepa", "Pepe"};
                
        Scanner sc= new Scanner(System.in);
        int posAlumn=0;
        boolean existeAlum=false;
        String alumn;
        
        do{
          System.out.println ("teclea el ALUMNO/A para ver sus faltas: ");
          alumn = new String (sc.nextLine());
          
          for (int i=0;i<alumns.length; i++)
          {
              if (alumn.equalsIgnoreCase(alumns[i]))
              {
                posAlumn=i;
                existeAlum=true;
              }                       
          }
          
        } while (existeAlum == false);  //obligamos a repetir teclear alumno/a mientras no me introduzcan 
                                  // un alumno/a que exista en el Array      
                          
        System.out.println("Las faltas del alumno/a "+ alumn.toUpperCase() + " en cada mes del curso han sido:"); 
        
        for (int mes=0;mes<9;mes++)//recorro sólo la fila del Array Bidimensional del mes que nos interesa
        {
            System.out.println( meses[mes] + " : " + faltasCurso[mes][posAlumn]);
        }
    }
}

