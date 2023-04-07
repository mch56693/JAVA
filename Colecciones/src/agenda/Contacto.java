package agenda;

public class Contacto implements Comparable<Contacto> {
	private String nombre;
	private String telefono;
		
	public Contacto (String nombre, String telefono) 
	{
		setNombre(nombre);
		setTelefono(telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
    public String toString() {
        return "(Nombre:"+ getNombre() + ") " + "\nTlf: " + getTelefono() + "\n";
    }

	@Override
	public int compareTo(Contacto c) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(c.getNombre());
	}
}

