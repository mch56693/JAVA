package bulcesAnidados;

import java.util.Scanner;
public class rectangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas, columnas;
		
		do{
			System.out.print("Teclea número de filas de \"*\" : ");
			filas = sc.nextInt();
		}while(filas < 2);
		
		do{
			System.out.print("Teclea número de columnas de \"*\" : ");
			columnas = sc.nextInt();
		}while(columnas < 2);
		
		for(int i = 1; i <= filas; i++){    
			for(int j = 1; j <= columnas; j++){ 
			
		System.out.print(" * ");
		}  
		System.out.println();
		}  
	}
}
