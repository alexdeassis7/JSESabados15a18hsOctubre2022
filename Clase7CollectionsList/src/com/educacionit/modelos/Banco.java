package com.educacionit.modelos;

import java.util.ArrayList;

public class Banco {

	public ArrayList<Persona> fila = new ArrayList();

	public int cuantasPersonasHay() {
		return fila.size();
	}

	public void agregarPersona(Persona persona) {

		if (!fila.contains(persona)) { // chequeamos si la lista ya no posee un objeto persona con este dni
			// si no existe ninguna persona con ese dni en la fila la agregamos
			fila.add(persona);
			System.out.println("La persona con DNI: " + persona.getDni() + " se agrego a la fila del banco");
		} else {
			System.out.println("La persona con DNI: " + persona.getDni() + " Ya se encuentra en la fila del banco");
		}
	}

	public void eliminarPersonaDeFila(Persona persona) {
		if (fila.contains(persona)) {// chequeamos si la persona esta dentro de la fila
			fila.remove(persona);
			System.out.println("Se Removio de la fila a " + persona.getNombre());
		}else {
			System.out.println("NO Se Removio de la fila a " + persona.getNombre() + " por que no existe");
		}
	}

	public void mostrarFila() {
		System.out.println("Mostramos la fila completa del banco");
		for (Persona personaAux : fila) {
			System.out.println(personaAux.toString());
		}
	}
}
