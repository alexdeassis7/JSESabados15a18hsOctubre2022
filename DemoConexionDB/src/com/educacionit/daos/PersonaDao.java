package com.educacionit.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

//CRUD : CREATE ,READ, UPDATE , DELETE 
/*Clase que nos permite el acceso a la base de datos 
Cuando utilizamos este patron llamado Data Access Object basicamente este patron consiste en centralizar 
 * los procesos de acceso a la base de datos evitando inconsistencias y posibles problematicas 
 * cuando esto se realiza  a lo largo de la aplicacion , con este patron independizamos la logica de
 * negocio de la logica de acceso a datos obteniendo mayor organizacion y flexibilidad en nuestros sistemas */
public class PersonaDao {

	// este metodo sera el encargado de insertar in registro persona en la base de
	// datos
	public void registrarPersona(PersonaVO miPersona) {
		System.out.println("INSERT INTO personas ( `nombre` , `edad` , `profesion` ,`telefono`) VALUES ('"
				+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
				+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");

		try {
			Conexion conex = new Conexion();
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO personas (`nombre` , `edad` , `profesion` ,`telefono`) VALUES ('"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");

			JOptionPane.showMessageDialog(null, "SE ah Registrado Exitosamente", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);

			// liberamos recursos
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "NO se Registro", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// este metodo nos permite buscar una persona en la DB a traves de su id
	public PersonaVO buscarPersona(int codigo) {

		PersonaVO personaVo = new PersonaVO();
		boolean existe = false;
		Conexion conex = new Conexion();
		ResultSet res = null;

		try {

			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM personas where id = ?");
			// reemplazo el signo de interrogacion "?" por el valor que tiene el parametro
			// "codigo"
			consulta.setInt(1, codigo);

			res = consulta.executeQuery(); // ejecutamos la consulta en la DB

			while (res.next()) {// recorremos el set de registro/s obtenidos de la ejecucion del SELECT en la DB
								// y los cargamos en un VO
				existe = true;
				// leemos las columnas del registro y lo seteamos dentro del VO
				personaVo.setIdPersona(Integer.parseInt(res.getString("id")));
				personaVo.setNombrePersona(res.getString("nombre"));
				personaVo.setEdadPersona(Integer.parseInt(res.getString("edad")));
				personaVo.setProfesionPersona(res.getString("profesion"));
				personaVo.setTelefonoPersona(res.getString("telefono"));
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Error, al intentar recuperar el dato de la tabla persona con el id " + codigo);
			System.out.println(e.getMessage());
		} finally {
			// liberar recursos
			if (conex != null)
				conex.desconectar();
			if (res != null)
				try {
					res.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		if (existe) {
			return personaVo;
		} else {
			return null;
		}

	}

	// este metodo nos permite modificar una persona en la DB a traves de su id
	public void modificarPersona(PersonaVO miPersona) {

		if (buscarPersona(miPersona.getIdPersona()) != null) { // valido si el id existe en la db
			Conexion conex = new Conexion();
			String consulta = "UPDATE personas SET nombre = ?,edad = ?,  profesion = ? , telefono = ? where id = ? ";

			try {
				PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
				// reemplazamos los 5 "?" por los dcatos que obtenemos del VO que nos vino por
				// parametro
				estatuto.setString(1, miPersona.getNombrePersona());
				estatuto.setInt(2, miPersona.getEdadPersona());
				estatuto.setString(3, miPersona.getProfesionPersona());
				estatuto.setString(4, miPersona.getTelefonoPersona());
				estatuto.setInt(5, miPersona.getIdPersona());

				estatuto.executeUpdate();
				JOptionPane.showMessageDialog(null,
						"Se modifico correctamente a la persona con id = " + miPersona.getIdPersona());
			} catch (SQLException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,
						"Ocurrio un error al modificar la persona con id : " + miPersona.getIdPersona());
			}
		} else {
			JOptionPane.showMessageDialog(null, "no existe la persona con id : " + miPersona.getIdPersona());
		}
	}

	// este metodo sera el encargado de eliminar un registro persona en la base de
	// datos a traves de su id siempre y cuando este id exista
	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();
		try {

			Statement estatuto = conex.getConnection().createStatement();

			if (buscarPersona(Integer.parseInt(codigo)) != null) {
				estatuto.executeUpdate("DELETE FROM personas WHERE id = '" + codigo + "'");
				JOptionPane.showMessageDialog(null, "Se ah borrado Exitosamente el registro con id :" + codigo,
						"Informacion", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "el registro con id :" + codigo + " no existe", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
			}

			// liberamos recursos
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "NO se Borro el Registro ", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
