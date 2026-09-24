package Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PruebaLog {
	
	private static final Logger logger = LogManager.getLogger(PruebaLog.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("Empieza main");
		logger.error("Ocurre excepción");

	}

}
