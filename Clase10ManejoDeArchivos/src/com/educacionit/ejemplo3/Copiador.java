package com.educacionit.ejemplo3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Copiador {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");

		File outputFile = new File("archivoES" + File.separator + "salida" + File.separator + "destino.txt");

		/* Metodos Utiles para el manejo de archivos: */
		System.out.println("Existe el archivo :" + inputFile.getName() + " ?" + inputFile.exists());
		System.out.println("Ruta del archivo :" + inputFile.getName() + " es: " + inputFile.getAbsolutePath());
		System.out.println("tamaño del archivo : " + inputFile.length() + " bytes");
		System.out.println(
				"fecha de modificacion del archivo :" + inputFile.lastModified() + new Date(inputFile.lastModified()));

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile, true);
		int unCaracter;

		System.out.println("El archivo Se esta copiando");

		while ((unCaracter = in.read()) != -1)
			out.write(unCaracter);

//		liberamos los recursos
		in.close();
		out.close();

		System.out.println("se copio exitosamente el archivo " + inputFile.getName() + " en " + outputFile.getName());
	}

}
