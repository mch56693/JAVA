package PDF;

public class Arrays2 {
	public static void main(String[] args) {
		
		int[] faltas = {0,0,0,5,6,8,0,3,11,5,0,0,0,4,5,6,8,20,1,0,0,0,2,4,5,0,0,8,6,0};
		
		float totalFaltas=0;
		
		for (int i=0; i<faltas.length;i++) {
			totalFaltas+=faltas[i];
		}
		float mediaFaltas = totalFaltas/30;
	}
}
