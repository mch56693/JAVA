package BidimBasicos;

public class forBi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] matrizBi = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
			};
		
		for (int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
				
				System.out.println(matrizBi[i][j] + " ");
			}
		}
				
	}

}
