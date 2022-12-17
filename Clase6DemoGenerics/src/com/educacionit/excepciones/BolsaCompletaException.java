package com.educacionit.excepciones;

public class BolsaCompletaException extends Exception {

	String mensaje;

	public BolsaCompletaException(String mensaje_a_mostrar) {
		this.mensaje = mensaje_a_mostrar;
	}

	// redefinimos el metodo getMessage() de la clase padre Exception.java
	@Override
	public String getMessage() {
		return "No caben mas " + mensaje + "en la bolsa ";
	}
}
