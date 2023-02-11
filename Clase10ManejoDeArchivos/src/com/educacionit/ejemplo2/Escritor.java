package com.educacionit.ejemplo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

//Escribimos un Archivo Caracter a Caracter
public class Escritor {

	public static void main(String[] args) throws IOException {

		File outputFile = new File("archivoES" + File.separator + "salida" + File.separator + "destino.txt");

		// FileWriter > es una clase concreta utilizada para crear un streams y escribir
		// un archivo
		FileWriter out = new FileWriter(outputFile, true);

		String info = JOptionPane.showInputDialog("Escribi la info que desea guardar en el archivo : destino.txt");

		// recorremos nuestro String como si fuera un arrays de charts
		for (int i = 0; i < info.length(); i++) {
			// escribimos en el archivo >>> destino.txt
			out.write(info.charAt(i));
		}

		// cierro el streams
		out.close();
		System.out.println("El Archivo fue escrito correctamente");
	}

}
