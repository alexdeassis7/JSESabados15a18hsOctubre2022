package com.educacionit.modelo;

public class Masajista extends SeleccionFutbol{

	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellido, edad); //lamo al constructor de la clase padre 
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public void darMasaje() {
		System.out.println("clase Hija Masajista Metodo : darMasaje()");
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
