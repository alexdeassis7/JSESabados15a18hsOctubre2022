package com.educacionit.ejemplo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamFileRemote {

	public static void main(String[] args) {

		try {
			// construimos un objeto url
			URL url = new URL(
					"https://raw.githubusercontent.com/alexdeassis7/JSESabados15a18hsOctubre2022/main/Clase3Herencia/src/com/educacionit/modelo/Entrenador.java");

			// construimos un Stream contra la url donde voy a leer
			BufferedReader elBufferedReader = new BufferedReader(
					new InputStreamReader(url.openConnection().getInputStream()));

			boolean eof = false;

			String lineaLeida = "";

			while (!eof) {
				lineaLeida = elBufferedReader.readLine();// leo una linea completa del archivo
				if (lineaLeida != null) {
					System.out.println(lineaLeida);
				} else {
					eof = true;
				}
			}

			elBufferedReader.close();// libero recursos

		} catch (MalformedURLException e) {
			System.out.println("la url es invalida " + e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("No se puede leer desde internet " + e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Fin de la lectura remoa de archivos ");
	}

}
