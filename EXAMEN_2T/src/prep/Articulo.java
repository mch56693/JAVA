package prep;

public class Articulo {
    private String idArticulo;
    private String descripcion;
    private int existencias;
    private double pvp;

    public Articulo(String idArticulo, String descripcion, String familia, int existencias, double pvp) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.pvp = pvp;
    }

    public String getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return idArticulo + " - " + descripcion + "\n\tStock:" + existencias + "\n\tPrecio:" + pvp + "\n";
    }
}
