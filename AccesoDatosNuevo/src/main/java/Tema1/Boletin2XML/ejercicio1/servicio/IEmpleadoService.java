package Tema1.Boletin2XML.ejercicio1.servicio;

import java.util.List;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> findAll();
	public void save(String nombreFichero, List<Empleado> empleados);//
}
