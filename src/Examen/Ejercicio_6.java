package Examen;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime numeros 3 numeros");
		int[] numeros = new int[3];
		for (int i = 0; i < numeros.length; i++) {
			int numero = sc.nextInt();
			numeros[i] = numero;
		}
		for (Integer array : numeros)
			System.out.print(array + " ");
	}

}