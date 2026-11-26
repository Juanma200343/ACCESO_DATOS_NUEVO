package Tema1.SimulacionXML.Simulacion.src.main.java.servicio;
import java.util.List;


import Tema1.SimulacionXML.Simulacion.src.main.java.modelo.Mascota;

public interface IMascotaService {
	
	public List<Mascota> findAll();
	public void altaMascota();
}
