package Ejercicio_2;

public class Principal {

	public static void main(String[] args) {
		
		Pato nadar = new Nadador();
		Pato volar = new Volador();
		
		System.out.println(nadar.nadar());
		System.out.println(volar.volar());
	}

}
