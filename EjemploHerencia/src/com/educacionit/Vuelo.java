package com.educacionit;

import java.util.Iterator;

public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// inicializador de bloque
	{
		// este bloque de codigo se ejecutara antes de cualquiera de los constructores
		// habilita todas las butacas del avion
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
		}
	}

	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public int getAsiento() {
		return 150;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println("se subio al pasajero al avion ");
		} else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		// valido el numero de pasajero sea menor a los asientos
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("YA NO QUEDAN ASIENTOS DISPONIBLES , busquese otra aerolinea");
	}

}
