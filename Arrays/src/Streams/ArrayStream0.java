package Streams;

import java.util.Arrays;

public class ArrayStream0 {
	public static void main(String[] args) {
		
		String [] alumnos= new String [] {"Luis","Angela", "Tania","Ana","Mar","Lucas","Oscar"};
		
		Arrays.stream(alumnos).forEach(System.out::println);
		}
	}

