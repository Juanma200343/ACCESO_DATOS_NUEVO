package Tema1.Boletin2XML.ejercicio1.servicio;//

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Tema1.Boletin2XML.ejercicio1.modelo.Empleado;
import Tema1.Boletin2XML.ejercicio1.repositorio.IRepoEmpleado;
import Tema1.Boletin2XML.ejercicio1.repositorio.RepoEmpleado;
import Tema1.Boletin2XML.ejercicio1.exception.*;

public class EmpleadoService implements IEmpleadoService  {
private static final Logger logger = LogManager.getLogger(EmpleadoService.class);
	
	private List<Empleado> empleados;
	private RepoEmpleado repositorio;
	
	public EmpleadoService(String ruta) {
		super();
		this.repositorio =  new RepoEmpleado(ruta);
	}
	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		try {
			this.empleados = (List<Empleado>) repositorio.findAll();
		} catch (Tema1.Boletin2XML.ejercicio1.exception.EmpleadoException e) {
			logger.error(e.getMessage());
		}
		return this.empleados;
	}

	@Override
	public void save(String nombreFichero, List<Empleado> empleados) {
		// TODO Auto-generated method stub
		try {
			repositorio.save(nombreFichero, empleados);
		} catch (EmpleadoException e) {
			logger.error(e.getMessage());
		}
	}



}
