package Ejercicio_5;

public class Main {

	public static void main(String[] args) {

		 Electrodomestico refrigerador = new Refrigerador();
	     Electrodomestico lavadora = new Lavadora();
	     Electrodomestico microondas = new Microondas();
	     
	     refrigerador.encender();
	     refrigerador.funcionPrincipal();

	     lavadora.encender();
	     lavadora.funcionPrincipal();

	     microondas.encender();
	     microondas.funcionPrincipal();
	}

}
