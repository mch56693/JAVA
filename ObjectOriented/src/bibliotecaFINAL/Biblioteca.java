package bibliotecaFINAL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import bibliotecaFINAL.Libro;
import bibliotecaFINAL.Prestamo;
import bibliotecaFINAL.Usuarios;


public class Biblioteca {

    Scanner sc=new Scanner(System.in);
    
    private ArrayList<Usuarios> usuarios;
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;
        
    public Biblioteca() {
        usuarios=new ArrayList();
        libros=new ArrayList();
        prestamos=new ArrayList();
    }

public void menu1(){
     int opcion=0;
     do{
         System.out.println("\n\n\n\tMENU DE OPCIONES\n");
         System.out.println("\t1 - GESTION USUARIOS/AS.");
         System.out.println("\t2 - GESTION LIBROS.");
         System.out.println("\t3 - GESTION PRESTAMO/DEVOLUCIONES.");
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
    
    public void darUsuarioAlta()
    {
        System.out.println("\nIntroduzca su DNI: ");
        String dni = sc.next();
        
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();
        
        System.out.println("Introduce un Num. de teléfono: ");
        String telefono = sc.next();
        
        usuarios.add(new Usuarios(dni,nombre,telefono));
        System.out.println("\nEl usuario ha sido dado de alta!");
        
    }

    public void darUsuarioBaja(){
        System.out.println("\nIntroduce el DNI de la cuenta que se quiere eliminar: ");
        String dni = sc.next();   
        
        int u=buscarDni(dni);
        
        usuarios.remove(u);
        System.out.println("\nEl usuario ha sido eliminado.");
    }
    
    public void listarUsuarios(){
        for (Usuarios u: usuarios){
            
        	System.out.println(u);
        }
    }
    
    public int buscarDni(String dni) {
        int buscarDni = -1;
        int i=0;
        
        for (Usuarios u : usuarios) {
             if (u.getDni().equals(dni)){
                  buscarDni=i;
                  break;
             }
             i++;
        }
        return buscarDni;
    }

public void menu2(){
     int opcion=0;
     do{
         System.out.println("\n\n\n\tGESTIÓN DE USUARIOS\n");
         System.out.println("\t1 - ALTA NUEVO USUARIO/A");
         System.out.println("\t2 - BAJA USUARIO/A");
         System.out.println("\t3 - LISTADO USUARIOS/AS");
         System.out.println("\t9 - VOLVER.");
         opcion=sc.nextInt();
         switch (opcion){
             case 1:{
             	darUsuarioAlta();
                break;
             }    
             case 2:{
                 darUsuarioBaja();
                 break;
             } 
             case 3:{
                 listarUsuarios();
                 break;
             }
         }
         }while (opcion != 9);
    }
    
	public void darLibroAlta()
	{
		System.out.println("\nIntroduce el ISBN: ");
		String ISBN = sc.next();
    	
		System.out.println("Introduce el nombre del libro: ");
    	String titulo = sc.next();
    	
    	System.out.println("Introduce el nombre del autor: ");
    	String autor = sc.next();
    	
    	System.out.println("Introduce el Num. de libros en stock: ");
    	int unidades = sc.nextInt();
    	
    	libros.add(new Libro(ISBN,titulo,autor,unidades));
    	System.out.println("\nEl libro se ha dado de alta!");
	}

	public void darLibroBaja(){
		System.out.println("\nIntroduce el ISBN del libro que se quiere eliminar: ");
		String ISBN = sc.next();
		int l=buscarISBN(ISBN);
		
		libros.remove(l);
	}
	
	public void modificarDatos(){
		System.out.println("\nIntroduce el ISBN del libro a modificar: ");
		String ISBN = sc.next();
		
		System.out.println("Introduzca la cantidad que desea añadir: ");
		int unidades = sc.nextInt();
		
		int i = buscarISBN(ISBN);
		if(i <= 0) {
			System.out.println("No hay existencias.");
		}else 
			if(i > 0)
				libros.get(i).setUnidades(libros.get(i).getUnidades() + unidades);
			else {
				libros.get(i).setUnidades(libros.get(i).getUnidades() + unidades);
			}
			
		System.out.println("\nSe han modificado las unidades del libro.");			
	}

	public void listarLibros(){
		for (Libro l: libros){
			
			System.out.println(l);
		}
	}
	
	public int buscarISBN(String ISBN) {
        int buscarISBN = -1;
        int i=0;
        
        for (Libro l : libros) {
             if (l.getISBN().equals(ISBN)){
                  buscarISBN=i;
                  break;
             }
             i++;
        }
        return buscarISBN;
    }
	
public void menu3(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\tGESTIÓN DE LIBROS\n");
            System.out.println("\t1 - ALTA NUEVO LIBRO");
            System.out.println("\t2 - BAJA LIBRO");
            System.out.println("\t3 - MODIFICACION DATOS LIBRO");
            System.out.println("\t4 - LISTADO DE LIBROS DISPONIBLES");
            System.out.println("\t9 - VOLVER.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    darLibroAlta();
                    break;
                }    
                case 2:{
                    darLibroBaja();
                    break;
                } 
                case 3:{
                    modificarDatos();
                    break;
                }
                case 4:{
                	listarLibros();
                    break;
                }
            }
        }while (opcion != 9);
    }
	
