package EjercicioTiendaOnline.modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import EjercicioTiendaOnline.repositorio.EnviadorEmailRepo;

public class EnviadorEmail {
	
	private static final Logger logger = LogManager.getLogger(EnviadorEmail.class);

	
	public void enviarEmail(String direcccion,String asunto,
			String cuerpo) {
	}



	public static Logger getLogger() {
		return logger;
	}



	@Override
	public String toString() {
		return "EnviadorEmail [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	
}
