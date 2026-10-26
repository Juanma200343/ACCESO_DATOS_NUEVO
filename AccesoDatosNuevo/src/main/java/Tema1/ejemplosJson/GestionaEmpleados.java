package Tema1.ejemplosJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import Tema1.ejemploLecturaYEscriturasDeFicheros.repositorio.RepositorioPersonasTxt;

public class GestionaEmpleados {
	private static final Logger logger = LogManager.getLogger(GestionaEmpleados.class);
	
	public void leeEmpleado(){
		Gson gson = new Gson();
		FileReader fichero;
		try {
			fichero = new FileReader("src\\main\\resources\\Empleado.json");
			Empleado empleado = gson.fromJson(fichero , Empleado.class);
			logger.debug(empleado);
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void escribeEmpleado(Empleado empleado, String ruta){
		// Convertir el objeto a JSON
		 Gson gson = new Gson();
		 String json = gson.toJson(empleado);
		 FileWriter fichero = null;
		 try {
			fichero = new FileWriter(ruta);
			fichero.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					System.out.println("Error al escribir empleado");
			}			
		}		
			
	}	   
		 
}

	public void escribeEmpleados(List<Empleado> empleados, String rutaFicheroSalida) {
	for(Empleado e : empleados ) {
		escribeEmpleado(e,rutaFicheroSalida);
	}
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionaEmpleados g1 = new GestionaEmpleados();
		g1.leeEmpleado();
		g1.escribeEmpleado(null, null);
		
	
		
	}

}
