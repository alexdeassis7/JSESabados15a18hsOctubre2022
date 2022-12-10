package com.educacionit.modelos;

import com.educacionit.abstracciones.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	// metodo propio de la clase hija Futbolista
	public void entrevista() {
		System.out.println("Da una Entrevista (Clase Futbolista)");

	}

	// modificamos el comportamiento del metodo entrenar() redefiniendolo .
	@Override
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	// modificamos el comportamiento del metodo jugarPartido() redefiniendolo .
	@Override
	public void jugarPartido() {
		System.out.println("Juega un partido (Clase Futbolista)");

	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
