package EjercicioElderRing.modelo;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SinLuz implements Comparable<SinLuz>{
	private static int contador;
	private int id;
	private String nombre;
	
	public SinLuz(int id, String nombre) {
		super();
		this.contador = contador ++;
		this.id = contador;
		this.nombre = nombre;
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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinLuz other = (SinLuz) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "SinLuz [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(SinLuz o) {
		// TODO Auto-generated method stub
		return o.compareTo(o);
	}

	
	
	

}
