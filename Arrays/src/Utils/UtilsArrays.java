package Utils;

import java.util.Arrays;

public class UtilsArrays {
	public static void main(String[] args) {
		
		int num[]={5,49,52,25,87,19,30,7,44,1};
		
		int num2[]=Arrays.copyOf(num, 4);
		
		for (int n:num2) {
			System.out.print(n+" ");
			}
		System.out.println();
		
		int num3[]=Arrays.copyOfRange(num, 2, 6);
		
		for (int n:num3) {
			System.out.print(n+" ");
			}
		System.out.println();
		System.out.println("Es num1 igual a num2 ?: "+Arrays.equals(num, num2));
		System.out.println("Metodo fill");Arrays.fill(num3, 5);
		
		for (int n:num3) {
			System.out.print(n+" ");
			}  
		System.out.println();
		System.out.println("Metodo toString");
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);for (int n:num) {
			System.out.print(n+" ");
			}
		System.out.println("la posición que ocupa el 25 es: " + Arrays.binarySearch(num, 25));
		}
	}

