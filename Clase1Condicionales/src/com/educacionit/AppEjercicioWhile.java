package com.educacionit;

import java.util.Scanner;

//leer 10 numero e imprimir cuantos son positivos , cuantos negativos y cuantos neutros
public class AppEjercicioWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroIngresado = 0, contadorPositivos = 0, contadorNegativos = 0, contadorNeutros = 0;
		int contador = 1;

		while (contador <= 10) {
			System.out.println("Ingrese el numero " + contador + " por favor");
			numeroIngresado = teclado.nextInt();

			if (numeroIngresado < 0)
				contadorNegativos++;
			else if (numeroIngresado > 0)
				contadorPositivos++;
			else
				contadorNeutros++;

			contador++;
		}
		System.out.println("de los 10 numeros ingresados ");
		System.out.println("negativos : " + contadorNegativos);
		System.out.println("positivos : " + contadorPositivos);
		System.out.println("neutros : " + contadorNeutros);

		teclado.close();
	}

}
