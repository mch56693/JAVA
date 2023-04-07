package marcaCoches;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class marcas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> europaL = new ArrayList<>(List.of("BMW, AUDI, VOLKSWAGEN, PEUGEOT, SEAT, RENAULT, CITROEN"));
		ArrayList<String> coreaL = new ArrayList<>(List.of("KIA, HYUNDAI, SSANYONG"));
		ArrayList<String> japonL = new ArrayList<>(List.of("TOYOTA, MAZDA, SUBARU, HONDA, MITSUBISHI, NISSAN"));
		
		System.out.println("\n(ArrayList) Marca EU: " + europaL);
		System.out.println("(ArrayList) Marca COR: " + coreaL);
		System.out.println("(ArrayList) Marca JPN: " + japonL);
		
		
		
//Ej2------------------------------------------
		
		Collections.sort(europaL);
		Collections.sort(coreaL);
		Collections.sort(japonL);
		
		System.out.println("\n(ArrayList) Marca EU: " + europaL);
		System.out.println("(ArrayList) Marca COR: " + coreaL);
		System.out.println("(ArrayList) Marca JPN: " + japonL);
		
		
		
//Ej3-----------------------------------------------------
		
		europaL.addAll(List.of("BMW, AUDI, SEAT"));
		japonL.addAll(List.of("TOYOTA, MAZDA, HONDA"));
		
		System.out.println("\n(ArrayList)  Marca EU: " + europaL);
		System.out.println("(ArrayList) Marca COR: " + coreaL);
		System.out.println("(ArrayList) Marca JPN: " + japonL);
		
		
		
//Ej4-------------------------------------------------------
		
		HashSet<String> europaS = new HashSet<>(europaL);
		HashSet<String> coreaS = new HashSet<>(coreaL);
		HashSet<String> japonS = new HashSet<>(japonL);
		
		System.out.println("\n(HashSet) Marca EU: " + europaL);
		System.out.println("(HashSet) Marca COR: " + coreaL);
		System.out.println("(HashSet) Marca JPN: " + japonL);
	

		
//Ej5----------------------------------------------------------
		
		//Arrays
		String[] japonA = new String[japonS.size()];
		japonS.toArray(japonA);
		Arrays.sort(japonA);
		System.out.println("\n(Array) Marca JPN: " + japonA);
		
		//TreeSet
		TreeSet<String> japonT = new TreeSet<>(japonS);
		System.out.println("\n(TreeSet) Marca JPN: " + japonT);
		
		//Stream
		System.out.println("\n(Stream) Marca JPN: " );
		japonS.stream().sorted().forEach((n) -> {System.out.println(n + " "); });;
		
		//HashSet TODAS LAS MARCAS
		HashSet<String> marcas = new HashSet<>(europaS);
		marcas.addAll(coreaS);
		marcas.addAll(japonS);
		System.out.println("\n(HashSet) TODAS LAS MARCAS: " + marcas);
		
		TreeSet<String> marcasT = new TreeSet<>(marcas);
		System.out.println("\n(TreeSet) TODAS LAS MARCAS: " + marcasT);
		
	}

}
