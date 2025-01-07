package Examen;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos numeros y el programa te dice si es divisible");
		System.out.println("Dime el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Dime el segundo numero");
		int numero2 = sc.nextInt();

		if (numero1 % numero2 == 0) {
			System.out.println(numero1 + " es dividible entre " + numero2);
		} else {
			System.out.println(numero1 + " es NO dividible entre " + numero2);
		}

	}

}