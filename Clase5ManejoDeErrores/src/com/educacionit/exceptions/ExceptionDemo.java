package com.educacionit.exceptions;

public class ExceptionDemo {
//Las subClases deben SI o SI preceder a la superclase en las declaraciones de los catch 
	public static void main(String[] args) {
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < nums.length; i++) {
			
			try {
				System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// capturamos la Exception de la subclase
				System.out.println("No se encontro ningun elemento para dividir en la lista de denominadores");
				System.out.println("Indice inexistente! " + e.getMessage());
			} catch (Throwable e) {
				// Capturanmos una Exception de la superclase
				System.out.println("Alguna Exception Ocurrio");
				System.out.println(e.getMessage());
			}

		}
	}

}
