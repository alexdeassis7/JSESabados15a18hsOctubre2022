package com.educacionit.modelos;

public class Masajista extends SeleccionFutbol {

	// atributos propios de la clase hija
	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override //esto es recomendable , pero no obligatorio
	//esta anotation sirve para indicar en el codgio que estamos "re-escribiendo o especializando un método que se encuentra 
	//en la clase padre y que queremos redefinir o definir su comportamiento en la clase hija @table"
	public void entrenamiento() {
		System.out.println("Da asistencia en el entrenamiento (Clase masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje (Clase masajista)");
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
