package com.educacionit.exceptions;

public class DemoMain {

	public static int numerador = 10;
	public static Integer denomimnador;
	public static float division;

	public static void main(String[] args) {

		System.out.println("Inicio de la App");

		System.out.println("antes de la Division");

		try {

			// Instruccion propensa a lanzar una Exception
			division = numerador / denomimnador;

		} catch (ArithmeticException e) {
			// instrucciones a ejecutar cuando se produce una Exception
			division = 0;
			// hacemos uso de los metodos para obtener informacion del error que sucedio
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			e.getCause();

		} catch (NullPointerException ex) {
			// si la exception es de un puntero nulo le damos valor '1' al atributo division
			division = 1;
			System.out.println("Error: " + ex.getMessage());

		} catch (Exception e) {
			System.out.println("Sucedio una exception que no es ArithmeticException y tampoco NullPointerException");
		} finally {
			// instrucciones a ejecutar tanto si sucede o no una exception
			System.out.println("Resultado de la Division : " + division);
			System.out.println("despues de hacer toda la division ");
		}

		System.out.println("Fin de la App");
	}

}
