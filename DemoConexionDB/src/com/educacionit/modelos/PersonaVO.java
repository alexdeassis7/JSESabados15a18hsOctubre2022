package com.educacionit.modelos;

/*Al utilizar este tipo de clases aplicamos el patron "Value Object" anteriormente 
conocido como DTO (Data Transfer Object) en el que representamos las entidades (tablas de la DB),
la tabla tiene los campos id, nombre, edad, profesion , telefono y entonces nuestra clase 
tendra estos mismo atributos y de esta manera podremos trasnportar un objeto "PersonaVO" con todos sus 
valores.
Este patron nos facilita enormemente el trasporte de la informacion , evitando que se envien una gran 
cantidad de parametros a un metodo cuando queremos hacer un INSERT o un UPDATE en la DB */

public class PersonaVO {

	private int idPersona;
	private String nombrePersona;
	private int edadPersona;
	private String profesionPersona;
	private String telefonoPersona;

	public PersonaVO() {
	}

	public PersonaVO(int idPersona, String nombrePersona, int edadPersona, String profesionPersona,
			String telefonoPersona) {
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public String getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	@Override
	public String toString() {
		return "PersonaVO [idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", edadPersona=" + edadPersona
				+ ", profesionPersona=" + profesionPersona + ", telefonoPersona=" + telefonoPersona + "]";
	}

}
