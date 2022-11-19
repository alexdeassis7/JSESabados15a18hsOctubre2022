package com.educacionit.modelos;

//-si una clase posee un metodo abstracto esta obligada a ser abstracta, pero 
//una clase abstracta no esta obligada a tener metodos abtractos 
//- una clase abstracta NO SE PUEDE INSTANCIAR  por lo tanto nunca podremos hacer 
// un "new SeleccionFutbol()" 
public abstract class SeleccionFutbol {

	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

	public SeleccionFutbol() {
	}

	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public void viajar() {
		System.out.println("viajar (clase padre abstracta)");
	}

	public void concentrarse() {
		System.out.println("concentrarse (clase padre abstracta)");
	}

	// IMPORTANTE -> Un metodo abstracto => No se implementa en la clase abstracta
	// pero si OBLIGATORIAMENTE en las clases hijas concretas!
	public abstract void entrenamiento();

	public void partidoFutbol() {
		System.out.println("partidoFutbol (clase padre abstracta)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}
