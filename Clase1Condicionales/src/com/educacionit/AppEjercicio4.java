package com.educacionit;
//Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades 

import java.util.Scanner;

//si este se le asigna como un porcentaje de su salario mensual que depende de su antig�edad 
//en la empresa de acuerdo con la siguiente tabla
//
//				Tiempo							   Utilidad
//		Menos de 1 a�o					        5%  del salario
//		1 a�o o m�s y menos de 2 a�os 	        7%  del salario
//		2 a�os o m�s y menos de 5 a�os	        10% del salario
//		5 a�os o m�s y menos de 10 a�os	        15% del salario
//		10 a�os o mas 					        20% del salario

public class AppEjercicio4 {

	public static void main(String[] args) {
		// variables de trabajos
		Scanner teclado = new Scanner(System.in);
		float salarioMensual = 0, antiguedad = 0, utilidad = 0;

		// que entra a mi app ?
		System.out.println("Ingrese por favor su antiguedad en la empresa");
		antiguedad = teclado.nextFloat();

		System.out.println("Ingrese por favor su salario en la empresa");
		salarioMensual = teclado.nextFloat();

		// que procesa mi app ?
		if (antiguedad < 1) {// Menos de 1 a�o, 5% del salario
			utilidad = salarioMensual * 0.05f;
		} else if (antiguedad >= 1 && antiguedad < 2) {// 1 a�o o m�s y menos de 2 a�os, 7% del salario
			utilidad = salarioMensual * 0.07f;
		} else if (antiguedad >= 2 && antiguedad < 5) {
			utilidad = salarioMensual * 0.10f;
		} else if (antiguedad >= 5 && antiguedad < 10) {
			utilidad = salarioMensual * 0.15f;
		} else {
			utilidad = salarioMensual * 0.20f;
		}

		// que sale de mi app ?
		System.out.println("su utilidad anual sera de " + utilidad + " pesos ");

		teclado.close();
	}

}
