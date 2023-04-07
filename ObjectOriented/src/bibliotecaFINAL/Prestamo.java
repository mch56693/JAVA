package bibliotecaFINAL;

import java.time.LocalDate;

public class Prestamo {
	private Usuarios usuarioPrest;
	private Libro libroPrest;
	private LocalDate fechaPrest;
	private LocalDate fechaDev;
	
	public Prestamo(Usuarios usuarioPrest, Libro libroPrest, LocalDate fechaPrest, LocalDate fechaDev)
    {
       setUsuarioPrest(usuarioPrest);
       setLibroPrest(libroPrest);
       setFechaPrest(fechaPrest);
       setFechaDev(fechaDev);
    }
	
	public Usuarios getUsuarioPrest() {
		return usuarioPrest;
	}

	public void setUsuarioPrest(Usuarios usuarioPrest) {
		this.usuarioPrest = usuarioPrest;
	}

	public Libro getLibroPrest() {
		return libroPrest;
	}

	public void setLibroPrest(Libro libroPrest) {
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
		return "||USUARIO||" + "\n" + getUsuarioPrest() + "\n" + getLibroPrest() + "\nFecha del Préstamo: " + getFechaPrest() + "\nFecha de Devolución: " + getFechaDev() + "\n\n"; 
	    }
	} 	

