package com.educacionit.modelos;

import com.educacionit.abstracciones.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {

	private int idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	// metodo propio de la clase hija Entrenador
	public void planificarEntrenamiento() {
		System.out.println("Planifica Un entrenamiento (Clase hija Entrenador )");
	}

	// redefinimos o especializamos el metodo entrenar()
	@Override
	public void entrenar() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}

	// redefinimos o especializamos el metodo jugarPartido()
	@Override
	public void jugarPartido() {
		System.out.println("Dirige un Partido de Futbol(Clase Entrenador)");
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

}
