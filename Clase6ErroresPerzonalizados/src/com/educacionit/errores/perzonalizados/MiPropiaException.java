package com.educacionit.errores.perzonalizados;

//creamos nuestra propia exception personalizada 
public class MiPropiaException extends Exception {

	String mensaje;

	public MiPropiaException() {
	}

	// creamos un constructor al cual le pasamos el mensaje de error que debera
	// mostrar
	// cuando se imvoque al metodo getMessage() que viene definido en el clase padre
	public MiPropiaException(String mensaje) {
		this.mensaje = mensaje;
	}

	// redefinimos el metodo getMessage()
	@Override
	public String getMessage() {
		String mensajePreDefinido = " => Soy un un mensaje de error customizado por el programador a traves de una sobreescritura del metodo de la clase padre Exception ";

		return (mensaje == null) ? "sucedio un error en la clase " : mensaje + mensajePreDefinido;

	}

}
