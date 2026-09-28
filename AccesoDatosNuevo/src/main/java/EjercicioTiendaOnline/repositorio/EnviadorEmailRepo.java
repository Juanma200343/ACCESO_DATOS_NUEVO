package EjercicioTiendaOnline.repositorio;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import EjercicioTiendaOnline.modelo.EnviadorEmail;
import Logs.PruebaLog;

public class EnviadorEmailRepo implements INotificadorRepo {

	
	List<EnviadorEmail> notificadores;

	public EnviadorEmailRepo(List<EnviadorEmail> notificadores) {
		super();
		this.notificadores = notificadores;
	}

	public List<EnviadorEmail> getNotificadores() {
		return notificadores;
	}

	public void setNotificadores(List<EnviadorEmail> notificadores) {
		this.notificadores = notificadores;
	}
	
	public void agregarAviso() {
		
	}
	
	public void leerAviso() {
		
	}
	
	
	public void modificarAviso() {
		
	}
	
	public void eliminarAviso() {
		
	}
	
	

	@Override
	public String toString() {
		return "EnviadorEmailRepo [notificadores=" + notificadores + "]";
	}
	
	

}
