package Tema1.Boletin2XML.ejercicio1.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;
import Tema1.Boletin2XML.exception.EmpleadoException;

public class RepoEmpleado {
	
	private Set<Empleado> empleados;
	private UtilesXMLDom utiles;
	
	public RepoEmpleado(String ruta) {
		super();
		this.empleados = new TreeSet<Empleado>();
		this.utiles = new UtilesXMLDom();
	}
	
	private Set<Empleado> leerFichero() throws EmpleadoException {
		Set<Empleado> lista = this.utiles.lecturaXML();
		this.empleados = lista;
		return this.empleados;
	}
	
	public Set<Empleado> findAll() throws EmpleadoException {
		return leerFichero();
	}
	
	private void escribirFichero(String nombreFichero, List<Empleado> empleados) throws EmpleadoException {
		this.utiles.escribeEmpleadoEnXML(nombreFichero, empleados);
	}
	
	public void save(String nombreFichero, List<Empleado> empleados) throws EmpleadoException {
		escribirFichero(nombreFichero, empleados);
	}
	
}
