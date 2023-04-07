package tiendaInformáticaHM;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;

import tiendaInformáticaHM.Pedido;
import tiendaInformáticaHM.Articulo;
import tiendaInformáticaHM.Cliente;

public class Tienda {
    
	Scanner sc=new Scanner(System.in);
    
    private HashMap<String, Articulo> articulos;
    private HashMap<String, Cliente> clientes;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Pedido> tiempoPedidos;
    Scanner teclado = new Scanner(System.in);
        
    public Tienda() {
    	pedidos = new ArrayList <Pedido>();
        articulos = new HashMap();
        clientes = new HashMap();
        tiempoPedidos = new ArrayList <Pedido>();
    }
  
    public int buscarDni(String dni) {
        int buscarDni = -1;
        int i=0;
        
        for (Cliente u : clientes) {
             if (u.getDni().equals(dni)){
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
        
        for (Articulo l : articulos.keySet()) {
             if (l.getIdArticulo().equals(IdArticulos)){
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
            System.out.println("\t1 - GESTION CLIENTES/AS.");
            System.out.println("\t2 - GESTION ARTICULO/S.");
            System.out.println("\t3 - GESTION PEDIDO/S.");
            System.out.println("\t9 - SALIR.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    menu2();
                    break;
                }
                case 2:{
                    menu3();
                    break;
                }
                case 3:{
                    menu4();
                    break;
                }
            }
            }while (opcion != 9);
        }

    public void menu2(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\tGESTIÓN DE CLIENTES/AS\n");
            System.out.println("\t1 - Dar NUEVO CLIENTE de ALTA");
            System.out.println("\t2 - Dar CLIENTE/S de BAJA");
            System.out.println("\t3 - MODIFICAR DATOS del CLIENTE");
            System.out.println("\t4 - LISTADO de CLIENTE/S");
            System.out.println("\t9 - VOLVER.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                	darClienteAlta();
                   break;
                }    
                case 2:{
                    darClienteBaja();
                    break;
                } 
                case 3:{
                    modificarTelefono();
                    break;
                }
                case 4:{
                    listarClientes();
                    break;
                }
            }
            }while (opcion != 9);
       }
    public void darClienteAlta()
    {
        System.out.println("\nIntroduzca su DNI: ");
        String dni = sc.next();
        
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();
        
        System.out.println("Introduce un Num. de teléfono: ");
        String telefono = sc.next();
        
        clientes.add(new Cliente(dni,nombre,telefono));
        System.out.println("\n¡EL USUARIO HA SIDO DADO DE ALTA!");
        
    }
    public void darClienteBaja(){
        System.out.println("\nIntroduce el DNI de la cuenta que se quiere eliminar: ");
        String dni = sc.next();   
        
        int c=buscarDni(dni);
        
        clientes.remove(c);
        System.out.println("\nEl usuario ha sido eliminado.");
        
    }
    public void modificarTelefono(){
    		
    	System.out.println("\nIntroduzca su DNI: ");
        String dni = sc.next();
        
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();
        
    	clientes.add(new Cliente)	
    }
    public void listarClientes(){
        for (Cliente c: clientes){
            
        	System.out.println(c);
        }
    }

