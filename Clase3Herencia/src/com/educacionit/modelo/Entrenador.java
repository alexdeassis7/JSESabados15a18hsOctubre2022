package com.educacionit.modelo;

public class Entrenador extends SeleccionFutbol{

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad); //lamo al constructor de la clase padre 
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("clase Hija entrenador Metodo : dirigirPartido()");
	}

	public void dirigirEntrenamiento() {
		System.out.println("clase Hija entrenador Metodo : dirigirEntrenamiento()");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

}
