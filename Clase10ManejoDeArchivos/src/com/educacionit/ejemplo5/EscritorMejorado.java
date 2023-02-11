package com.educacionit.ejemplo5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class EscritorMejorado {

	public static void main(String[] args) throws Exception {

		// si el archivo no existe y tenemos permiso de escritura en el directorio en
		// cuestion
		// se no s creara un archivo nuevo

		File outputFile = new File(
				"archivoES" + File.separator + "salida" + File.separator + "bufferedWriterOutput.txt");

		String linea1 = "soy la primer linea";
		String linea2 = "soy la segunda linea";
		String linea3 = "soy la tercer linea";

		BufferedWriter writerMejorado = new BufferedWriter(new FileWriter(outputFile));

		System.out.println("Se escribiran 3 lineas en el archivo " + outputFile.getName());
		// escribimos el archivo a traves del Buffered Writer
		writerMejorado.write(linea1, 0, linea1.length());

		// creo una linea en blanco
		writerMejorado.newLine();

		// escribimos el archivo a traves del Buffered Writer
		writerMejorado.write(linea2, 0, linea2.length());

		// creo una linea en blanco
		writerMejorado.newLine();

		// escribimos el archivo a traves del Buffered Writer
		writerMejorado.write(linea3, 0, linea3.length());

		// creo una linea en blanco
		writerMejorado.newLine();

		// liberamos recursos
		writerMejorado.close();

		System.out.println("Se escribio las 3 lineas en el archivo " + outputFile.getName());

	}

}
