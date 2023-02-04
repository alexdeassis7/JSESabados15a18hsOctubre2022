package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	// nombre de la base
	static String db = "persona";
	// credenciales para acceder a la base
	static String login = "root"; // usuario que viene por default en mySql
	static String password = ""; // clave que viene por default en mySql
	static String url = "jdbc:mysql://localhost/" + db; // string de conexion

	Connection conn = null;

	public Conexion() {

		try {
			// obtenemos el driver de conexion a la base de datos mySql
			Class.forName("com.mysql.jdbc.Driver");
			// obtenog un objeto del tipo Connection mediante el administrador de conexiones
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null)
				System.out.println("Se logro conectar exitosamente a la base de datos " + db);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ocurrio un error al intentar conectar con la base " + db);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("te olvidaste de agregar el driver o escribiste mal el package o la clase");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ocurrio un error inesperado");
		}

		System.out.println("fin del metodo constructor");

	}

	// metodo que me permite retornar una conexion a cualquier punto del app
	public Connection getConnection() {
		return conn;
	}

	// metodo para desconectar de la base
	public void desconectar() {
		if (conn != null) {
			try {
				conn.close();// se libera el recurso
				System.out.println("se desconecto de la base " + db);
			} catch (SQLException e) {
				System.out.println("No se logro cerrar la conexion a la base de datos " + db);
			}
		} else {
			System.out.println("No se desconecto de la base de datos " + db + "por que no estabas conectado ");
		}
	}

}
