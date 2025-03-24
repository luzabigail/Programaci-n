
public class CuentaNomina extends Cuenta{

	double valornomina;
	
	public CuentaNomina(String nombre, double saldo, double nomina) {
		super(nombre, saldo);
		this.valornomina = nomina;
	
	}

	public void reintegro (double importe) {
	   if ( importe > 0 ) {
		   if ( (saldo - importe) >= 0) {
		   saldo -= importe;
		   } else {
			   if ( (importe - saldo) <= valornomina ) {
				   saldo -= importe;
			   }
		   }
	   }
	}
}
