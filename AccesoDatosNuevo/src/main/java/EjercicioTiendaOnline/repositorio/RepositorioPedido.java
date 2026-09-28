package EjercicioTiendaOnline.repositorio;

import java.util.Objects;
import java.util.Set;

import EjercicioTiendaOnline.modelo.Pedido;

public class RepositorioPedido {
	
	Set<Pedido> pedidos;

	public RepositorioPedido(Set<Pedido> pedidos) {
		super();
		this.pedidos = pedidos;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pedidos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RepositorioPedido other = (RepositorioPedido) obj;
		return Objects.equals(pedidos, other.pedidos);
	}

	//Hacer CRUD
	
	public void agregarPedido() {
		
	}
	
	public void leerPedido() {
		
	}
	
	
	public void modificarPedido() {
		
	}
	
	public void eliminarPedido() {
		
	}
	
	
	@Override
	public String toString() {
		return "RepositorioTienda [pedidos=" + pedidos + "]";
	}
	
	

}
