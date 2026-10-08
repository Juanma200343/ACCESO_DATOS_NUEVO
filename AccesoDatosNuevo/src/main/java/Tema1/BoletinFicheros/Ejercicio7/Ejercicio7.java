package Tema1.BoletinFicheros.Ejercicio7;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Ejercicio7 {
    private static final Logger logger = LogManager.getLogger(Ejercicio7.class);

	
	public List<File> buscar(File dir,String nombre){
		boolean agregado = false;
		List<File> lista = new ArrayList<File>();
		File[] archivos = dir.listFiles();
		
		
		if(dir != null) {
			if(nombre.contains(nombre)) {
				lista.add(dir);
				agregado = true;
			}
			
		}else{
			buscar(dir,nombre);
			
		}
		
		
		return lista;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
