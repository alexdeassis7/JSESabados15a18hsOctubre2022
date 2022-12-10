package com.educacionit.exceptions;

import java.util.Iterator;

public class MultiCatch {

	public static void main(String[] args) {
		// el multi Catch nos permite capturar dos o mas exceptions mediante la misma
		// clausula catch

		// hacemos uso del multi catch , esto requiere JDK7 o superior

		int a = 28, b = 0;
		int resultado;
		char chars[] = { 'A', 'B', 'C' };

		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0)
					resultado = a / b; // genero un ArithmeticException
				else
					chars[25] = 'X';// gereno un ArrayIndexOutOfBoundsException
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				e.getCause();
				System.out.println(e.getMessage());
			} finally {
				System.out.println("despues de los multi-catch");
			}
		}
		System.out.println("FIN DE LA APP");
	}

}
