package CuentaBancaria;

public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }
	
	public boolean retirar(double cantidad) {
		if(cantidad > 0 && cantidad <= saldo) {
			saldo -= cantidad;
			return true;
		}
		return false;
	}
	
	public double obtenerSaldo() {
		return saldo;
	}

}