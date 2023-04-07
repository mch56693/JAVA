package bibliotecaV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ORIENTADA A PERSISTENCIA - PATRONES DE DISEÑO
 * 
 * SE ELIMINA TODA FUNCIONALIDAD DE LAS CLASES Cliente y Cuenta - Sólo CONSTRUCTOR - SET/GET - toString
 * 
 * SE PASA TODA LA FUNCIONALIDAD A LA CLASE BANCO QUE TIENE UN ÚNICO ATRIBUTO - 1 ARRAY LIST CON TODAS LAS CUENTAS DEL BANCO
 * 
 * A PARTIR DE AHÍ SE HARÍAN LOS METODOS NECESARIOS PARA UN CRUD COMPLETO 
 * 
 *   - AÑADIR CUENTA (IMPLICA AÑADIR CLIENTE Y GENERAR IBANS)
 *   - ELIMINAR CUENTA (EN OBRAS)
 *   - LISTAR CUENTAS
 *   - BUSCAR CUENTA POR IBAN
 *   - BUSCAR CUENTA POR DNI
 *   
 *   
 *   LA CLASE BANCO A SU VEZ ACTÚA COMO MAIN CLASS Y DENTRO DEL MÉTODO MAIN SE SE HACEN UNAS SENCILLAS PRUEBAS DE CREACIÓN DE CUENTAS
 *   + UN INGRESO POR IBAN + UNA RETIRADA POR DNI
 *   
 *   EN EL SIGUIENTE EJEMPLO HAREMOS UN MENÚ DE OPCIONES COMPLETO CON MÁS FUNCIONALIDAD
 * 
 * @author edu 
 * @version Diciembre 2022
 */

public class Banco {
          
   //ATRIBUTO ÚNICO - LISTA DE CUENTAS
    private ArrayList<Cuenta> cuentas;
        
    //CONSTRUCTOR
    public Banco() {
        cuentas=new ArrayList();
    }
    
    //INSERTAR CUENTAS EN EL BANCO (AÑADIRLAS A LA ARRAYLIST)
    public void insertarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
       
    //ELIMINAR CUENTAS DEL BANCO, INDICANDO LA POSICION EN LA ARRAYLIST DE LA CUENTA A ELIMINAR 
    public void eliminar (int posicion){
        cuentas.remove(posicion);
    }
    
    // OBTENER LA CUENTA QUE SE ENCUENTRA EN UNA POSICION DADA
    public Cuenta buscarCuenta (int posicion){
        return cuentas.get(posicion);
    }
    
    //MOSTRAR LAS CUENTAS DEL BANCO - LISTAR 1 A 1 LAS CUENTAS DE LA ARRAYLIST PARA MOSTRAR LA SALIDA DE LOS MÉTODOS toString() 
    public void listarCuentas(){
        for (Cuenta c:cuentas){
            System.out.println(c);
        }
    }
     
    //BUSCAR UN IBAN EN EL BANCO (devuelve un int que indica la posición en el Arraylist en la que hemos encontrado el IBAN específicado. -1 si no existe)
    public int buscarIban(String iban) {
        int buscarIban = -1;
        int i=0;
        for (Cuenta c : cuentas) {
             if (c.getIban().equals(iban)){
                  buscarIban=i;
                  break;
             }
             i++;
        }
        return buscarIban;
    }
    
    //BUSCAR UN DNI EN EL BANCO (devuelve un int que indica la posición en el Arraylist en la que hemos encontrado el DNI específicado. -1 si no existe)
    public int buscarDni(String dni) {
        int buscarDni = -1;
        int i=0;
        for (Cuenta c : cuentas) {
             if (c.getTitular().getDni().equals(dni)){
                  buscarDni=i;
                  break;
             }
             i++;
        }
        return buscarDni;
    }
    
    //GENERAR UN IBAN PARA CADA NUEVA CUENTA - PROVISIONAL 
    public String generaIban(){
       int[] cadena= new int[12];  
       for (int i=0; i<cadena.length; i++) 
       {
            cadena[i]= (int)(Math.random() * 10);
       }
       String iban = "ES330100";
       for (int i = 0; i < cadena.length; i++) {
            iban = iban.concat(String.valueOf(cadena[i]));
       }
       return iban;
    }  
    
    
    public static void main(String[] args) {
         
        Scanner sc=new Scanner (System.in);
        
        //INSTANCIAMOS UN ÚNICO OBJETO DE LA CLASE BANCO, QUE VA A SER UN ARRAYLIST DE CUENTAS CON TODA LA FUNCIONALIDAD ANTERIOR
        
        Banco b=new Banco();
        
        b.insertarCuenta(new Cuenta(b.generaIban(),new Cliente("11111111","pepe")));
        b.insertarCuenta(new Cuenta(b.generaIban(),new Cliente("22222222","Luisa"),2000));
        b.insertarCuenta(new Cuenta(b.generaIban(),new Cliente("33333333","Víctor"),3000));
        b.insertarCuenta(new Cuenta(b.generaIban(),new Cliente("44444444","María"),4000));
             
        //mostramos las cuentas
        System.out.println("\nDespués de instanciar los Objetos:\n");
        b.listarCuentas();
                 
        /*EJEMPLO DE INGRESO. Pedir Nº de cuenta 
        Buscar la cuenta en la ArrayList e ingresar la cantidad ESPECIFICADA */
        System.out.println("\nNUMERO DE CUENTA PARA EL INGRESO: ");
        String iban = sc.next();
        
        int c=b.buscarIban(iban);
        if (c<0) {
            System.out.println("\nNO SE HA ENCONTRADO LA CUENTA INDICADA\n");
        }else{
            System.out.println("CANTIDAD PARA EL INGRESO: ");
            b.buscarCuenta(c).setSaldo(b.buscarCuenta(c).getSaldo() + sc.nextDouble());
        }
         
        System.out.println("\nDespués de hacer el Ingreso:\n");
        b.listarCuentas();

            
        /* EJEMPLO DE RETIRADA DE DINERO. PEDIR DNI CLIENTE, BUSCARLO
        Y RETIRAR LA CANTIDAD SOLICITADA DE SU CUENTA   */
        System.out.println("\nDNI CLIENTE PARA LA RETIRADA: ");
        String dni = sc.next();
      
        c=b.buscarDni(dni);
        if (c<0) {
            System.out.println("\nEL DNI NO ESTA ASOCIADO A NINGUNA CUENTA: \n");
        }else{
            System.out.println("CANTIDAD A RETIRAR: ");
            b.buscarCuenta(c).setSaldo(b.buscarCuenta(c).getSaldo() - sc.nextDouble());
        }
        

        System.out.println("\nDespués de LAS RETIRADAS:\n");
        b.listarCuentas();
        sc.close();
    }
}
