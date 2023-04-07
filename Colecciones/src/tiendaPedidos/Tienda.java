package tiendaPedidos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

import tiendaPedidos.Articulo;
import tiendaPedidos.Cliente;
import tiendaPedidos.Pedido;


public class Tienda {

    Scanner sc=new Scanner(System.in);
   
    private HashMap<String, Articulo> articulos;
    private HashMap<String, Cliente> clientes;
    private ArrayList<Pedido> pedidos;
    ArrayList<Articulo> cesta = new ArrayList();
        
    public Tienda() {
        articulos=new HashMap<>();
        clientes=new HashMap<>();
        pedidos=new ArrayList();
    }

public int buscarDni(String dni) {
    int buscarDni = -1;
    int i=0;
    
    for (String c : clientes.keySet()) {
         if (c.equals(dni)){
              buscarDni=i;
              break;
         }
         i++;
    }
    return buscarDni;
}
public int buscarIdArticulo(String IdArticulos) {
    int buscarIdArticulo = -1;
    int i=0;
    
    for (String a : articulos.keySet()) {
         if (a.equals(IdArticulos)){
              buscarIdArticulo=i;
              break;
         }
         i++;
    }
    return buscarIdArticulo;
}
public int buscarIdPedido(String IdPedido) {
    int buscarIdPedido = -1;
    int i=0;
    
    for (Pedido l : pedidos) {
         if (l.getIdPedido().equals(IdPedido)){
              buscarIdPedido=i;
              break;
         }
         i++;
    }
    return buscarIdPedido;
}

public void menu1(){
    int opcion=0;
    do{
        System.out.println("\n\n\n\tMENU DE OPCIONES\n");
        System.out.println("\t1 - CREAR PEDIDO/AS.");
        System.out.println("\t2 - BORRAR PEDIDO/S.");
        System.out.println("\t3 - LISTAR PEDIDO/S.");
        System.out.println("\t4 - LISTA ARTÍCULOS Y CLIENTES/AS.");
        System.out.println("\t5 - ALTA Y MODIFICACIÓN ARTICULOS/S.");
        System.out.println("\t6 - COPIA DE SEGURIDAD/S.");//vuelta de Semana santa
        System.out.println("\t9 - SALIR.");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:{
                crearPedido();
                break;
            }
            case 2:{
                borrarPedido();
                break;
            }
            case 3:{
                listarPedidos();
                break;
            }
            case 4:{
                listarArticulosClientes();
                break;
            }
            case 5:{
                manejoArticulos();
                break;
            }
            case 6:{
                copiaSeguridad();
                break;
            }
        }
        }while (opcion != 9);
    }


public void crearPedido()
{
	System.out.println("\nIntroduzca su DNI: ");
	String dni = sc.next();
	
	System.out.println("Introduzca el ID del PEDIDO: ");
	String id = sc.next();
	
	while(!id.equals("99")) {
		System.out.println("Introduzca el ID del ARTICULO: ");
		id= sc.next();
		cesta.add(articulos.get(buscarIdPedido(id)));
	}
	
	LocalDate hoy = LocalDate.now();
	pedidos.add(new Pedido(String.valueOf(pedidos.size()+1), clientes.get(buscarDni(id)), cesta, hoy));
		System.out.println("\nEL PEDIDO HA SIDO DADO DE ALTA!");
}
public void borrarPedido(){
	System.out.println("Introduce el ID del Pedido: ");
	String id = sc.next();
	
	int buscarIdPedido = -1;
    int i=0;
    
    for (Pedido l : pedidos) {
         if (l.getIdPedido().equals(id)){
              buscarIdPedido=i;
              break;
         }
         i++;
    }
    pedidos.remove(i);
}
public void listarPedidos(){
		for (Pedido p: pedidos){
		
		System.out.println(p);
	}
}

public void listarArticulosClientes(){
	for (Pedido p: pedidos){
	
	System.out.println(p);
	}
}
public void manejoArticulos(){
	
}
public void copiaSeguridad(){
	
}

public void cargarDatos() {
    clientes.put("11", new Cliente("11","CRISTIAN UBON","655111111"));
    clientes.put("22", new Cliente("22","RUGE CARBO","644222222"));
    clientes.put("33", new Cliente("33","MARC PELAZ","633444444"));
    clientes.put("44", new Cliente("44","TORRENTBO","677333333"));
    
    articulos.put("1-11", new Articulo("1-11","RATON LOGITECH","1-PERIFERICOS", 4,15));
    articulos.put("1-22", new Articulo("1-22","TECLADO STANDARD","1-PERIFERICOS", 20,18));
    articulos.put("2-11", new Articulo("2-11","HDD SEAGATE 1TB","2-ALMACENAMIENTO", 6,100));
    articulos.put("2-22", new Articulo("2-22","SSD KINGSTOM 256GB","2-ALMACENAMIENTO", 9,90));
    articulos.put("2-33", new Articulo("2-33","SSD KINGSTOM 512GB","2-ALMACENAMIENTO", 7,150));
    articulos.put("3-11", new Articulo("3-11","EPSON ET2800","3-IMPRESORAS", 2,200));
    articulos.put("3-22", new Articulo("3-22","EPSON XP200","3-IMPRESORAS", 5,80));
    articulos.put("4-11", new Articulo("4-11","MONITOR PHILIPS 24","4-MONITORES", 5,140));
    articulos.put("4-22", new Articulo("4-22","MONITOR ASUS 28","4-MONITORES", 3,200));
 
    LocalDate hoy = LocalDate.now();
    pedidos.add(new Pedido("1",clientes.get("11"), new ArrayList<Articulo>(List.of(articulos.get("1-11"),articulos.get("3-22"))),hoy));
    pedidos.add(new Pedido("2",clientes.get("22"), new ArrayList<Articulo>(List.of(articulos.get("1-22"),articulos.get("4-11"))),hoy));
    pedidos.add(new Pedido("3",clientes.get("33"), new ArrayList<Articulo>(List.of(articulos.get("2-11"),articulos.get("4-22"))),hoy));
    pedidos.add(new Pedido("4",clientes.get("33"), new ArrayList<Articulo>(List.of(articulos.get("2-22"),articulos.get("1-11"))),hoy));
    pedidos.add(new Pedido("5",clientes.get("22"), new ArrayList<Articulo>(List.of(articulos.get("2-33"),articulos.get("1-22"))),hoy));
    pedidos.add(new Pedido("6",clientes.get("11"), new ArrayList<Articulo>(List.of(articulos.get("3-11"),articulos.get("2-11"))),hoy));
}

public static void main(String[] args) {
    
	Tienda t = new Tienda(); 
		
	t.cargarDatos();
    t.menu1();
    
	}

}