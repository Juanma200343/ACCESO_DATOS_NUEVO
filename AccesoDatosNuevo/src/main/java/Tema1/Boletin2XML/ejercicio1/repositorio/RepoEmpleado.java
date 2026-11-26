package Tema1.Boletin2XML.ejercicio1.repositorio;//

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;
import Tema1.Boletin2XML.ejercicio1.exception.*;

public class RepoEmpleado {
	
	private List<Empleado> empleados;
	private UtilesXMLDom utiles;
	
	public RepoEmpleado(String ruta) {
		super();
		this.empleados = new ArrayList<Empleado>();
		this.utiles = new UtilesXMLDom();
	}
	
	private List<Empleado> leerFichero() throws EmpleadoException {
		List<Empleado> lista = this.utiles.lecturaXML();
		this.empleados = lista;
		return this.empleados;
	}
	
	public List<Empleado> findAll() throws EmpleadoException {
		return leerFichero();
	}
	
	private void escribirFichero(String nombreFichero, List<Empleado> empleados) throws EmpleadoException {
		this.utiles.escribeEmpleadoEnXML(nombreFichero, empleados);
	}
	
	public void save(String nombreFichero, List<Empleado> empleados) throws EmpleadoException {
		escribirFichero(nombreFichero, empleados);
	}
	
}
