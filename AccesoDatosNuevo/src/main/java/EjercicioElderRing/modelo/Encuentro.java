package EjercicioElderRing.modelo;

import java.time.LocalDate;
import java.util.List;

public class Encuentro {

	private String nombre;
	private LocalDate fecha_encuentro;
	private int dificultad;
	private List<String> nombreEnemigos;
	
	public Encuentro(String nombre, LocalDate fecha_encuentro, int dificultad, List<String> list) {
		super();
		this.nombre = nombre;
		this.fecha_encuentro = fecha_encuentro;
		this.dificultad = dificultad;
		this.nombreEnemigos = list;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_encuentro() {
		return fecha_encuentro;
	}

	public void setFecha_encuentro(LocalDate fecha_encuentro) {
		this.fecha_encuentro = fecha_encuentro;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public List<String> getNombreEnemigos() {
		return nombreEnemigos;
	}

	public void setNombreEnemigos(List<String> nombreEnemigos) {
		this.nombreEnemigos = nombreEnemigos;
	}

	@Override
	public String toString() {
		return "Encuentro [nombre=" + nombre + ", fecha_encuentro=" + fecha_encuentro + ", dificultad=" + dificultad
				+ ", nombreEnemigos=" + nombreEnemigos + "]";
	}
	
	
	
	
	
	

}
