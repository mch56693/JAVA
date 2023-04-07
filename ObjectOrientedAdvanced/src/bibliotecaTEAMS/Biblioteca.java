package bibliotecaTEAMS;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Iterator;

public class Biblioteca{

    Scanner sc=new Scanner(System.in);
    private ArrayList<Prestamo>  prestamos;
    private ArrayList<Libro>  libros;
    private ArrayList<Usuario>  usuarios;
    
    public Biblioteca(){
        prestamos= new ArrayList();
        libros= new ArrayList();
        usuarios=new ArrayList();
    }
    
    public void listaLibros(){
        for (Libro l:libros){
          System.out.println("\t\t\t"+l);
        }
    }
    public void listaUsu(){
        for (Usuario u:usuarios){
          System.out.println("\t\t\t"+u);
        }
    }
    public void listaPresta(){
        for (Prestamo p:prestamos){
                 System.out.println("\t\t\t"+p);
        }
    }
    
    public int buscarDni(String dni) {
        int i=0;
        for (Usuario u : usuarios) {
             if (u.getDni().equals(dni)){
                 break;
             }
             i++;
        }
        return i;
    }
    public int buscarIsbn(String isbn) {
        int i=0;
        for (Libro l: libros) {
             if (l.getIsbn().equals(isbn)){
                 break;
             }
             i++;
        }
        return i;
    }
               
    public void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit    ","JRR Tolkien",3));
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien",3));
        libros.add(new Libro("1-33","El Médico    ","N. Gordon",4));
        libros.add(new Libro("1-44","Chamán     ","N. Gordon",3));
        libros.add(new Libro("1-55","Momo        ","M. Ende",2));
        libros.add(new Libro("1-66","El Quijote","M.Cervantes",0));
       
        usuarios.add(new Usuario("11","Luisa","621111111"));
        usuarios.add(new Usuario("22","Marta","623222222"));
        usuarios.add(new Usuario("33","Julia","623333333"));
        usuarios.add(new Usuario("44","Luis","623444444"));
        usuarios.add(new Usuario("55","Lucas","622555555"));
               
