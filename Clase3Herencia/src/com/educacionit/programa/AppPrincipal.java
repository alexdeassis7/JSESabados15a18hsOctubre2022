package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.modelo.Entrenador;
import com.educacionit.modelo.Futbolista;
import com.educacionit.modelo.Masajista;
import com.educacionit.modelo.SeleccionFutbol;

public class AppPrincipal {

	// ArrayList de objetos SeleccionFutbol , Idependientemente de la clase hija a
	// la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	public static ArrayList<Futbolista> jugadores = new ArrayList<Futbolista>();

	public static void main(String[] args) {

		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 59, "45ER123");
		Entrenador delBosque2 = new Entrenador(1, "Vicente", "Del Bosque", 59, "45ER123");
		Futbolista iniesta = new Futbolista(2, "Andres1", "Iniesta", 28, 6, "Interior Derecho");
		Futbolista iniesta2 = new Futbolista(2, "Andres2", "Iniesta", 28, 6, "Interior Derecho");
		Futbolista iniesta3 = new Futbolista(2, "Andres3", "Iniesta", 28, 6, "Interior Derecho");
		Futbolista iniesta4 = new Futbolista(2, "Andres4", "Iniesta", 28, 6, "Interior Derecho");
		
		jugadores.add(iniesta);
		jugadores.add(iniesta2);
		jugadores.add(iniesta3);
		jugadores.add(iniesta4);
		
		for (Futbolista jugador : jugadores) {
			System.out.println(jugador.getNombre());
			jugador.jugarPartido();
		}
		
		
		
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 42, "Licenciado en Fisioterapia", 18);

		// agregamos los obejtos hijos de la clase SeleccionFutbol al array list
		// integrantes

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println(
				"----------------------------Todos los integrantes comienzan una concentracion . (Todos ejecutan el mimso metodo)");
		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.print(integranteAux.getNombre() + " " + integranteAux.getApellido() + " -> ");
			integranteAux.concentrarse();
		}

		// VIAJE
		System.out.println(
				"----------------------------Todos los integrantes Viajan a jugar un partido . (Todos ejecutan el mimso metodo)");
		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.print(integranteAux.getNombre() + " " + integranteAux.getApellido() + " -> ");
			integranteAux.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("********************************Entrenamiento : solamente el entrenador y el futbolista tiene metodos para entrenar ");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirEntrenamiento();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.entrenar();

		// MASAJE
		System.out.println("********************************Masaje  : solamente el masajista  tiene metodo para dar masajes ");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido());
		raulMartinez.darMasaje();

		// PARTIDO FUTBOL
		System.out.println(
				"********************************Partido de Futbol : Solamente el entrenado y el futbolista tienen metodos para el partido de futbol ");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.jugarPartido();
		
		

	}

}