	public void darPréstamosAlta()
	{
		System.out.println("\nIntroduzca su DNI: ");
		String DNI = sc.next();
    	
		System.out.println("Introduzca el ISBN: ");
    	String ISBN = sc.next();
    	
    	int p = buscarDni(DNI);
		int r = buscarISBN(ISBN);
		
		if(p >=0 && r >= 0) {
			libros.get(r).setUnidades(libros.get(r).getUnidades()+1);
    	
			LocalDate hoy = LocalDate.now();
			prestamos.add(new Prestamo(usuarios.get(p),libros.get(r), hoy, hoy.plusDays(15)));
			System.out.println("\nSe ha autorizado el préstamo.");
		
		}else {
			System.out.println("No se puede relizar la devolución.");
	}
}

	public void darPréstamosBaja(){
		System.out.println("\nIntroduzca su DNI: ");
		String DNI = sc.next();
		
		System.out.println("\nIntroduce el ISBN del libro que se quiere eliminar: ");
		String ISBN = sc.next();
		
		int p = buscarDni(DNI);
		int r = buscarISBN(ISBN);
		
		if(p >=0 && r >= 0) {
			libros.get(r).setUnidades(libros.get(r).getUnidades()+1);
			
			LocalDate hoy = LocalDate.now();
			prestamos.remove(new Prestamo(usuarios.get(p),libros.get(r), hoy, hoy.plusDays(15)));
			System.out.println("\nSe ha autorizado la devolución.");
			
		}else {
			System.out.println("No se puede relizar la devolución.");
		}
	}
	
	public void otorgarProrroga()
	{
		System.out.println("\nIntroduzca su DNI: ");
		String DNI = sc.next();
    	
		System.out.println("\nIntroduzca el ISBN: ");
    	String ISBN = sc.next();
    	
    	int a = buscarDni(DNI);
    	int b = buscarISBN(ISBN);
    	
    	for(Prestamo p: prestamos)
    		if (p.getLibroPrest().getISBN().equals(ISBN) && p.getUsuarioPrest().getDni().equals(DNI)) {
    			p.setFechaDev(p.getFechaDev().plusDays(15));
    		break;
	}
}

	public void listarPréstamos(){
		for (Prestamo p: prestamos){
			
			System.out.println(p);
		}
	}
	
	public void listarPréstamosUsuarios(){
		System.out.println("\nIntroduzca el ISBN: ");
		String DNI = sc.next();
		
		int index = buscarISBN(DNI);
		
		for (Prestamo p: prestamos){
			
			System.out.println(p);
		}
	}
	
