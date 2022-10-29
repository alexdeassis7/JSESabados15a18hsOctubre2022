package com.educacionit;

import java.util.Scanner;

//3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:

// Si trabaja 40 horas o menos se le paga $16 por cada hora.
// Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 horas
// y $20 por cada hora extra.

public class AppEjercicio3 {

	public static void main(String[] args) {
		// variables y constantes de trabajo
		int hsTrabajadas = 0, hsExtras = 0, salarioSemanal = 0;
		final int hsBase = 40, precionHsBase = 16, precioHsExtra = 20;

		// auot import : ctrl + shift + o
		Scanner teclado = new Scanner(System.in);

		// que entra a mi app ?
		System.out.println("Ingrese por favor la cantidad de horas que trabajo esta semana");
		hsTrabajadas = teclado.nextInt();

		// que procesa la app ?
		if (hsTrabajadas > hsBase) {
			hsExtras = hsTrabajadas - hsBase;
			salarioSemanal = hsExtras * precioHsExtra + hsBase * precionHsBase;
		} else {
			salarioSemanal = hsTrabajadas * precionHsBase;
		}

		// que sale de mi app ?
		System.out.println("su salario semanal sera de : " + salarioSemanal + " pesos");
		System.out.println("Horas extras Trabajadas : " + hsExtras);
		
		teclado.close();
		
	}

}
