package Ejercicio_11;

public class Perro implements Mascota{

	@Override
	public void emitirSonido() {
		System.out.println("El perro hace guau guau");
		
	}

	@Override
	public void jugar() {
		System.out.println("El perro juega");
	}

}
