package biblioteca;
/**
 * MODIFICACIONES AL PROYECTO INICIAL:
 * 
 * El atributo titular ya no será un String, sino un objeto de la clase Cliente creada en esta ampliación
 * 
 * También añadimos el atributo static final INTERES, cómo ejemplo de lo que es un atributo de clase con un valor fijo
 * (no es necesario aportarlo en la construcción de objetos pues todos los objetos instanciados tendrán un valor
 * fijo de 0.01 en su atributoo INTERES
 * 
 * No es necesario Modificar CONSTRUCTORES/SETTERS/GETTERS
 * EL RESTO DE métodos que definen el comportamiento son los que ya teníamos:
 *      - ingresar
 *      - retirar
 *      - toString
 *      
 *  ... con 2 nuevas incorporaciones: 
 *  
 *      - public void transferir(double cantidad, Cuenta otraCuenta)
 *      (método para transferir dinero (cantidad) desde el objeto Cuenta que lo invoca hacia otro Objeto Cuenta (otraCuenta)
 *  
 *      Ejemplo:  c1.transferir(500, c2);
 *  
 *      - public void pagaInteres()
 *      (método que al invocarlo abona en el objeto Cuenta que lo llama los intereses correspondientes)
 *      
 *      Ejemplo:  c1.pagaInteres();
 *      
 *      
 *       
 * @author Edu
 * @version Diciembre 2022
 */
public class Cuenta
{
    private Cliente titular;
    private double saldo;
    private static final double INTERES=0.01;
    
    public Cuenta(Cliente Titular) {  
        this(Titular,0); 
    }
 
    public Cuenta(Cliente Titular, double cantidad) {  
        setTitular(Titular);
        if (cantidad < 0) {
            setSaldo(0);
        } else {
            setSaldo(cantidad);
        }
    }
                                     //SETTERS Y GETTERS
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            setSaldo(getSaldo() + cantidad);   
        }
    }
    
    public void retirar(double cantidad) {
        if (getSaldo() - cantidad < 0) {
            setSaldo(0);
        } else {
                setSaldo(getSaldo() - cantidad); 
        }
    }  
        
    public void transferir(double cantidad, Cuenta otraCuenta)
    {
        if (this.getSaldo() >= cantidad)
        {
            this.retirar(cantidad);
            otraCuenta.ingresar(cantidad);
        }
    }
    
    public void pagaInteres()
    {
        setSaldo(getSaldo() + getSaldo()*INTERES);
    }
    
    public String toString() {
        return "  TITULAR: " + getTitular().getDni() + "(" + 
        getTitular().getNombre() + ") \t SALDO: " + getSaldo();
    }
}
