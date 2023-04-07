package prep;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;
import java.util.List;


public class Tienda5 {
    
    Scanner sc=new Scanner(System.in);
    
    private ArrayList <Pedido> pedidos;
    private HashMap <String, Articulo> articulos;
    private HashMap <String, Cliente> clientes;

    public Tienda5() {
    	pedidos = new ArrayList <Pedido>();
    	HashMap <String, Articulo> articulos = new HashMap <>();
    	HashMap <String, Cliente> clientes = new HashMap <>();
    }
    
    public int buscarDni(String dni) {
        int pos=-1;
        int i=0;
        for (String c : clientes.keySet()) {
             if (c.equals(dni)){
                 pos=i;
                 break;
             }
             i++;
        }
        return pos;
    }  
    public int buscarId(String id) {
        int pos=-1;
        int i=0;
        for (String a : articulos.keySet()) {
             if (a.equals(id)){
                 pos=i; 
                 break;
             }
             i++;
        }
        return pos;
    }
    
    public void menu(){
      int op=0;
      do{
        System.out.println("\n\n\n\n\n\t\tMENU DE OPCIONES\n");
        System.out.println("\t\t1 - LISTADO ARTICULOS POR SECCION");
        System.out.println("\t\t2 - TOTAL PEDIDO CON IVA");
        System.out.println("\t\t3 - CUPON DESCUENTO CLIENTES");
        System.out.println("\t\t4 - PRUEBA EXCEPCIONES");
        System.out.println("\t\t9 - SALIR");
        op=sc.nextInt();
        switch (op){
           case 1:{
                          
           }    
           case 2:{
            
           } 
           case 3:{
             
           }
           case 4:{
            
           }
        }
      }while (op != 9);
    }
    
    public static void main(String[] args) {
        
    	Tienda5 t=new Tienda5();

        t.menu();
    }
}

