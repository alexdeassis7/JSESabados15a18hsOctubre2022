package com.educacionit.programa;

import com.educacionit.models.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		// test 
		System.out.println("Inicio la app");

		Persona persona1 = new Persona(78945, "Leandro Castro");
		
		//aqui llamamos al metodo que puede lanzarnos un error 
		try {
			persona1.metodoQuePuedeGenerarUnError(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Fin de la app");
	}

}
