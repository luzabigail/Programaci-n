
public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(String nombre, double saldo) {
		super(nombre, saldo);
	}
	
	public void ingreso (double importe) {
		if ( importe > 0) {
			saldo += importe + importe*0.01;
		}
	}

}
