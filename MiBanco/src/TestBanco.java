import java.util.Iterator;

public class TestBanco {

	public static void main(String[] args) {
		
		Cuenta clientes [] = new Cuenta [4];
		
		clientes[0] = new Cuenta ("Pepe",100);
		clientes[1] = new CuentaCredito ("Eva",100);
		clientes[2] = new CuentaNomina ("Alfredo",100,3000);
		clientes[3] = new CuentaAhorro ("Silvia",100);
		
		
		for (int i = 0; i < clientes.length; i++) {
			clientes[i].ingreso(50);
		}
		
		for (int i = 0; i < clientes.length; i++) {
			clientes[i].reintegro(1000);
		}
		
		for (int i = 0; i < clientes.length; i++) {
			System.out.println(" Nº cuenta "+(i+1)+":"+ clientes[i]);
		}
		

	}

}
