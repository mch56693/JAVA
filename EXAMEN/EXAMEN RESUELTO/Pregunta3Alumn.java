
/**
    2 PUNTOS 
 
    Hacer un programa para buscar y reemplazar una palabra en un String. Ejemplo
    
    String frase = "los cayos de mi abuela son los mejores cayos que he probado " 
    
    buscamos la palabra "cayos" y la sustituimos por "callos"
    
    String fraseAlumn: "los callos de mi abuela son los mejores callos que he probado"
    
    PROCESO: Vamos pasando el String frase hacía fraseAlumn palabra a palabra
    (Se hace buscando el caracter ' ' como ya hicimos en clase)
    A la vez que descomponemos el String en palabras, preguntamos si aparece "cayos" y lo sustituimos por "callos"
   
    Imprimir por pantalla el String fraseAlumn para ver el resultado.
    (imprimir el String sin hacer correctamente el proceso de buscar-reemplazar no puntúa)
    
    DE LO QUE SE TRATA ES DE HACER UN SENCILLO FIND/REPLACE - UNA EVOLUCIÓN PARA PRACTICAR
    SERÍA HACER LO MISMO PERO SOLICITANTO ANTES POR TECLADO:
    
        * LA FRASE A RECORRER
        * LA PALABRA A BUSCAR (FIND)
        * LA PALABRA PARA SUSTITUIR A LA ANTERIOR (REPLACE)
  
 */

// HAY MÚLTIPLES ALTERNATIVAS PARA REALIZAR ESTE EJERCICIO. SE PROPONE UNA

public class Pregunta3Alumn
{
   public static void main (String[] args)
   {
    
       String frase = ("los cayos de mi abuela son los mejores cayos que he probado ");
       String fraseAlumn = new String(); 
       
       int inicioPalabra=0;
       for(int i=0; i<frase.length();i++) 
       {
            if (frase.charAt(i) ==' ')
            {
                String palabra=frase.substring(inicioPalabra,i);
                inicioPalabra=i+1;
                if (palabra.compareTo("cayos")==0)
                {
                    fraseAlumn = fraseAlumn + "callos ";
                }else
                    {   
                        fraseAlumn = fraseAlumn + palabra + " ";
                    }
            }
       }
       System.out.println(fraseAlumn);
   }     
}
