package biblioteca;
/**
 * AÑADIMOS ESTA CLASE Cliente AL PROYECTO INICIAL PARA RELACIONARLA CON LA CLASE Cuenta
 * 
 * Haremos que el titular de una Cuenta sea un objeto de la clase Cliente
 * 
 * Simplemente añadimos su comportamiento por defecto: Constructor/SETTERS/GETTERS
 * 
 * @author Edu
 * @version Diciembre 2022
 */
public class Cliente
{
    private String dni;
    private String Nombre;
    
    public Cliente(String dni, String nombre)
    {
       setDni(dni);
       setNombre(nombre);
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
