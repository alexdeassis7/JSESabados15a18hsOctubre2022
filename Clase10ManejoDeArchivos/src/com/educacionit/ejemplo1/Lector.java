package com.educacionit.ejemplo1;

import java.io.File; //libreria io :"input - output"
import java.io.FileReader;
import java.io.IOException;

//Leemos un File caracter a caracter
public class Lector {

	public static void main(String[] args) throws IOException {

		// Path windows:
		// C:\Users\alex\Documents\EsSabadoArrancaElFinde
		// Path Linux :
		// /dev/bin/lala

		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");
		System.out.println("levantando archivo desde el siguiente path :");
		System.out.println("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");

		// FileReader : genera Streams orientados a caracteres y se encarga de leer el
		// archivo
		FileReader in = new FileReader(inputFile);

		// Declaro la variable que contendra el caracter leido del archivo "fuente.txt"
		int unCaracter;

		while ((unCaracter = in.read()) != -1) {
			System.out.print((char) unCaracter);
		}
		System.out.println();

		// cerramos el archivo para liberar el recurso
		in.close();

		System.out.println("Fin de la Lectura de nuestro primer archivo");
	}

}
