package Tema1.SimulacionXML.Simulacion.src.main.java.repositorio;

import java.util.ArrayList;

import java.util.List;

import Tema1.SimulacionXML.Simulacion.src.main.java.exception.VeterinariaException;
import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Mascota;

public class RepoMascota implements IRepoMascota {
	
	private List<Mascota> mascotas;
	private UtilesXMLDom utiles;
	
	public RepoMascota(List<Mascota> mascotas, UtilesXMLDom utiles) {
		super();
		this.mascotas = new ArrayList<Mascota>();
		this.utiles = utiles;
	}

	@Override
	public List<Mascota> findAll() throws VeterinariaException {
		// TODO Auto-generated method stub
		return utiles.lecturaXML();
	}

	@Override
	public void altaMascota() {
		// TODO Auto-generated method stub
	}
	
	
	


}
