package bibliotecaV3;

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
    @Override
    public String toString() {
        return "(DNI:"+ getDni() + ") " + getNombre();
    }
}