package examen;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private String idPedido;
    private Cliente clientePedido;
    private ArrayList <Articulo> listArticulos;
    private LocalDate fechaPedido;

    public Pedido(String idPedido, Cliente clientePedido, ArrayList<Articulo> listArticulos, LocalDate fechaPedido) {
        this.idPedido = idPedido;
        this.clientePedido = clientePedido;
        this.listArticulos = listArticulos;
        this.fechaPedido = fechaPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }
    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }

    public ArrayList <Articulo> getListArticulos() {
        return listArticulos;
    }
    public void setListArticulos(ArrayList <Articulo> listArticulos) {
        this.listArticulos = listArticulos;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }
    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return idPedido + " - " + clientePedido + " - "+ listArticulos + " - " + fechaPedido;
    }
}



