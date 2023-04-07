package PDF;

public class Arrays4 {
	public static void main(String[] args) {
		
		int[] faltas = {0,11,0,5,6,8,0,3,11,5,20,7,0,4,5,6,8,20,1,0,2,0,2,4,5,0,9,8,6,2};
		
		int maxFaltas, minFaltas;
		maxFaltas = minFaltas = 0;  
		
		for (int i=0; i<faltas.length; i++) {
			maxFaltas = Math.max(maxFaltas,faltas[i]);
			minFaltas = Math.min(minFaltas,faltas[i]);
		} 
		System.out.println ("ALUMNOS/AS QUE MÁS FALTAN: ");
			int totMax = 0;
		
			for (int i=0; i<faltas.length; i++) {
				if(faltas[i] == maxFaltas) {
		
			System.out.println ("El alumno/a en la posición " + i + " tiene "+ maxFaltas + " faltas");
			totMax++;
			}
		}
		System.out.println ("En total, " + totMax + " alumnos tienen " + maxFaltas + " faltas"); 
	
		System.out.println ("ALUMNOS/AS QUE MENOS FALTAN: "); 
			int totMin = 0;
		
			for (int i=0; i<faltas.length; i++) {
				if (faltas[i] == minFaltas) {
				
			System.out.println ("El alumno/a en la posición " + i + " tiene "+ minFaltas + " faltas");
			totMin++;
			}
		}
		System.out.println ("En total, " +totMin + " alumnos tienen " + minFaltas + " faltas"); 
		}
	}
