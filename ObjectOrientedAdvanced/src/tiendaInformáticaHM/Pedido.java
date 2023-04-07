package tiendaInformáticaHM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
	private String idPedido;
	private Cliente clientePedido;
	private ArrayList <Articulo> cesta;
	private LocalDate fechaPedido;
	
	public Pedido(String idPedido, Cliente clientePedido, ArrayList cesta, LocalDate fechaPedido)
    {
       setIdPedido(idPedido);
       setClientePedido(clientePedido);
       setCesta(cesta);
       setFechaPedido(fechaPedido);
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

	public ArrayList<Articulo> getCesta() {
		return cesta;
	}
	public void setCesta(ArrayList<Articulo> cesta) {
		this.cesta = cesta;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}


	@Override
	public String toString() {
		return "||ID||" + "\n" + getIdPedido() + "\n" + getClientePedido() + "\nLISTA: " + getCesta() + "\nFECHA PEDIDO: " + getFechaPedido() + "\n\n"; 
	    }
	} 	

