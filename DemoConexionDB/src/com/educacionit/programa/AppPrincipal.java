package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDao;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

		System.out.println("Inicio de la app");
		int opcionIngresada = 0;
		do {
			opcionIngresada = Integer.parseInt(JOptionPane.showInputDialog(
					"Ingrese la opcion : \n 1) crear persona \n 2) buscar persona \n 3) modificar persona \n 4) borrar persona"));

		} while (opcionIngresada < 1 || opcionIngresada > 4);

		switch (opcionIngresada) {
		case 1:
			opcionInsertarPersona();
			break;
		case 2:
			opcionBuscarPersona();
			break;
		case 3:
			opcionModificarPersona();
			break;
		case 4:
			opcionBorrarPersona();
			break;
		}

		System.out.println("fin de la app");
	}

	public static void opcionInsertarPersona() {
		// insertamos un nuevo registro en la base de datos a traves de nuestro DAO
		PersonaDao pdao = new PersonaDao();
		PersonaVO personaVO = new PersonaVO();
		// solicitamos los datos al usuario para cargar el VO
		personaVO.setNombrePersona(JOptionPane.showInputDialog("Ingrese el Nombre de la persona"));
		personaVO.setEdadPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la persona")));
		personaVO.setProfesionPersona(JOptionPane.showInputDialog("Ingrese la Profesion de la persona"));
		personaVO.setTelefonoPersona(JOptionPane.showInputDialog("Ingrese el Telefono de la persona"));

		System.out.println(personaVO.toString());

		pdao.registrarPersona(personaVO);
	}

	public static void opcionBuscarPersona() {
		// insertamos un nuevo registro en la base de datos a traves de nuestro DAO
		PersonaDao pdao = new PersonaDao();

		// solicitamos el id al usuario para buscar en la tabla de la DB
		PersonaVO personaVO = pdao
				.buscarPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona a buscar")));

		if (personaVO != null) {
			JOptionPane.showMessageDialog(null, "persona encontrada : " + personaVO.toString());
		} else {
			JOptionPane.showMessageDialog(null, "persona NO encontrada : ");
		}

	}

	public static void opcionModificarPersona() {
		// insertamos un nuevo registro en la base de datos a traves de nuestro DAO
		PersonaDao pdao = new PersonaDao();

		// solicitamos al usuario todos los datos para actualizar el registroi en la
		// tabla de la DB
		PersonaVO personaVO = new PersonaVO();
		// solicitamos los datos al usuario para cargar el VO

		personaVO.setNombrePersona(JOptionPane.showInputDialog("Ingrese el Nombre de la persona"));
		personaVO.setEdadPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la persona")));
		personaVO.setProfesionPersona(JOptionPane.showInputDialog("Ingrese la Profesion de la persona"));
		personaVO.setTelefonoPersona(JOptionPane.showInputDialog("Ingrese el Telefono de la persona"));
		// solicitamos el id al usuario para buscar en la tabla de la DB
		personaVO.setIdPersona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona a buscar")));

		pdao.modificarPersona(personaVO);

	}

	public static void opcionBorrarPersona() {
		// borrarmos un nuevo registro en la base de datos a traves de su id
		PersonaDao pdao = new PersonaDao();

		// solicitamos el id al usuario para buscar en la tabla de la DB
		pdao.eliminarPersona(JOptionPane.showInputDialog("Ingrese el id de la persona a borrar"));

	}
}
