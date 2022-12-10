package com.educacionit.exceptions;

public class DemoAnidados {

	public static void main(String[] args) {
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		System.out.println("********************* Try catch anidados ********************");

		try {// try externo
				// podemos utilizar un try externo para detectar errores mas graves
				// permitiendo que los bloques try internos manejen los errores menos serios
			for (int i = 0; i < nums.length; i++) {
				try { // try interno

					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);

				} catch (ArithmeticException e) {
					// capturamos un ArithmeticException en el try interno
					System.out.println("No se puede dividir por Cero , pero seguimos  ejecutando la app ");
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// capturamos la Exception en el try externo
			System.out.println("error grave , no tiene sentido seguir ejecutando el for , ");
			System.out.println("Indice inexistente! , finalizamos la app ");
		} finally {
			System.out.println("Fin de la app");
		}

	}

}
