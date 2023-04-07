package String;

public class Manejo_ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Alvaro";
		
		System.out.println("Mi nombre es: " + nombre);
		
		System.out.println("Mi nombre tiene :" + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi " + nombre + " es la " + nombre.charAt(0));
		
		
		int ultimaLetra = nombre.length();
		
		System.out.println("La ultima letra es la " + nombre.charAt(ultimaLetra - 1));
		
		//---------------------------
				System.out.println("-------------------------");
		//---------------------------
		
		String frase = "Hoy toca aprender a programar: ";
		
		String fraseResumen1 = frase.substring(0, 2);
		
		System.out.println(fraseResumen1);
		
		String fraseResumen2 = frase.substring(0, 3);
		
		//el primer valor te dice qué caracter quieres extraer, y el segundo el cual ya no quieres extraer. CUIDADO ESPACIOS EN BLANCO.
		
		System.out.println(fraseResumen2);
		
		//---------------------------
				System.out.println("-------------------------");
		//---------------------------
		
		String alumno1 = "David";
		
		String alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2)); //compara ambos nombres para comprobar si son iguales CUIDADO MAYUSCULAS Y MINUSCULAS
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); //compara ambos nombres para comprobar si son iguales ignorando si estan en MAYUSCULAS O MINUSCULAS
		
		
	}

}
