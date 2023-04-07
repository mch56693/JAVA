package tiendaPedidos;


public class Articulo {
	private String idArticulo;
    private String decripcion;
    private String familia;
    private int existencias;
    private double pvp;
	
    public Articulo(String idArticulo, String descripcion, String familia, int existencias, double pvp)
    {
       setIdPedido(idArticulo);
       setDescripcion(descripcion);
       setFamilia(familia);
       setExistencias(existencias);
       setPvp(pvp);
    }
    
    
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdPedido(String idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getDescripcion() {
		return decripcion;
	}
	public void setDescripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}


	@Override
    public String toString() {
        return "ID ("+ getIdArticulo() + "):" + "\nDESCRIPCION: " + getDescripcion() + "\nEXISTENCIAS: " + getExistencias() + "\nPVP: " + getPvp() + "\n";
    }
    
}
