package biblioteca;

public class App
{
    public static void main(String[] args) {
         
    //Nuevos CLIENTES
    Cliente cli1 = new Cliente("11111111","Ana");
    Cliente cli2 = new Cliente("22222222","Luisa");
    Cliente cli3 = new Cliente("33333333","Víctor");
    Cliente cli4 = new Cliente("44444444","Eva");
        
    //INSTANCIAMOS 4 OBJETOS DE TIPO CUENTA
    Cuenta c1 = new Cuenta(cli1,1000);
    Cuenta c2 = new Cuenta(cli2,2000);
    Cuenta c3 = new Cuenta(cli3,3000);
    Cuenta c4 = new Cuenta(cli4,4000);
     
    //mostramos los Clientes y las cuentas
    System.out.println("\nDespués de instanciar los Objetos:\n");
    System.out.println(c1); 
    System.out.println(c2); 
    System.out.println(c3);
    System.out.println(c4);
        
    //Ingresos CUALQUIERA PUEDE INGRESAR
    c1.ingresar(1000);
    c2.ingresar(2000);
    c3.ingresar(3000);
    c4.ingresar(4000);
         
    //mostramos los objetos
    System.out.println("\nDespués de hacer los Ingresos:\n");
    System.out.println(c1); 
    System.out.println(c2); 
    System.out.println(c3);
    System.out.println(c4);
        
    //Retirar Dinero (1000€) de la cuentas 
    c1.retirar(1000);
    c2.retirar(1000);
    c3.retirar(1000);
    c4.retirar(1000);
         
    //mostramos los objetos
    System.out.println("\nDespués de hacer las retiradas:\n");
    System.out.println(c1); 
    System.out.println(c2); 
    System.out.println(c3);
    System.out.println(c4);
    
    //intereses
    c1.pagaInteres();
    c2.pagaInteres();
    c3.pagaInteres();
    c4.pagaInteres();
         
    //mostramos los objetos
    System.out.println("\nDespués de pagar INTERÉS:\n");
    System.out.println(c1); 
    System.out.println(c2); 
    System.out.println(c3);
    System.out.println(c4);
    
    //Transferencias
    c1.transferir(1000,c2);
    c3.transferir(1000,c4);
    
     //mostramos los objetos
    System.out.println("\nDespués de TRANSFERIR:\n");
    System.out.println(c1); 
    System.out.println(c2); 
    System.out.println(c3);
    System.out.println(c4);
    }
}
