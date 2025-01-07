package Ejercicio_1;

public class Radio implements Dispositivo{

	@Override
	public String encender() {
		return "La radio se ha encendido";
	}

	@Override
	public String apagar() {
		return "La radio se ha apagado";
	}

}