        LocalDate hoy=LocalDate.now();
        prestamos.add(new Prestamo(usuarios.get(0),libros.get(4), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(0),libros.get(1), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(1),libros.get(3), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(1),libros.get(4), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(1),libros.get(2), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(2),libros.get(1), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(2),libros.get(2), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(2),libros.get(3), hoy, hoy.plusDays(15)));
        prestamos.add(new Prestamo(usuarios.get(2),libros.get(4), hoy, hoy.plusDays(15)));
     }
            
     public void menu(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tMENU DE OPCIONES\n");
            System.out.println("\t\t\t\t1 - LISTADO ESPECIAL (1)");
            System.out.println("\t\t\t\t2 - LISTADO ESPECIAL (2)");
            System.out.println("\t\t\t\t3 - PRÉSTAMO (3)");
            System.out.println("\t\t\t\t4 - BAJA USUARIO (4)");
            System.out.println("\t\t\t\t5 - LISTADO ESPECIAL (5)");
            System.out.println("\t\t\t\t6 - LISTADO LIBROS");
            System.out.println("\t\t\t\t7 - LISTADO USUARIOS");
            System.out.println("\t\t\t\t8 - LISTADO PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    examen1();
                    break;
                }    
                case 2:{
                    examen2();
                    break;
                } 
                case 3:{
                    examen3();
                    break;
                } 
                case 4:{
                    examen4();
                    break;
                } 
                case 5:{
                    examen5();
                    break;
                } 
                case 6:{
                    listaLibros();
                    break;
                }    
                case 7:{
                    listaUsu();
                    break;
                } 
                case 8:{
                    listaPresta();
                    break;
                } 
            }
        }while (opcion != 9);
    }

    public static void main(String[] args) {
        Biblioteca b=new Biblioteca();
                      
        b.cargaDatos();
        b.menu();
    }

    public void examen1 () {
        for (Usuario u:usuarios){
            boolean tiene = false;
            for (Prestamo p:prestamos){
                if (u==p.getUsuarioPres()){
                    tiene=true;
                    break;
                }
            }
            if (!tiene){
                System.out.println(u);
            } 
        }
    }
    public void examen2 () {
        for (Usuario u:usuarios){
            boolean tiene = false;
            for (Prestamo p:prestamos){
                if (u==p.getUsuarioPres()){
                    tiene=true;
                }
            }
            if (tiene){
                System.out.println(u);
            } 
        }
    }
    public void examen3 () {
        System.out.println("DNI usuario:");
        int existeDni=buscarDni(sc.next());
        System.out.println("ISBN libro prestado:");
        int existeIsbn=buscarIsbn(sc.next());
        if (libros.get(existeIsbn).getEjemplares() <=0){
           System.out.println("NO HAY EJEMPLARES");
        }else{
           LocalDate hoy=LocalDate.now(); //prestamos de 15 días prorrogables partiendo de la fecha de hoy
           prestamos.add(new Prestamo(usuarios.get(existeDni),libros.get(existeIsbn), hoy, hoy.plusDays(15)));
           libros.get(existeIsbn).setEjemplares(libros.get(existeIsbn).getEjemplares()-1);
        }
    }   
    public void examen4 () {
        System.out.println("BAJA DE UN USUARIO");
        System.out.println("DNI:");
        int existeDni=buscarDni(sc.next());
        if (existeDni<0){
            System.out.println("El DNI aportado no existe");
        }else{
            for (int i=0; i<prestamos.size(); i++){
                if (prestamos.get(i).getUsuarioPres()==usuarios.get(existeDni)){
                    prestamos.remove(i);
                    i--;
                }
            }
            usuarios.remove(existeDni);
            
            /* CON ITERATOR - LOS VEREMOS EN TEMA 6 Y PERMITEN BORRADO
             "AL VUELO" EN COLECCIONES - REQUIERE import java.util.Iterator;
            
            Iterator<Prestamo> it = prestamos.iterator();
            while(it.hasNext()) {
                if (it.next().getUsuarioPres()==usuarios.get(existeDni)){
                    it.remove();
                }
                        
            }
            usuarios.remove(existeDni);*/
        }
    }
    public void examen5() {
        /* MUCHAS POSIBILIDADES DISTINTAS, MÁS SENCILLAS O MÁS COMPLEJAS
        SE PUEDE USAR UN ARRAY DE "CONTADORES"  PARA IR CONTANDO EL NÚMERO DE EJEMPLARES PRESTADOS DE CADA LIBRO
         ... O APLICAR LÓGICAS MÁS SENCILLAS PERO IGUAL DE EFECTIVAS
        USANDO UN ARRAY DE CONTADORES LA VENTAJA ES QUE PODRÍAMOS SABER EXACTAMENTE
        CUANTOS EJEMPLARES DE CADA LIBRO ESTÁ PRESTADOS*/
        
        // SENCILLO Y SIN ARRAY AUXILIAR
        /*int maxUnidades=0;
        int posMax=0;
    	int i=0;
        for (Libro l:libros) {
            int unidadesLibro=0;
            for (Prestamo p:prestamos) {
        	if (p.getLibroPres()==l) {
        	    unidadesLibro ++;
        	} 
        	if (unidadesLibro>maxUnidades) {
                    maxUnidades=unidadesLibro;
                    posMax=i;
                }
            }
            i++;
        }
        System.out.println("El libro más leido es: " + libros.get(posMax) + " con préstamos: " + maxUnidades);
        
        */
        //CON ARRAY DE CONTADORES
        int[] contadores= new int[libros.size()];
        int c=0;
        for(Libro l: libros){
            for (Prestamo p:prestamos){
               if (l==p.getLibroPres()){
                     contadores[c]++;  
               }
            }
            System.out.println("El libro " + l.getTitulo() + "  tiene préstamos: " + contadores[c]);
            c++;
        }
        // después de calcular el totall de préstamos de cada libro hay que averiguar el que más tiene
        int posMax=0;
        int max=contadores[0];
        for (int i=1;i < contadores.length;i++){
            if (contadores[i] > max){
                max=contadores[i];
                posMax=i;
            }
        }
        System.out.println("El libro más prestado: " + libros.get(posMax).getTitulo() + "  tiene " + contadores[posMax] + " préstamos");
    }
}