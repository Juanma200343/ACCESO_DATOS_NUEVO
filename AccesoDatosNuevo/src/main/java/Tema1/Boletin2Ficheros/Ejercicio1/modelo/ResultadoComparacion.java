package Tema1.Boletin2Ficheros.Ejercicio1.modelo;

public class ResultadoComparacion {

	private String nombre;
	private Valor valor;
	
	public ResultadoComparacion(String nombre, Valor valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	
	public String getNomFichero() {
		String nombreFichero = getNombre();
		return nombreFichero;
	}
	
	public Valor getValorComparacion() {
		 
		return this.valor;
	}
	
	
	@Override
	public String toString() {
		return "ResultadoComparacion [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	
	
}
