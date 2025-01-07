package Examen;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te calcula la factorial de ese numero");
		int numero = sc.nextInt();
		int resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		System.out.println("El resultado de la factorial es " + resultado);
	}
}
