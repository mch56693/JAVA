package EJERCICIOS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejemplo1 {
	    public static void main( String[] args ){
	        //declaración+construcción objeto teclado
	        Scanner teclado = new Scanner( System.in ); 
	        
	        // declaración del valor constante PI 3.1416. También podemos usar directamente Math.PI
	        final float pi=3.1416f;   
	        
	        //petición de dato por teclado para asignar en vble radio
	        System.out.print("Teclea el radio de la circunferencia: "); 
	        int radio = teclado.nextInt(); 
	        
	        double longitud = (2 * Math.PI *radio); // calculamos la longitud (perímetro) con CTE PI de la clase Math
	        double area = pi * Math.pow(radio,2); // calculamos el radio - con nuestra CTE pi
	        
	        //Mostramos los valores calculadoscon sólo 2 decimales 
	        DecimalFormat df = new DecimalFormat ("#.00");
	        System.out.println("El perimetro de la circunferencia es:  " + df.format(longitud));
	        System.out.println("El área de la circunferencia es:  " + df.format(area));
	        
		//Otra versión sería no sólo mostrar, sino también MODIFICAR el valor de area y longitud a 2 decimales
		longitud = (double)Math.round(longitud*100)/100;
	        area = (double)Math.round(area*100)/100;
	        System.out.println(longitud);
		System.out.println(area);
	    }
	}
