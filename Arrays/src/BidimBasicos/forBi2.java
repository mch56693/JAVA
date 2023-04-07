package BidimBasicos;

public class forBi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] matrizBi = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
			};
		
		for(int[]filas : matrizBi) {
			System.out.println();			
			
			for(int z: filas) {
				System.out.println(z + " ");
			}
		}
				
	}

}
