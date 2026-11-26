package Tema1.SimulacionXML.Simulacion.src.main.java.servicio;

import java.util.List;


import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Mascota;
import Tema1.SimulacionXML.Simulacion.src.main.java.repositorio.RepoMascota;

public class MascotaService implements IMascotaService {
	
	private List<Mascota> mascotas;
	private RepoMascota repo;
	public MascotaService(List<Mascota> mascotas, RepoMascota repo) {
		super();
		this.mascotas = mascotas;
		this.repo = repo;
	}
	@Override
	public List<Mascota> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void altaMascota() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
