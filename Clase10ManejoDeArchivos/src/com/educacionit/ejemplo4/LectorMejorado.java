package com.educacionit.ejemplo4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorMejorado {

	public static void main(String[] args) throws Exception {

		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");

		BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));

		boolean eof = false;

		String lineaLeida = "";

		while (!eof) {
			lineaLeida = readerMejorado.readLine();// leo una linea completa del archivo
			if (lineaLeida != null) {
				System.out.println(lineaLeida);
			} else {
				eof = true;
			}
		}

		readerMejorado.close();// libero recursos
	}

}
