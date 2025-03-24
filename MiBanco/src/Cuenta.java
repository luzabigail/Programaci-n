
public class Cuenta {

	private String titular; // Nombre del dueño de la cuenta
	protected double saldo;   //  Dinero disponible en la cuenta
	
	public Cuenta(String nombre, double saldo) {
		this.saldo = saldo;
		this.titular = nombre;
	}
	//Un método reintegro, que recibe una cantidad y lo saca de la cuenta (resta del saldo),
	
	public void reintegro (double importe) {
		if ( importe > 0 && importe <= saldo) {
			saldo -= importe;
		}
	}
	
	//Un método ingreso, que recibe una cantidad y lo mete en la cuenta (suma al saldo).
	
	public void ingreso (double importe) {
		 if ( importe > 0) {
			 saldo += importe;
		 }
	}

	@Override
	public String toString() {
		return  " "+ this.getClass().getName() +" [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//Un método toString, para poder escribir los datos de la cuenta en pantalla.
	
	abstract boolean esUnclienteBueno () {
		
	}
	
}
