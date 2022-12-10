package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.abstracciones.SeleccionFutbol;
//mediante el asterisco importamos todas las clase del package
import com.educacionit.modelos.*;

public class AppPrincipal {

	/// creamos un ArraysList de objetos SeleccionFutbol . Independientemente de la
	/// clase hija a al que pertenezca el objeto

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		// creamos un objeto de cada una de las clases del modelo
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del bosque", 58, 26598);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 25, 7, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 40, "Lisenciado en Cosas", 15);

		// agregamos todos los objetos a nuestro ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("-----------------------------------------------------Todos los integrantes comienzan una concentracion. (Todos ejecutan el mimso metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("-----------------------------------------------------Todos los integrantes viajaron para jugar el mundial . (Todos ejecutan el mimso metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out
				.println("-----------------------------------------------------Todos los integrantes tienen su determinada funcion en el entrenamiento. (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.entrenar();
		}

		// PARTIDO FUTBOL
		System.out.println("-----------------------------------------------------Todos los integrantes tienen su deternminada funcion en el partido . (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.jugarPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println("-----------------------------------------------------Solo el entrenador tiene el metodo para planificar un entrenamiento ");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
		((Entrenador) delBosque).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("-----------------------------------------------------Solo el futbolista tiene el metodo para dar un entrevista de prensa");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
		((Futbolista) iniesta).entrevista();

		// MASAJE
		System.out.println("-----------------------------------------------------Solo el masajista tiene el metodo para darun masaje ");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " -> ");
		((Masajista) raulMartinez).darMasaje();

	}

}
