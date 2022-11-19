package com.educacionit.programa;


public class Persona {
	//atributo estatico: pertenece a la CLASE y no a las intancias !,
	//no hace falta crear objeto para acceder al atributo "contadorDeObjetosPersonaCreados"
	//se inicializa en cero una sola vez cuando la clase es cargada (al inicio de la app)
	private static int contadorDeObjetosPersonaCreados ;
	
	private String documento;
	private String nombre;
	private String apellido;
  
	public Persona(String documento, String nombre, String apellido) {
		contadorDeObjetosPersonaCreados++;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona() {
		contadorDeObjetosPersonaCreados++;
	}

	public Persona(String nombre, String apellido) {
		contadorDeObjetosPersonaCreados++;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	//a todo atributo statico se puede acceder unicamente a traves de metodos staticos 
	
	public static int getContadorDeObjetosPersonaCreados() {
		return contadorDeObjetosPersonaCreados;
	}

	@Override
	public String toString() {
		return "Persona [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
