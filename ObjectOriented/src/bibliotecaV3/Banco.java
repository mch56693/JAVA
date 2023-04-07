package bibliotecaV3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author edu
 * @version Diciembre 2022
 */
public class Banco{
    
    Scanner sc=new Scanner(System.in);
    
    /**
     * ATRIBUTO ÚNICO - LISTA DE CUENTAS
     */
    private ArrayList<Cuenta> cuentas;
        
    /**
     * CONSTRUCTOR
     */
    public Banco() {
        cuentas=new ArrayList();
    }
    
    /**
     * ABRIR UNA CUENTA EN EL BANCO SOLICITANDO DATOS AL CLIENTE (AÑADIRLA A LA ARRAYLIST)
     */
    public void abrirCuenta()
    {
        System.out.println("\nDNI CLIENTE: ");
        String dni = sc.next();
        System.out.println("NOMBRE CLIENTE: ");
        String nombre = sc.next();
        System.out.println("\nAPORTACION INICIAL SALDO CUENTA: ");
        double saldo=sc.nextDouble();
        cuentas.add(new Cuenta(generaIban(),new Cliente(dni,nombre),saldo));
    }
              
    /** 
     * CERRAR Y ELIMINAR CUENTAS DEL BANCO, INDICANDO PREVIAMENTE EL IBAN DE LA CUENTA A ELIMINAR 
     * NOS APOYAMOS EN EL MÉTODO buscarIban() PARA BUSCAR LA CUENTA EN EL BANCO POR SU IBAN
     */
    public void cerrarCuenta(){
        System.out.println("\nNUMERO DE CUENTA (IBAN) QUE SE VA A CERRAR: ");
        String iban = sc.next();
        int c=buscarIban(iban);
        cuentas.remove(c);
    }
    
    /** 
     * MOSTRAR LAS CUENTAS DEL BANCO - LISTAR 1 A 1 LAS CUENTAS DE LA ARRAYLIST 
     */
    public void listar(){
        for (Cuenta c:cuentas){
            System.out.println(c);
        }
    }
     
    /** 
     * PARA UN INGRESO ES NECESARIO INDICAR EL NUMERO DE CUENTA (IBAN) 
     * NOS APOYAMOS EN EL MÉTODO buscarIban() PARA COMPROBAR QUE EL IBAN INDICADO EXISTE EN EL BANCO
     */
    public void ingresar()
    {
        System.out.println("\nNUMERO DE CUENTA PARA EL INGRESO: ");
        String iban = sc.next();
        int c=buscarIban(iban);
        if (c<0) {
            System.out.println("\nNO SE HA ENCONTRADO LA CUENTA INDICADA\n");
        }else{
            System.out.println("CANTIDAD PARA EL INGRESO: ");
            cuentas.get(c).setSaldo(cuentas.get(c).getSaldo() + sc.nextDouble());
        }
    }
    
    /** 
     * PARA RETIRAR DINERO ES NECESARIO INDICAR EL DNI DEL CLIENTE 
     * NOS APOYAMOS EN EL MÉTODO buscarDni() PARA COMPROBAR QUE EL DNI INDICADO TIENE CUENTA EN EL BANCO
     */
    public void retirar()
    {
        System.out.println("\nDNI CLIENTE PARA LA RETIRADA: ");
        String dni = sc.next();
        int c=buscarDni(dni);
        if (c<0) {
            System.out.println("\nEL DNI NO ESTA ASOCIADO A NINGUNA CUENTA: \n");
        }else{
            System.out.println("CANTIDAD A RETIRAR: ");
            cuentas.get(c).setSaldo(cuentas.get(c).getSaldo() - sc.nextDouble());
        }
    }
    
    /** 
     * PARA TRANSFERIR DINERO, HAY QUE PEDIR DNI CLIENTE y CUENTA DESTINO 
     * NOS APOYAMOS EN EL MÉTODO buscarDni() PARA COMPROBAR QUE EL DNI INDICADO TIENE CUENTA EN EL BANCO
     * NOS APOYAMOS EN EL MÉTODO buscarIban() PARA COMPROBAR QUE EL IBAN INDICADO EXISTE EN EL BANCO  
     */
    public void transferir()
    {
        System.out.println("\nDNI CLIENTE PARA TRANSFERENCIA: ");
        String dni = sc.next();
        int c1=buscarDni(dni);
        if (c1<0) {
            System.out.println("\nEL DNI NO ESTA ASOCIADO A NINGUNA CUENTA: \n");
        }else{
                System.out.println("\nCUENTA DESTINO PARA TRANSFERENCIA: ");
                String iban = sc.next();
                int c2=buscarIban(iban);
                if (c2<0) {
                    System.out.println("\nNO SE HA ENCONTRADO LA CUENTA INDICADA\n");
                }else{
                    System.out.println("CANTIDAD PARA LA TRANSFERENCIA: ");
                    double cantidad=sc.nextDouble();
                    cuentas.get(c1).setSaldo(cuentas.get(c1).getSaldo() - cantidad);
                    cuentas.get(c2).setSaldo(cuentas.get(c2).getSaldo() + cantidad);
                }
        }
    }  
    
    /** 
     * BUSCAR UN IBAN EN EL BANCO (devuelve un int que indica la posición en el Arraylist
     * en la que aparece el IBAN específicado. (-1) si no aparece)
     */
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
    
    /** 
     * BUSCAR UN DNI EN EL BANCO (devuelve un int que indica la posición en el Arraylist
     * en la que aparece el DNI específicado. (-1) si no aparece)
     */
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
    
    /** 
     * GENERAR UN IBAN PARA CADA NUEVA CUENTA QUE SE ABRE (MÉTODO PROVISIONAL)
     */
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
    
    /** 
     * MENU DE OPCIONES
     */
    public void menu(){
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tMENU DE OPCIONES\n");
            System.out.println("\t\t\t\t1 - ABRIR CUENTA.");
            System.out.println("\t\t\t\t2 - CERRAR CUENTA.");
            System.out.println("\t\t\t\t3 - INGRESOS EN CUENTA.");
            System.out.println("\t\t\t\t4 - REINTEGROS DE CUENTA.");
            System.out.println("\t\t\t\t5 - TRANSFERENCIAS ENTRE CUENTAS.");
            System.out.println("\t\t\t\t6 - LISTADO CUENTAS.");
            System.out.println("\t\t\t\t9 - SALIR.");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    abrirCuenta();
                    break;
                }    
                case 2:{
                    cerrarCuenta();
                    break;
                } 
                case 3:{
                    ingresar();
                    break;
                } 
                case 4:{
                    retirar();
                    break;
                } 
                case 5:{
                    transferir();
                    break;
                }
                case 6:{
                    listar();
                    break;
                } 
            }
        }while (opcion != 9);
    }
    
    
    /********************************************************************************************************** 
     * METODO MAIN - INICIO DE LA APLICACIÓN
     */
    
    public static void main(String[] args) {
         
        //INSTANCIAMOS UN ÚNICO OBJETO DE LA CLASE BANCO - ARRAYLIST DE CUENTAS CON TODA LA FUNCIONALIDAD ANTERIOR
        Banco b=new Banco();
        b.menu();
    }
}
      
    
    
    
        
      
  




          
     

