package com.educacionit.exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		// como lanzamos una exception?

		try {
			System.out.println("Antes de lanzar la exception");

			// lanzo la exception
			throw new ArithmeticException();

		} catch (ArithmeticException e) {
			// capturamos la exception
			System.out.println("Exception Capturada");
		} finally {
			System.out.println("ejecutamos el finally");
		}
		System.out.println("Fin app");

	}

}
