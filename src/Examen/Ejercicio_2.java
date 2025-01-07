package Examen;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int[] numeros = { 3, 7, 2, 8, 4 };

		int min = numeros[0];

		int max = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		System.out.println("El numero más grande del array es " + max);
		System.out.println("El numero más pequeño del array es " + min);
	}

}
