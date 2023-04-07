package Bidimensionales;

public class ArraysB2 {
	public static void main(String[] args) {
		
		int[][]faltasCurso ={
				{1,0,0,5,6,8,0,3,11,5,0,12,0,4,5,6,8,20,1,0,9,0,2,4,5,0,0,8,6,0},
				{0,0,2,5,6,5,0,3,0,5,0,0,0,4,5,6,8,20,1,0,0,0,2,4,5,3,0,8,6,0},
				{0,2,0,5,6,8,0,3,6,5,0,5,0,4,5,6,8,20,1,0,12,0,2,4,5,0,0,8,6,0},
				{0,0,0,5,6,8,0,3,12,5,0,0,0,4,5,6,8,20,1,0,3,0,2,4,5,0,0,8,8,0},
				{0,33,0,5,6,8,0,3,6,5,0,4,0,4,5,6,8,20,1,0,5,0,2,4,5,0,7,8,4,0},
				{0,0,0,5,6,11,0,3,14,5,0,7,0,4,5,6,8,20,1,0,14,0,2,4,5,0,0,8,6,0},
				{0,7,0,5,6,13,0,3,12,5,0,0,0,4,5,6,8,20,1,0,8,0,2,4,5,12,0,5,6,0},
				{0,0,0,5,6,8,0,3,9,5,0,21,0,4,5,6,4,11,19,0,5,0,2,4,5,0,0,8,6,0},
				{0,9,0,5,6,8,0,3,11,5,0,0,0,4,5,6,8,20,1,0,0,0,2,7,5,4,0,8,6,0},
				};
		for (int f=0; f<faltasCurso.length; f++)  {
			float totalFaltas=0;
			for (int c=0; c<faltasCurso[f].length; c++) {   
				totalFaltas+=faltasCurso[f][c];
			}
		float mediaFaltas = totalFaltas/faltasCurso[f].length 30;       
		
		System.out.println("La media de faltas por alumno en elmes " + f + " es: " + mediaFaltas);
		}
	}
}

