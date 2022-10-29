package com.educacionit;

public class AppEjercicioForAnidados {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital , imprimiendo la hs , min y seg
		// desde las 0:0:0 hasta las 23:59:59

		for (int hs = 0; hs <= 23; hs++) {
			for (int min = 0; min <= 59; min++) {
				for (int seg = 0; seg <= 59; seg++) {
					System.out.println(hs + ":" + min + ":" + seg);
				}
			}
		}

	}

}
