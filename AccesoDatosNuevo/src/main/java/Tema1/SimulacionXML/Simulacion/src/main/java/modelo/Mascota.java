package Tema1.SimulacionXML.Simulacion.src.main.java.modelo;

public class Mascota {

	private int id;
	private String nombre;
	private Especie especie;
	private Propietario propietario;

	public Mascota(String nombre, Propietario propietario) {
		super();
		this.nombre = nombre;
		this.propietario = propietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", propietario=" + propietario
				+ "]";
	}

}
