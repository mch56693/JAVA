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
    
    public int buscarDni(String dni) throws NoEncontrado {
        int pos=-1;
        int i=0;
        for (Cliente c : clientes) {
             if (c.getDni().equals(dni)){
                 pos=i;
                 break;
             }
             i++;
        }
        if (pos < 0) {
            throw new NoEncontrado ("No Existe ningún cliente con el DNI: " + dni);                                             
        }
        return pos;
    }
    
    public int buscarId(String id) throws NoEncontrado {
        int pos=-1;
        int i=0;
        for (Articulo a : articulos) {
             if (a.getIdArticulo().equals(id)){
                 pos=i; 
                 break;
             }
             i++;
        }
        if (pos < 0) {
            throw new NoEncontrado ("No Existe ningún Articulo con el ID: " + id);                                             
        }
        return pos;
    }
    
    public void menu(){
      int op=0;
      do{
        System.out.println("\n\n\n\n\n\t\t\t\tMENU DE OPCIONES\n");
        System.out.println("\t\t\t\t1 - LISTADO ARTICULOS POR SECCION");
        System.out.println("\t\t\t\t2 - TOTAL PEDIDO CON IVA");
        System.out.println("\t\t\t\t3 - CUPON DESCUENTO CLIENTES");
        System.out.println("\t\t\t\t4 - PRUEBA EXCEPCIONES");
        System.out.println("\t\t\t\t9 - SALIR");
        op=sc.nextInt();
        switch (op){
           case 1:{
             examen1(menuSeccion());
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
        }
      }while (op != 9);
    }

    /* RECOGIENDO LA OPCION COMO UN ENTERO 
    public int menuSeccion(){
      int seccion;
      do{
        System.out.println("\n\n\n\n\n\t\t\t\tELIJA SECCIÓN PARA VER ARTÍCULOS\n");
        System.out.println("\t\t\t\t1 - PERIFÉRICOS");
        System.out.println("\t\t\t\t2 - ALMACENAMIENTO");
        System.out.println("\t\t\t\t3 - IMPRESORAS");
        System.out.println("\t\t\t\t4 - MONITORES");
        System.out.println("\t\t\t\t5 - TODAS");
        seccion=sc.nextInt();
      }while (seccion<1 || seccion>5);
      return seccion;
    } 
    
    public void examen1 (int sec){
        char aux= (char) (sec + '0');
        if (aux==5){
            for (Articulo a:articulos){
                System.out.println(a);
            }
        }else{
            for (Articulo a:articulos){
                if (aux == a.getIdArticulo().charAt(0)){
                    System.out.println(a);
                }  
            }
        }
    }*/
    
    //RECOGIENDO LA OPCION COMO UN CHAR 
    public char menuSeccion(){
      char seccion;
      do{
        System.out.println("\n\n\n\n\n\t\t\t\tELIJA SECCIÓN PARA VER ARTÍCULOS\n");
        System.out.println("\t\t\t\t1 - PERIFÉRICOS");
        System.out.println("\t\t\t\t2 - ALMACENAMIENTO");
        System.out.println("\t\t\t\t3 - IMPRESORAS");
        System.out.println("\t\t\t\t4 - MONITORES");
        System.out.println("\t\t\t\t5 - TODAS");
        seccion=sc.next().charAt(0);
      }while ((int)seccion<49 || (int)seccion>53);
      return seccion;
    } 
    public void examen1 (char sec){
        if (sec=='5'){
            for (Articulo a:articulos){
                System.out.println(a);
            }
        }else{
            for (Articulo a:articulos){
                if (sec == a.getIdArticulo().charAt(0)){
                    System.out.println(a);
                }       
            }
        }
    }
    
    public void examen2 (){
       System.out.println("INTRODUCE EL ID DEL PEDIDO PARA CALCULAR TOTAL: ");
       String id = sc.next();
       int i=0;
       double total=0;
       while(!pedidos.get(i).getIdPedido().equals(id)){
           i++;
       }
       System.out.println("LISTADO DE ARTICULOS PEDIDO " + id +":\n");
       for (Articulo a:pedidos.get(i).getListArticulos()){
           System.out.println(a.getDescripcion() + "\t" + a.getPvp()+ "\tPRECIO C/IVA: " + iva21(a.getPvp())+ "€  ");
           total=total+a.getPvp();
       }
       System.out.println("\nTOTAL PEDIDO " + id + "\t\t" + total + "\tTOTAL CON IVA: " + iva21(total)+ "€  ");
    }
     
    public double iva21(double pvp) {
        return (pvp+(pvp*0.21));
    }
     
    public void examen3(){
        double[] totales = new double[clientes.size()];
        int i=0;
        for (Cliente c:clientes){
            for (Pedido p:pedidos){
                if (p.getClientePedido()== c){
                    for (Articulo a:p.getListArticulos()){
                        totales[i]=totales[i]+a.getPvp();
                    }
                }
            }
            i++;
        }
        for (int c=0; c<totales.length;c++){
            if (totales[c]>=500){
                System.out.println(clientes.get(c).getNombre() + " TIENE PEDIDOS POR VALOR DE: " + totales[c] +
                        " Y HA OBTENIDO UN CUPON DESCUENTO POR VALOR DE: " + totales[c]*0.05);
            }
        }
    }
     
    public void examen4(){
       System.out.println("INTRODUCE EL DNI DE UN CLIENTE: ");
       String dni = sc.next();
       try{
           System.out.println(clientes.get(buscarDni(dni)));
       }
       catch (NoEncontrado e){
           System.out.println(e.getMessage());
       }
       
       System.out.println("\nINTRODUCE EL ID DE UN ARTICULO: ");
       String id = sc.next();
       try{
           System.out.println(articulos.get(buscarId(id)));
       }
       catch (NoEncontrado e){
           System.out.println(e.getMessage());
       } 
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
       pedidos.add(new Pedido("1",clientes.get(0),new ArrayList<Articulo>(List.of(articulos.get(0),articulos.get(1))),hoy));                                                                                                                                                               //EDU
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