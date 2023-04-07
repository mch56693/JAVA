package agenda;

import agenda.Contacto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Agenda {

	Scanner sc=new Scanner(System.in);
	private ArrayList <Contacto> contactos;
	
	public Agenda() {
		ArrayList <Contacto> contacto = new ArrayList();
	}
	
	public int buscarNombre(String nombre) throws NombreInexistente {
		int pos=-1;
		int i=0;
		
		for (Contacto c : contactos) {
			if (c.getNombre().equalsIgnoreCase(nombre)) {
				pos=i;
				break;
			}
			i++;
		}
		
		if (pos < 0) {
			throw new NombreInexistente ("No existe ningún cliente con el nombre: " + nombre); 	
		}
		return pos;
	}
	
	public void menu(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\tMENU\n");
            System.out.println("\t1 - INSERTAR NUEVO CONTACTO");
            System.out.println("\t2 - LISTA DE CONTACTOS");
            System.out.println("\t3 - MUESTRA UN CONTACTO/S A ELECCION");
            System.out.println("\t4 - BORRAR CONTACTO/S");
            System.out.println("\t5 - MODIFICAR TELEFONO DE UN CONTACTO");
            System.out.println("\t6 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                	insertarContacto();
                    break;
                }    
                case 2:{
                	listarContacto();
                    break;
                } 
                case 3:{
                	mostrarContacto();
                    break;
                } 
                case 4:{
                	borrarContacto();
                    break;
                } 
                case 5:{
                	modificarTelefono();
                    break;
                } 
            }
        }while (opcion != 6);
    }

	public void insertarContacto() {
		System.out.println("NOMBRE: ");
		String nombre = sc.next();
		
		do {
			System.out.println("TELÉFONO: ");
			String telefono = sc.nextLine();
			
			if(telefono.matches("^[0-9](9)$")) {
				contactos.add(new Contacto(nombre.toUpperCase(), telefono));
				break;
				
			} else {
				System.out.println("Telefono no válido");
			}
			
		}while (true);
		Collections.sort(contactos);
	}
	
	public void listarContacto() {
		for(Contacto c : contactos) {
			
			System.out.println(c);
		}
	}
	
	public void mostrarContacto() {
		sc.nextLine();
		
		System.out.println("NOMBRE: ");
		String nombre = sc.next();
		
		while(nombre.length()>0) {
			try {
				int busca = buscarNombre(nombre);
				System.out.println("\n" + contactos.get(busca));	
			}catch (NombreInexistente n) {
				System.out.println(n.getMessage());
			}
			System.out.println("\nNombre para busar agenda: ");
			nombre = sc.nextLine();
		}
	}
	
	public void borrarContacto() {
		sc.nextLine();
		
		System.out.println("NOMBRE: ");
		String nombre = sc.next();
		
		while(nombre.length()>0) {
		try {
			contactos.remove(buscarNombre(nombre));
			System.out.println("\nCONTACTO BORRADO");	
		}catch (NombreInexistente n) {
			System.out.println(n.getMessage());
		}
		System.out.println("\nNombre para agenda: ");
		nombre = sc.nextLine();
		}
	}
	
	public void modificarTelefono() {
		sc.nextLine();
		
		System.out.println("NOMBRE: ");
		String nombre = sc.next();
		
		try {
			int busca = buscarNombre(nombre);
			System.out.println("\n" + contactos.get(busca));
			System.out.println("\nNUEVO TELÉFONO? ");
            String tel=sc.nextLine();
            contactos.get(busca).setTelefono(tel);	
		}catch (NombreInexistente n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void main(String[] args) {
        
		Agenda c=new Agenda();
        
		c.menu();
    }
}

