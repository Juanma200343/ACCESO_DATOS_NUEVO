package Tema1.SimulacionXML.Simulacion.src.main.java.repositorio;

import java.util.List;


import Tema1.SimulacionXML.Simulacion.src.main.java.exception.VeterinariaException;
import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Mascota;

public interface IRepoMascota {
	public List<Mascota> findAll() throws VeterinariaException;
	public void altaMascota();

}
