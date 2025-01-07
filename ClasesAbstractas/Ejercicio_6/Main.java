package Ejercicio_6;

public class Main {

	public static void main(String[] args) {
		
		Instrumento guitarra = new Guitarra();
		Instrumento piano = new Piano();
		Instrumento flauta = new Flauta();
		
		//Guitarra
		guitarra.afinar();
		guitarra.tocar();
		
		//Piano
		piano.afinar();
		piano.tocar();
		
		//Flauta
		flauta.afinar();
		flauta.tocar();
	}

}
