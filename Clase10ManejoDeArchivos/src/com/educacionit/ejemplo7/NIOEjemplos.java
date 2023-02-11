package com.educacionit.ejemplo7;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JOptionPane;

public class NIOEjemplos {

	public static void main(String[] args) {
		// utilizamos JAVA NIO

//		String nombreDelDirectorio = JOptionPane.showInputDialog("Ingrese el nombre del directorio que desea crear");

		// crearDirectorio(nombreDelDirectorio);
		// copyFile();

		// moverArchivo();
		borrarArchivo();
	}

	private static void borrarArchivo() {
		Path archivoABorrar = Paths.get("login-move.properties");

		try {
			Files.delete(archivoABorrar);
			System.out.println("Se Borro el archivo exitosamente");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

	private static void moverArchivo() {
		Path archivoOrigen = Paths.get("datos/login.properties");
		Path rutaDestino = Paths.get("login-move.properties");

		try {
			Files.move(archivoOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Se movio correctamente el archivo");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

	private static void copyFile() {
		Path origenArchivo = Paths.get("datos/login.properties");
		Path destinoArchivo = Paths.get("login-copia.properties");

		try {

			Files.copy(origenArchivo, destinoArchivo);
			System.out.println("se copio el archivo Correctamente");

		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}

	private static void crearDirectorio(String nombreDelDirectorio) {
		Path path = Paths.get(nombreDelDirectorio);

		try {
			Path nuevoDirectorio = Files.createDirectory(path);
			System.out.println("se creo el directorio " + path.getFileName() + " exitosamente!s");

		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}
}
