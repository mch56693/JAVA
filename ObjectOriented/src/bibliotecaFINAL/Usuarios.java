package bibliotecaFINAL;

public class Usuarios {
	private String dni;
    private String Nombre;
    private String telefono;
    
    public Usuarios(String dni, String nombre, String telefono)
    {
       setDni(dni);
       setNombre(nombre);
       setTelefono(telefono);
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
  
    public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
    public String toString() {
        return "(DNI:"+ getDni() + ") " + getNombre() + "\nTlf: " + getTelefono() + "\n";
    }
}