    public void menu3(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\tGESTIÓN DE ARTICULO/S\n");
            System.out.println("\t1 - Dar NUEVO ARTICULO de ALTA");
            System.out.println("\t2 - Dar ARTICULO de BAJA");
            System.out.println("\t3 - MODFICIAR DATOS de ARTICULO/S");
            System.out.println("\t4 - LISTADO de ARTICULOS");
            System.out.println("\t9 - VOLVER.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    darArticuloAlta();
                    break;
                }    
                case 2:{
                    darArticuloBaja();
                    break;
                } 
                case 3:{
                    modificarArticulo();
                    break;
                }
                case 4:{
                	listarArticulos();
                    break;
                }
            }
        }while (opcion != 9);
    }
    public void darArticuloAlta()
    {
    	System.out.println("\nIntroduce el ID del ARTICULO: ");
    	String idArticulo = sc.next();
    	
    	System.out.println("\nEscriba una DESCRIPCIÓN del ARTICULO: ");
    	String descripcion = sc.next();
    	
    	System.out.println("\nIntroduce el NUMERO de EXISTENCIAS de dicho ARTICULO: ");
    	String familia = sc.next();
    	
    	System.out.println("\nIntroduce la FAMILIA a la que pertenecen SIGUIENDO el SIGUIENTE FORMATO | numero + familia (1-familia): ");
    	int existencias = sc.nextInt();
    	
    	System.out.println("\nIntroduce el PVP: ");
    	double pvp = sc.nextDouble();
    	
    	articulos.add(new Articulo(idArticulo,descripcion,familia,existencias,pvp));
    	System.out.println("\n¡EL ARTICULO SE HA DADO DE ALTA!");
    }
    public void darArticuloBaja(){
    	System.out.println("\nIntroduce el ID del ARTICULO que se quiere BORRAR: ");
    	String ID = sc.next();
    	int a=buscarIdArticulo(ID);
    	
    	if (a > -1) {
    	articulos.remove(a);
    	}else {
    		System.out.println("El ARTICULO que desea eliminar, NO EXISTE");
    	}
    }
    public void modificarArticulo(){
    	System.out.println("\nIntroduce el ISBN del articulo a modificar: ");
    	String ID = sc.next();
    	
    	System.out.println("Introduzca la cantidad que desea añadir: ");
    	int existencias = sc.nextInt();
    	
    	int i = buscarIdArticulo(ID);
    	if(i <= 0) {
    		System.out.println("No hay existencias.");
    	}else 
    		if(i > 0)
    			articulos.get(i).setExistencias(articulos.get(i).getExistencias() + existencias);
    		else {
    			articulos.get(i).setExistencias(articulos.get(i).getExistencias() + existencias);
    		}
    		
    	System.out.println("\nSe han modificado las unidades del libro.");			
    }
    public void listarArticulos(){
    	for (Articulo a: articulos){
    		
    		System.out.println(a);
    	}
    }

    public void menu4(){

        int opcion=0;
        do{
        	System.out.println("\n\n\n\tGESTIÓN DE PEDIDO/S\n");
            System.out.println("\t1 - Dar NUEVO PEDIDO de ALTA");
            System.out.println("\t2 - Dar PEDIDO de BAJA");
            System.out.println("\t3 - LISTADO DE PEDIDOS DISPONIBLES");
            System.out.println("\t9 - VOLVER.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    darPedidoAlta();
                    break;
                }    
                case 2:{
                    darPedidoBaja();
                    break;
                } 
                case 3:{
                	listarPedidos();
                    break;
                }
            }
        }while (opcion != 9);
    }
    public void darPedidoAlta()
    {
    	System.out.println("\nIntroduzca su DNI: ");
    	String DNI = sc.next();
    	
    	System.out.println("Introduzca el ID del PEDIDO: ");
    	String ID = sc.next();
    	
    	while(!ID.equals("99")) {
    		cesta.add(articulos.get(buscarIdPedido(ID)));
    		System.out.println("Introduzca el ID del PEDIDO: ");
    		ID = sc.next();
    	}
    	
    	LocalDate hoy = LocalDate.now();
    	pedidos.add(new Pedido(String.valueOf(pedidos.size()+1), clientes.get(buscarDni(DNI)), cesta, hoy));
    		System.out.println("\nEL PEDIDO HA SIDO DADO DE ALTA!");
    }
    public void darPedidoBaja(){
    	System.out.println("\nIntroduzca su DNI: ");
    	String DNI = sc.next();
    	
    	System.out.println("\nIntroduce el ID del ARTICULO que se desea BORRAR: ");
    	String ID = sc.next();
    	
    	int p = buscarDni(DNI);
    	int r = buscarIdPedido(ID);
    	
    	if(p >=0 && r >= 0) {
    		articulos.get(r).setExistencias(articulos.get(r).getExistencias()+1);
    		
    	LocalDate hoy = LocalDate.now();
    		pedidos.remove(new Pedido(String.valueOf(pedidos.size()+1), clientes.get(buscarDni(DNI)), cesta, hoy));
    		System.out.println("\nSe ha autorizado la devolución.");
    		
    	}else {
    		System.out.println("No se puede relizar la devolución.");
    	}
    }
    public void listarPedidos(){
    		for (Pedido p: pedidos){
    		
    		System.out.println(p);
    	}
    }

    public void cargarDatos() {
        clientes.put("11", new Cliente("11","ANASTASIA CANELITA","655111111"));
        clientes.put("22", new Cliente("22","LOLA LOLITA","644222222"));
        clientes.put("33", new Cliente("33","MARC PELAZ","633444444"));
        clientes.put("44", new Cliente("44","JOAN CANET","677333333"));
        
        articulos.put("1-11",new Articulo("1-11","RATON LOGITECH","1-PERIFERICOS", 4,15));
        articulos.put("1-22",new Articulo("1-22","TECLADO STANDARD","1-PERIFERICOS", 20,18));
        articulos.put("2-11",new Articulo("2-11","HDD SEAGATE 1TB","2-ALMACENAMIENTO", 6,100));
        articulos.put("2-22",new Articulo("2-22","SSD KINGSTOM 256GB","2-ALMACENAMIENTO", 9,90));
        articulos.put("2-33",new Articulo("2-33","SSD KINGSTOM 512GB","2-ALMACENAMIENTO", 7,150));
        articulos.put("3-11",new Articulo("3-11","EPSON ET2800","3-IMPRESORAS", 2,200));
        articulos.put("3-22",new Articulo("3-22","EPSON XP200","3-IMPRESORAS", 5,80));
        articulos.put("4-11",new Articulo("4-11","MONITOR PHILIPS 24","4-MONITORES", 5,140));
        articulos.put("4-22",new Articulo("4-22","MONITOR ASUS 28","4-MONITORES", 3,200));
     
    }

    public static void main(String[] args) {
        
    	Tienda t = new Tienda(); 
    		
    	t.cargarDatos();
        t.menu1();
        
    	}

    }
