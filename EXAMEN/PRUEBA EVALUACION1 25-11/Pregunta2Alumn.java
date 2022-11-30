/**
    2 PUNTOS 
    
    Tenemos un Array de 2 dimensiones llamado faltasAlumn, igual que el de los ejemplos de clase
    Tiene 9 filas (1 por mes) y 10 columnas (1 por alumn@)
    
    Hacer un programa para mostrar por pantalla los alumnos/as que tienen
    10 o más faltas en un mes que se solicita por teclado.
    
    El usuario/a puede teclear el mes en minúsculas, mayúsculas o mezcla.
    
    Por ejemplo: si el usuario/a teclea el mes de Febrero, la salida será:
    
    Listado de alumnos/as con 10 o más faltas en FEBRERO:
    -----------------------------------------------------
    Antonio
    Bea
    Luis
    Pepe
 */

public class Pregunta2Alumn
{
   public static void main(String[] args) {
        int[][]faltasAlumn ={
                            {10,0,11,5,6,8,0,3,11,5},
                            {0,12,20,4,15,6,8,20,1,0},
                            {9,10,2,4,5,0,10,8,6,0},
                            {0,0,2,5,6,5,10,3,0,5},
                            {0,11,10,4,5,6,8,20,1,10},
                            {0,0,12,4,5,3,10,8,16,0},
                            {0,12,10,5,6,8,0,3,6,15},
                            {0,5,10,14,5,6,8,20,1,0},
                            {12,10,12,4,5,0,10,8,6,0},
                            };
        String[] meses = {"OCTUBRE","NOVIEMBRE","DICIEMBRE","ENERO","FEBRERO","MARZO",
                        "ABRIL","MAYO","JUNIO"};                    
        String[] nombres = {"Luisa", "Antonio", "Bea", "Eva", "Juan", "Lucas",
                           "Ana", "Luis", "Pepa", "Pepe"};
   
                        
   }
}

