package Ejercicio_1;

public class Televisor implements Dispositivo{

	@Override
	public String encender() {
		return "El televisor se ha encendido";
	}

	@Override
	public String apagar() {
		return "El televisor se ha apagado";
	}

}
