package Ejercicio_10;

public class PagoConPayPal implements Pago{

	@Override
	public void procesarPago(double monto) {
		System.out.println("Procesando pago de " + " mediante PayPal");
	}

}
