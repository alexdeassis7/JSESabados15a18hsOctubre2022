package com.educacionit.modelos;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
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

	@Override
	public String toString() {
		return "Entrenador [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	@Override
	public void entrenamiento() {
		// IMPLEMENTAMOS EL METODO ABSTRACTO DE LA CLASE PADRE
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");

	}

	//especializacion : redefinir un metodo de la clase padre para  darle otro comportamiento 
	@Override
	public void partidoFutbol() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("da una entrevista (Clase Futbolista)");

	}

}
