package Ejercicio_2;

public class Main {

	public static void main(String[] args) {

		Vehiculos coche = new Coche();
		Vehiculos bici = new Bicicleta();
		Vehiculos avion = new Avion();
		
		coche.encender();
		coche.mover();
		
		bici.encender();
		bici.mover();
		
		avion.encender();
		avion.mover();
		
	}

}
