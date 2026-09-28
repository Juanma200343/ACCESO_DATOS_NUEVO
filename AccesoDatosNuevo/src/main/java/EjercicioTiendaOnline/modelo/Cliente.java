package EjercicioTiendaOnline.modelo;

import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private String correo;
	private int numTelefono;
	public Cliente(String nombre, String correo, int numTelefono) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.numTelefono = numTelefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}
	@Override
	public int hashCode() {
		return Objects.hash(correo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(correo, other.correo);
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", correo=" + correo + ", numTelefono=" + numTelefono + "]";
	}
	
	
	

}
