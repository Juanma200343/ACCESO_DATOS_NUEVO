package EjercicioTiendaOnline.modelo;

import java.util.Objects;

public class Pedido {
	
	private static int contador;
	private int id;
	private Cliente cliente;
	private float importe;
	private Estado estado;

	public Pedido(int id, Cliente cliente, float importe, Estado estado) {
		super();
		contador = contador++;
		this.id = contador;
		this.cliente = cliente;
		this.importe = importe;
		this.estado = Estado.PENDIENTE;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(cliente, Integer.valueOf(id));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(cliente, other.cliente) && id == other.id;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", importe=" + importe + ", estado=" + estado + "]";
	}
	
	

}
