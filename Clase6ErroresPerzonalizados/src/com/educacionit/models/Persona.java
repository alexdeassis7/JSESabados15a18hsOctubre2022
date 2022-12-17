package com.educacionit.models;

import com.educacionit.errores.perzonalizados.MiPropiaException;

public class Persona {

	private int id;
	private String nombre;

	public Persona() {
	}

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public void metodoQuePuedeGenerarUnError(boolean lanzarError) throws Exception {
		if (lanzarError) {

			// aqui deberiamos generar la Exception
			throw new MiPropiaException("enviaste true al metodo !");

		} else {
			System.out
					.println("el metodo se logro ejecutar satisfactoriamente , ya que no se genero ninguna exception");
		}
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
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

}
