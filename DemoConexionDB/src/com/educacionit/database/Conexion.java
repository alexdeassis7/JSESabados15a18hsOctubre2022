package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	// nombre de la base
	static String db = "alumnos";
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
			System.out.println("ocurrio un error al intentar conecta con la base " + db);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("te olvidaste de agregar el driver o escribiste mal el package o la clase");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ocurrio un error inesperado");
		}

		System.out.println("fin del metodo constructor");

	}

	public static void main(String[] args) {
		Conexion connMySql = new Conexion();
	}
}
