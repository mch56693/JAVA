package bibliotecaFINAL;

public class Libro {
	private String ISBN;
    private String titulo;
    private String autor;
    private int unidades;
	
    public Libro(String ISBN, String titulo, String autor, int unidades)
    {
       setISBN(ISBN);
       setTitulo(titulo);
       setAutor(autor);
       setUnidades(unidades);
    }
    
    public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
    
	@Override
    public String toString() {
        return "ISBN ("+ getISBN() + "):" + "\nTITULO: " + getTitulo() + "  AUTOR: " + getAutor() + "\nUnidades: " + getUnidades() + "\n";
    }
    
}
