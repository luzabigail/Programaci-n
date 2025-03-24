
public class CuentaCredito extends Cuenta {

	public CuentaCredito(String nombre, double saldo) {
		super(nombre, saldo);
	}

	public void reintegro (double importe) {
		 if ( importe > 0) {
			 if ( saldo < importe) {
				 saldo -= (importe + (saldo -importe)*-0.10);
			 } else {
				 saldo -= importe;
			 }
		 }
	}
}
