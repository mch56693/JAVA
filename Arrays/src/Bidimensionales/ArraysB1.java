package Bidimensionales;

public class ArraysB1 {
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
		for (int f=0; f<9; f++) {
			for (int c=0; c<30;c++) {     
				
			System.out.print(faltasCurso[f][c]+" ");
			}
			
		System.out.println();
		}
	}
}
