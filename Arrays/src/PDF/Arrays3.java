package PDF;

public class Arrays3 {
	public static void main(String[] args) {
		
		int[] faltas = {0,11,0,5,6,8,0,3,11,5,20,7,0,4,5,6,8,20,1,0,2,0,2,4,5,0,9,8,6,2};
		
		int maxFaltas=0; 
		
		for(int i=0; i<faltas.length; i++) {
			if (faltas[i] > maxFaltas) {
				maxFaltas= faltas[i];
			}
		}
		int tot = 0;
		for (int i=0; i<faltas.length; i++){
			if (faltas[i] == maxFaltas) {
				System.out.println ("El alumno/a en la posición " + i + " tiene "+ maxFaltas + " faltas");
				tot++;
				}
			}
		System.out.println ("En total, " + tot + " alumnos tienen " + maxFaltas + " faltas");
		}
	}
