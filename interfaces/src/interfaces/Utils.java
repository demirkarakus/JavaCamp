package interfaces;

public class Utils {
	
	//if you use everywhere and everytime, make static
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}
	}
}
