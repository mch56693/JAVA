
package marcaCoches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class marcasSOL {

    public static void main(String[] args) {
       
       ArrayList<String> europaL = new ArrayList<>(List.of("BMW","AUDI","VW","PEUGEOT","SEAT","RENAULT","CITROEN"));
       ArrayList<String> coreaL = new ArrayList<>(List.of("KIA","HYUNDAI","SSANYONG")) ;
       ArrayList<String> japonL = new ArrayList<>(List.of("TOYOTA","MAZDA","SUBARU","HONDA","MITSUBISHI","NISSAN")) ;
        
       System.out.println("\n(ArrayList)MARCAS EU: " + europaL);
       System.out.println("(ArrayList)MARCAS COREA: " + coreaL);
       System.out.println("(ArrayList)MARCAS JAPON: " + japonL);
       
       Collections.sort(europaL);
       Collections.sort(coreaL);
       Collections.sort(japonL);
       
       System.out.println("\n(ArrayList)MARCAS EU: " + europaL);
       System.out.println("(ArrayList)MARCAS COREA: " + coreaL);
       System.out.println("(ArrayList)MARCAS JAPON: " + japonL);
       
       europaL.addAll(List.of("BMW","AUDI","VW"));
       japonL.addAll(List.of("SUBARU","HONDA","MITSUBISHI"));
       
       System.out.println("\n(ArrayList)MARCAS EU: " + europaL);
       System.out.println("(ArrayList)MARCAS COREA: " + coreaL);
       System.out.println("(ArrayList)MARCAS JAPON: " + japonL);
       
       HashSet<String> europaS = new HashSet<>(europaL);
       HashSet<String> coreaS = new HashSet<>(coreaL);
       HashSet<String> japonS = new HashSet<>(japonL);
       
       System.out.println("\n(HashSet)MARCAS EU: " + europaS);
       System.out.println("(HashSet)MARCAS COREA: " + coreaS);
       System.out.println("(HashSet)MARCAS JAPON: " + japonS);
       
       //HashSet a Array + ordenación
       String[] japonA = new String[japonS.size()];
       japonS.toArray(japonA);
       Arrays.sort(japonA);
       System.out.println("\n(Array PURO) MARCAS JAPON: " + Arrays.toString(japonA));
      
       //HashSet a TreeSet(ordenado)
       TreeSet<String> japonT = new TreeSet<>(japonS);
       System.out.println("\n(TreeSet) MARCAS JAPON: " + japonT);
      
       //HashSet a Stream + ordenación + impresión
       System.out.print("\n(Stream) MARCAS JAPON: ");
       japonS.stream().sorted().forEach((n) -> {System.out.print(n + " "); });
       
       //HashSet con tods las marcas       
       HashSet<String> marcas= new HashSet<>(europaS);
       marcas.addAll(coreaS);
       marcas.addAll(japonS);
       System.out.print("\n\n(HasHSet) TODAS LAS MARCAS: " + marcas);
       
       TreeSet<String> marcasT = new TreeSet<>(marcas);
       System.out.print("\n\n(TreeSet) TODAS LAS MARCAS: " + marcasT);
    }
}

