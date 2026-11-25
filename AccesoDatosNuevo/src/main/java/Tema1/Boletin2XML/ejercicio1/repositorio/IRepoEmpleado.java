package Tema1.Boletin2XML.ejercicio1.repositorio;

import java.util.Set;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;
import Tema1.Boletin2XML.exception.EmpleadoException;

public interface IRepoEmpleado {

	public Set<Empleado> findAll() throws EmpleadoException;
	public void save(String nombreFichero, Set<Empleado> empleados) throws EmpleadoException;
}
