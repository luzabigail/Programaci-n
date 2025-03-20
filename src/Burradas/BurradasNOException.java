package Burradas;

public class BurradasNOException extends Exception {
	// si lo extendemos con runtimeexception en vez de exception NO es obligatorio
	// capturarla pero el programa termina
	public BurradasNOException(String palabra) {
	super("Error no se puede lenguaje obsceno " +palabra);
	}
}
