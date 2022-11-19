package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;
import com.educacionit.modelos.SeleccionFutbol;

public class AppPrincipal {

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		// No se puede crear un objeto de la clase abstracta
//		SeleccionFutbol casillas = new SeleccionFutbol() ; //no se puede!!!

		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del bosque", 59, 29568);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 28, 5, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "martinez", 40, "Lisenciado en Fisioterapia", 12);

		// agregamos los elementos hijos de la clase seleccion futbol al ArrayList
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("**********************Todos los integrantes comienzan una concentracion (Todos ejecutan el mismo metodo )");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}
		
		//VIAJE 
		System.out.println("**********************Todos los integrantes viajan para jugar un partido.(Todos ejecutan el mismo metodo )");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();			
		}
		
		
		//ENTRANAMIENTO
		System.out.println("**********************Todos los integrantes tienen su funcion en un entrenamiento.(Especialización)");
		for(SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();		
		}
		
		//PARTIDO FUTBOL
		System.out.println("**********************Todos los integrantes tienen su funcion en un partido de futbol.(Especialización)");
		for(SeleccionFutbol integrante: integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();		
		}
		
		//por ultimo vamos a ver que cada uno de los objetos puede ejecutar metodos propios que 
		//solamente ellos los tienen 
		
		//PLANIFICAR ENTRANAMIENTO
		System.out.println("**********************Planificar entrenamiento : Solo el entrenador tiene el metodo para planificar un entrenamiento");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		((Entrenador)delBosque).planificarEntrenamiento();
		
		
		//ENTREVISTA 
		System.out.println("**********************Entrevista: Solo el Futbolista tiene el metodo para dar una entrevista");
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
		((Futbolista)iniesta).entrevista();
		
		
		//MASAJE
		System.out.println("**********************Masaje: Solo el Masajista tiene el metodo para poder realizar un masaje");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
		((Masajista)raulMartinez).darMasaje();
		
	}
}
