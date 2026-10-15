package Tema1.Boletin2Ficheros.Ejercicio1.modelo;

import java.io.File;

import Tema1.Boletin2Ficheros.Ejercicio1.exception.GestionFicherosException;

public class DiffFolder {
	
	private File dir1;
	private File dir2;
	
	public DiffFolder(String ruta1,String ruta2) throws GestionFicherosException {
		super();
		
		this.dir1 = new File(ruta1);
		this.dir2 = new File(ruta2);
		
		if(dir1 != null & dir2 != null & dir1.isDirectory() & dir2.isDirectory()) {
			setFolder(dir1, dir2);
		}else {
			throw new GestionFicherosException("No es carpeta");
		}
	}
	

	public File getDir1() {
		return dir1;
	}



	public File getDir2() {
		return dir2;
	}


	public void setFolder(File dir1, File dir2)  {
		this.dir1 = dir1;
		this.dir2 = dir2;	
		
	}




	

	

	
	
}
