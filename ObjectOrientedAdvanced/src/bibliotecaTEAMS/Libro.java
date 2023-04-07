package bibliotecaTEAMS;

public class Libro {
	private String Isbn;
    private String titulo;
    private String autor;
    private int ejemplares;
	
    public Libro(String ISBN, String titulo, String autor, int ejemplares)
    {
       setIsbn(ISBN);
       setTitulo(titulo);
       setAutor(autor);
       setEjemplares(ejemplares);
    }
    
    public String getIsbn() {
		return Isbn;
	}
	public void setIsbn(String ISBN) {
		this.Isbn = ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int unidades) {
		this.ejemplares = unidades;
	}
    
	@Override
    public String toString() {
        return "ISBN ("+ getIsbn() + "):" + "\nTITULO: " + getTitulo() + "  AUTOR: " + getAutor() + "\nUnidades: " + getEjemplares() + "\n";
    }
    
}
