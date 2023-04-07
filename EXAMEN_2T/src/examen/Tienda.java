package examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    
    Scanner sc=new Scanner(System.in);
    private ArrayList <Pedido> pedidos;
    private ArrayList <Articulo> articulos;
    private ArrayList <Cliente> clientes;

    public Tienda() {
        pedidos = new ArrayList();
        articulos= new ArrayList();
        clientes = new ArrayList();
    }
    
    public int buscarDni(String dni) {
        int pos=-1;
        int i=0;
        for (Cliente c : clientes) {
             if (c.getDni().equals(dni)){
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
        for (Articulo a : articulos) {
             if (a.getIdArticulo().equals(id)){
                 pos=i; 
                 break;
             }
             i++;
        }
        return pos;
    }
    
    
    
//EJERCICIO 1 - LISTADO DE ARTICULOS POR SECCIÓN
    
    public void solicitarSeccion() {
    	int op=0;
        do{
          System.out.println("\n\n\n\tELIJA SECCIÓN PARA VER ARTÍCULOS\n");
          System.out.println("\t1 - PERIFÉRICOS");
          System.out.println("\t2 - ALMACENAMIENTO");
          System.out.println("\t3 - IMPRESORAS");
          System.out.println("\t4 - MONITORES");
          System.out.println("\t5 - TODAS");
          System.out.println("\t9 - SALIR");
          op=sc.nextInt();
          switch (op){
             case 1:{
          	   	 listarSecciones('1');
          	   	 break;
             }    
             case 2:{
            	 listarSecciones('2');
            	 break;
             } 
             case 3:{
            	 listarSecciones('3');
            	 break;
             }
             case 4:{
            	 listarSecciones('4');
            	 break;
             }
             case 5:{
            	 listarTodos();    
            	 break;
             }
          }
        }while (op != 9);
      }
    
    public void listarSecciones(char id) {
    	
    	for (Articulo a : articulos) {
    		
    		if(a.getIdArticulo().charAt(0) == id) {
    			
    		System.out.println(a);
    		}
    	}
    }
    public void listarTodos() {
    	
    	for (Articulo a : articulos) {
    		
    		System.out.println(a);
    	}
    }
    
    

//EJERCICIO 2 - TOTAL DE UN PEDIDO CON IVA
    
    public void solicitarPedido() {
    	
    	double conIva = 0;
    	double sinIva = 0;
    	double articuloSinIva = 0;
    	
    	System.out.println("INTRODUCE EL ID DEL PEDIDO PARA CALCULAR EL TOTAL: ");
    	String id = sc.next();
    	
    	
    		for(Pedido p : pedidos) {
    		    	
    			if(p.getIdPedido().equals(id)) {
    			
    				System.out.println("LISTADO DE ARTICULOS PEDIDO " + id + ":");
    			
    		for(Articulo a : p.getListArticulos()) {
    		
    			conIva = conIva + a.getPvp() + (a.getPvp()*0.21);
    			sinIva = sinIva + a.getPvp();
    			articuloSinIva = a.getPvp() + (a.getPvp()*0.21);
    			
    				System.out.println("\n" + a.getDescripcion() + " " + a.getPvp() + "\t" + " PRECIO C/IVA: " + articuloSinIva);
    			}
    				
    		}
    	}	
    				System.out.println("\n" + "TOTAL PEDIDO " + id + " " + sinIva + "\t\t" + "TOTAL CON IVA: " + conIva);
    		
    			}
    		
    	
    
    
    
    
    
//EJERCICIO 3 - CUPON DESCUENTO
    
    public void cuponDescuento() {
    	
    	double precioALL = 0;
    	double disc = 0;
    		
    	for(Cliente c : clientes) {
    		
    		for(Pedido p: pedidos) {
    			
    			
    	if(c.getDni().equals(p.getClientePedido().getDni())) {
    		
    		for(Articulo a : p.getListArticulos()) {
    			precioALL = precioALL + a.getPvp();
    		}			
    	}
    }
    		
    	if(precioALL >= 500) {
    		
    		disc = (precioALL*5)/100;
    		System.out.println(c.getNombre() + " TIENE PEDIDOS POR VALOR DE: " + precioALL + " Y HA OBTENIDO UN DESCUENTO POR VALOR DE: " + disc);
    	}
    	
    }
    }
    
    

    
    
//EJERCICIO 4 - PRUEBA EXCEPCION
    
    public void pruebaExcepcion() {
    	System.out.println("INTRODUCE EL DNI DE UN CLIENTE: ");
    	String dni = sc.next();
    	
    	try {
    		boolean existencia = false;
    		
    			for(Cliente c : clientes) {
    				if(c.getDni().equals(dni)) {
    				
    					System.out.println(c + "\n");
    						existencia = true;
    				}
    			}	if(existencia == false) {
    					
    					throw new NoEncontrado("No existe ningún Cliente con el DNI: " + dni);
    			}
    		} catch(NoEncontrado e) {
    			System.out.println(e.getMessage());
    		}
    	
    //-------------------------------------
    	
    	System.out.println("INTRODUCE EL ID DE UN ARTICULO: ");
    	String id = sc.next();
    
    	try {
    		boolean existencia = false;
    		
    			for(Articulo a : articulos) {
    				if(a.getIdArticulo().equals(id)) {
    				
    					System.out.println(a + "\n");
    						existencia = true;
    				}
    			}	if(existencia == false) {
    					
    					throw new NoEncontrado("No existe ningún Articulo con el ID: " + id);
    			}
    		} catch(NoEncontrado e) {
    			System.out.println(e.getMessage());
    		}
    	}
    
    
    
    
    
    public void menu(){
      int op=0;
      do{
        System.out.println("\n\n\n\tMENU DE OPCIONES\n");
        System.out.println("\t1 - LISTADO ARTICULOS POR SECCION");
        System.out.println("\t2 - TOTAL PEDIDO CON IVA");
        System.out.println("\t3 - CUPON DESCUENTO CLIENTES");
        System.out.println("\t4 - PRUEBA EXCEPCIONES");
        System.out.println("\t9 - SALIR");
        op=sc.nextInt();
        switch (op){
           case 1:{
        	   solicitarSeccion();
        	   break;
           }    
           case 2:{
        	   solicitarPedido();
        	   break;
           } 
           case 3:{
        	   cuponDescuento();
        	   break;
           }
           case 4:{
        	   pruebaExcepcion();
        	   break;
           }
        }
      }while (op != 9);
    }
    public void cargadatos() {
       clientes.add(new Cliente("11","ANA","658111111"));
       clientes.add(new Cliente("22","LOLA","649222222"));
       clientes.add(new Cliente("33","JUAN","652333333"));
              
       articulos.add(new Articulo("1-11","RATON LOGITECH","1-PERIFERICOS", 4,15));
       articulos.add(new Articulo("1-22","TECLADO STANDARD","1-PERIFERICOS", 9,18));
       articulos.add(new Articulo("2-11","HDD SEAGATE 1TB","2-ALMACENAMIENTO", 6,80));
       articulos.add(new Articulo("2-22","SSD KINGSTOM 256GB","2-ALMACENAMIENTO", 9,70));
       articulos.add(new Articulo("2-33","SSD KINGSTOM 512GB","2-ALMACENAMIENTO", 5,120));
       articulos.add(new Articulo("3-11","EPSON ET2800     ","3-IMPRESORAS", 2,200));
       articulos.add(new Articulo("3-22","EPSON XP200      ","3-IMPRESORAS", 5,80));
       articulos.add(new Articulo("4-11","ASUS LED 22     ","4-MONITORES", 5,100));
       articulos.add(new Articulo("4-22","HP LED 28      ","4-MONITORES", 5,180));
       articulos.add(new Articulo("4-33","SAMSUNG ODISSEY G5","4-MONITORES", 2,580));
       
       LocalDate hoy = LocalDate.now();
       pedidos.add(new Pedido("1",clientes.get(0),new ArrayList<Articulo>(List.of(articulos.get(0),articulos.get(1))),hoy));                                                                                                                                                               //A.REY
       pedidos.add(new Pedido("2",clientes.get(1),new ArrayList<Articulo>(List.of(articulos.get(2),articulos.get(3),articulos.get(9))),hoy));
       pedidos.add(new Pedido("3",clientes.get(2),new ArrayList<Articulo>(List.of(articulos.get(4),articulos.get(5),articulos.get(7),articulos.get(6))),hoy));
       pedidos.add(new Pedido("4",clientes.get(1),new ArrayList<Articulo>(List.of(articulos.get(0),articulos.get(1),articulos.get(3),articulos.get(8))),hoy));
       pedidos.add(new Pedido("5",clientes.get(1),new ArrayList<Articulo>(List.of(articulos.get(2),articulos.get(3),articulos.get(5))),hoy));
       pedidos.add(new Pedido("6",clientes.get(0),new ArrayList<Articulo>(List.of(articulos.get(4),articulos.get(5),articulos.get(1),articulos.get(9))),hoy));
    }

    public static void main(String[] args) {
        Tienda t=new Tienda();
        t.cargadatos();
        t.menu();
    }
}

