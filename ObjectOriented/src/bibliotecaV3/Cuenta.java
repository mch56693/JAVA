package bibliotecaV3;
/**
 *  
 * @author Edu
 * @version Diciembre 2022
 */
public class Cuenta {
    private String iban;
    private Cliente titular;
    private double saldo;
    private final double INTERES=0.01;
 
    public Cuenta(String iban, Cliente titular) {  
        this(iban,titular,0); 
    }
   
    public Cuenta(String iban, Cliente titular, double saldo) {  
        setIban(iban);
        setTitular(titular);
        setSaldo(saldo);
    }
    
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
                                       
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
     
    public double getInteres() {
        return INTERES;
    }
     
    @Override
    public String toString() {
        return "IBAN: "+ getIban() + "  TITULAR: " + getTitular() + "\tSALDO: " + getSaldo();
    }
    
}