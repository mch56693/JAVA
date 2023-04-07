package Extras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		final float pi = 3.1416f;
		
		System.out.println("Teclea el radio de la circunferencia: ");
		int radio = sc.nextInt();
		
		double longitud = (2 * Math.PI * radio);
		double area = pi * Math.pow(radio, 2);
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("El perimetro de la circunferencia es: " + df.format(longitud));
		System.out.println("El área de la circunferencia es: " + df.format(area));
		
		longitud = (double)Math.round(longitud*100)/100;
        	area = (double)Math.round(area*100)/100;
        
        System.out.println(longitud);
        System.out.println(area);
	}
}
