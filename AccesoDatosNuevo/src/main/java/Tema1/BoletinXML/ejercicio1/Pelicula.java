package Tema1.BoletinXML.ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

import org.w3c.dom.Element;

public class Pelicula {
	private String titulo;
	private String duracion;
	private String genero;
	private String sinopsis;
	private String ano;
	private String director;
	
	public Pelicula(String titulo, String duracionElemento, String genero, String sinopsis, String ano, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracionElemento;
		this.genero = genero;
		this.sinopsis = sinopsis;
		this.ano = ano;
		this.director = director;
	}


	public Pelicula(Element tituloElemento, Element duracionElemento, Element generoElemento, Element sinopsisElemento,
			Element anoElemento, Element directorElemento) {
		// TODO Auto-generated constructor stub
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", ano=" + ano + ", director=" + director + "]";
	}

}
