package bibliotecaTEAMS;

import java.time.LocalDate;

public class Prestamo {
	private Usuario usuarioPrest;
	private Libro libroPrest;
	private LocalDate fechaPrest;
	private LocalDate fechaDev;
	
	public Prestamo(Usuario usuarioPrest, Libro libroPrest, LocalDate fechaPrest, LocalDate fechaDev)
    {
       setUsuarioPres(usuarioPrest);
       setLibroPres(libroPrest);
       setFechaPrest(fechaPrest);
       setFechaDev(fechaDev);
    }
	
	public Usuario getUsuarioPres() {
		return usuarioPrest;
	}

	public void setUsuarioPres(Usuario usuarioPrest) {
		this.usuarioPrest = usuarioPrest;
	}

	public Libro getLibroPres() {
		return libroPrest;
	}

	public void setLibroPres(Libro libroPrest) {
		this.libroPrest = libroPrest;
	}

	public LocalDate getFechaPrest() {
		return fechaPrest;
	}

	public void setFechaPrest(LocalDate fechaPrest) {
		this.fechaPrest = fechaPrest;
	}

	public LocalDate getFechaDev() {
		return fechaDev;
	}

	public void setFechaDev(LocalDate fechaDev) {
		this.fechaDev = fechaDev;
	}

	@Override
	public String toString() {
		return "||USUARIO||" + "\n" + getUsuarioPres() + "\n" + getLibroPres() + "\nFecha del Préstamo: " + getFechaPrest() + "\nFecha de Devolución: " + getFechaDev() + "\n\n"; 
	    }
	} 	

