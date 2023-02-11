package com.educacionit.ejemplo8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsoDeFileProperties {

	public static void main(String[] args) {
		// instanciamos el objeto Properties
		Properties propiedades = new Properties();

		try {
			// cargamos el archivo utilizando la ruta relativa
			propiedades.load(new FileInputStream("src/database.properties"));

			// leemos las propiedades del archivo

			String url = propiedades.getProperty("db.url");
			String usuario = propiedades.getProperty("db.user");
			String pass = propiedades.getProperty("db.pass");
			String driver = propiedades.getProperty("db.driver");

			System.out.println("el driver es : " + driver);
			System.out.println("el url es : " + url);
			System.out.println("el user es : " + usuario);
			System.out.println("el clave es : " + pass);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}

}
