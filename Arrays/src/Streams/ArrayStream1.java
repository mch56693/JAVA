package Streams;

public class ArrayStream1 {
	public static void main(String[] args) {
		
		String [] alumnos= new String []{"Luis","Angela", "Tania","Ana","Mar","Lucas","Oscar"};
		
		Arrays.stream(alumnos).filter(n->n.length()<4).forEach(System.out::println);
		}
	}
