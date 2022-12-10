package com.educacionit.modelos;

import com.educacionit.abstracciones.SeleccionFutbol;

//clase hija de la clase abstracta SeleccionFutbol
public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	// metodo propio de la clase Masajista
	public void darMasaje() {
		System.out.println("Da un masaje (Clase hija masajista)");
	}

	// sobreescribimos el metodo entrenar() de la clase padre abstracta
	@Override
	public void entrenar() {
		System.out.println("Da Asistencia en el entrenamiento (Clase masajista)");
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

}
