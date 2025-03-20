package Burradas;
import java.util.Scanner;

/** 
 * Clase de prueba para la deteccion de palabras obscenas 
 * en los mensajes introducidos por el usuario
 * 
 * */
public class BurradasTest {
	
	//declaracion de array de palabras prohibidas

	    static String tpalabros[] = {"caca","culo","pedo","pis"};
	    
	    public static void main ( String argv[]){
	        
	        Scanner sc= new Scanner(System.in);
	        String linea = "";
	        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
	        
	        boolean error;
	        
	       do {
	    	   error = false;
	       try {
	    	   linea = leerLineaOK(sc);
	       } catch (Exception e) {
	    	   System.out.println(e.getMessage());
	    	   error = true;
	       }
	       if (!error) System.out.println("OK.");
	       
	       }while (!linea.contentEquals("."));
	       System.out.println("FIN PROGRAMA"); 
	    }
	    
	    /**
	     * lee la linea y verifica si tiene alguna de las palabras
	     * del array.
	     * @return la cadena introducida por el usuario si no contiene
	     * palabras prohibidas.
	     * @throws BurradasNOException si la cadena contiene alguna 
	     * palabra prohibida.
	     * 
	     * */
	     
	    public static String leerLineaOK (Scanner sc) throws BurradasNOException {
	    	String cadena = sc.nextLine();
	    	for (int i = 0; i < tpalabros.length; i++) {
	    		if (tpalabros[i].indexOf(cadena.toLowerCase()) != -1) {
	    			throw new BurradasNOException(tpalabros[i]);
	    		}
			}
	        return cadena;
	    }
}


