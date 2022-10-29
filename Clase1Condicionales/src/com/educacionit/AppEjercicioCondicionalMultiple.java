package com.educacionit;

import java.util.Scanner;

//Desarrollar un algoritmo que permita ingresar un numero entero comprendido
//entre 1 y 10  y nos muestre por pantalla si el numero es par o impar 

public class AppEjercicioCondicionalMultiple {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("Ingrese un numero entero comprendido entre 1 y 10 ");
			num = teclado.nextInt();
			if (num < 1 || num > 10) {
				System.out
						.println("El numero ingresado no se encuentra dentro del rango solicitado , intente de nuevo ");
			}
		} while (num < 1 || num > 10);

		switch (num) {
		case 1, 3, 5, 7, 9:
			System.out.println("Numero Impar");
			break;
		case 2, 4, 6, 8, 10:
			System.out.println("Numero par");
			break;
		}

		teclado.close();

	}

}
