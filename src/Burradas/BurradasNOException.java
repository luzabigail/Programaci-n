package Burradas;

public class BurradasNOException extends Exception {
	/**
	 * esta clase representa la excepcion que se lanza cuando se detecta el
	 * lengaje obsceno en el Scanner.
	 * Se genera el contructor
	 * */
	public BurradasNOException(String palabra) {
	super("Error no se puede lenguaje obsceno " +palabra);
	}
}
