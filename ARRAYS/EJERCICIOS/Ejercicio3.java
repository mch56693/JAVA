package ARRAYS.EJERCICIOS;

/**
* En el ejercicio del Array BIDIMENSIONAL de faltas por meses, lo reducimos a 10 alumnos
* y lo complementamos  Con un Array con los nombres de los alumnos/as
* 
* CALCULAR el/los alumno/a que MÁS Y MENOS han faltado en un MES INTRODUCIDO POR TECLADO
*/

import java.util.Scanner;

public class Ejercicio3 {
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
        int numMes=0;
        String mes;
        
        // HACEMOS UN BUCLE DO-WHILE + SWITCH PARA PROCESAR EL MES QUE ME INTRODUCEN POR TECLADO Y PONERLO EN EL FORMATO NUMERICO ADAPTADO A NUESTRO ARRAY
        do{
            
          System.out.println ("teclea el MES en letra: ");
          mes = new String (sc.nextLine());
          mes=mes.toUpperCase();  //para pasar a mayúsculas las entradas desde teclado
          switch (mes){
            case ("OCTUBRE"):
            {
                numMes=0; //nosotros los tenemos ordenados así en el Array, Octubre es el 1º
                break;
            }
            case ("NOVIEMBRE"):
            {
                numMes=1; 
                break;
            }
            case ("DICIEMBRE"):
            {
                numMes=2; 
                break;
            }
            case ("ENERO"):
            {
                numMes=3; 
                break;
            }
            case ("FEBRERO"):
            {
                numMes=4; 
                break;
            }
            case ("MARZO"):
            {
                numMes=5; 
                break;
            }
            case ("ABRIL"):
            {
                numMes=6; 
                break;
            }
            case ("MAYO"):
            {
                numMes=7; 
                break;
            }
            case ("JUNIO"):
            {
                numMes=8; 
                break;
            }
            default: numMes=99;
          } 
          
        } while (numMes==99);  //obligamos a repetir teclear el mes mientras no me introduzcan un mes válido      
            
        int maxFaltas, minFaltas;
        maxFaltas = minFaltas = 0;  
        
        for (int f:faltasCurso[numMes]) //recorro sólo la fila del Array Bidimensional del mes que nos interesa
        {
            maxFaltas = Math.max(maxFaltas,f);
            minFaltas = Math.min(minFaltas,f);
        }
        
        System.out.println ();       
        System.out.println ("ALUMNOS/AS QUE MÁS FALTARON EN "+ mes + " :"); 
        int totMax = 0;
        for (int i=0; i<faltasCurso[numMes].length; i++)
        {
            if (faltasCurso[numMes][i] == maxFaltas) {
                System.out.println ("El alumno/a " + alumns[i] + " tiene "+ maxFaltas + " faltas");
                totMax++;
            }
        }
        System.out.println ("En total, " + totMax + " alumnos tienen " + maxFaltas + " faltas"); 
        
        System.out.println ("ALUMNOS/AS QUE MENOS FALTARON EN "+ mes + " :");  
        int totMin = 0;
        for (int i=0; i<faltasCurso[numMes].length; i++)
        {
            if (faltasCurso[numMes][i] == minFaltas) {
                System.out.println ("El alumno/a " + alumns[i] + " tiene "+ minFaltas + " faltas");
                totMin++;
            }
        }
        System.out.println ("En total, " + totMin + " alumnos tienen " + minFaltas + " faltas");          
    }
}