	public void listarPréstamosLibro(){
		System.out.println("\nIntroduzca su DNI: ");
		String ISBN = sc.next();
		
		for (Prestamo p: prestamos){
			
			if(p.getLibroPrest().getISBN().equals(ISBN));
			
				System.out.println(p);
		}
	}
	
public void menu4(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\tGESTIÓN DE PRÉSTAMOS\n");
            System.out.println("\t1 - PRÉSTAMOS");
            System.out.println("\t2 - DEVOLUCIÓNES");
            System.out.println("\t3 - PRÓRROGAS");
            System.out.println("\t4 - LISTADO PRESTAMOS (TODOS)");
            System.out.println("\t5 - LIBRO PRÉSTAMO (USUARIO)");
            System.out.println("\t6 - USUARIOS LO TIENEN (LIBRO)");
            System.out.println("\t9 - VOLVER.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    darPréstamosAlta();
                    break;
                }    
                case 2:{
                    darPréstamosBaja();
                    break;
                } 
                case 3:{
                    otorgarProrroga();
                    break;
                }
                case 4:{
                	listarPréstamos();
                    break;
                }
                case 5:{
                	listarPréstamosUsuarios();
                    break;
                }
                case 6:{
                	listarPréstamosLibro();
                    break;
                } 
            }
        }while (opcion != 9);
    }

		public void cargarDatos() {
			libros.add(new Libro("1-11", "Nacidos de la Bruma 1: El Imperio Final","B.Sanderson", 3));
		    libros.add(new Libro("1-22", "Carta al Rey","Tonke Dragt", 2));
		    libros.add(new Libro("1-33", "Harry Potter y la Piedra Filosofal","J.K. Rowling", 4));
		    libros.add(new Libro("1-44", "Dune","Frank Herbert",1));
		    libros.add(new Libro("1-55", "El Archivo de las Tormentas 3: Palabras Radiantes","B.Sanderson", 3));
		    libros.add(new Libro("1-66", "El problema de los tres cuerpos","Cixin Liu", 1));
		    libros.add(new Libro("1-77", "El Libro Troll", "R. Doblas", 2));
			libros.add(new Libro("1-88", "Yo, Gamer", "J. Casanovas", 3));
			libros.add(new Libro("1-99", "Manual de Soldadura", "Juanjo", 2));
		    
		    usuarios.add(new Usuarios("11","Alvaro","684643484"));
		    usuarios.add(new Usuarios("22","Javier","690586324"));
		    usuarios.add(new Usuarios("33","Alejandro","690564897"));
		    usuarios.add(new Usuarios("44","Noé","678463897"));
		    usuarios.add(new Usuarios("55", "Ivan", "625555555"));
			usuarios.add(new Usuarios("66", "Perxita", "626666666"));
			
			LocalDate hoy = LocalDate.now();
		   	prestamos.add(new Prestamo(usuarios.get(1), libros.get(1), hoy, hoy.plusDays(15)));
		    prestamos.add(new Prestamo(usuarios.get(2), libros.get(2), hoy, hoy.plusDays(14)));
		    prestamos.add(new Prestamo(usuarios.get(3), libros.get(3), hoy, hoy.plusDays(13)));
		    prestamos.add(new Prestamo(usuarios.get(4), libros.get(4), hoy, hoy.plusDays(12)));
		    prestamos.add(new Prestamo(usuarios.get(3), libros.get(5), hoy, hoy.plusDays(11)));
		    prestamos.add(new Prestamo(usuarios.get(2), libros.get(6), hoy, hoy.plusDays(10)));
		    prestamos.add(new Prestamo(usuarios.get(1), libros.get(5), hoy, hoy.plusDays(11)));
		    prestamos.add(new Prestamo(usuarios.get(2), libros.get(4), hoy, hoy.plusDays(12)));
		    prestamos.add(new Prestamo(usuarios.get(3), libros.get(3), hoy, hoy.plusDays(13)));
		    prestamos.add(new Prestamo(usuarios.get(4), libros.get(2), hoy, hoy.plusDays(14)));
		
		}
		
public static void main(String[] args) {
    
	Biblioteca b = new Biblioteca(); 
		
	b.cargarDatos();
    b.menu1();
    
	}

}