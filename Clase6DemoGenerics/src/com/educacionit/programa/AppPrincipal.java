package com.educacionit.programa;

import com.educacionit.excepciones.BolsaCompletaException;
import com.educacionit.modelos.Bolsa;
import com.educacionit.modelos.BolsaGenerica;
import com.educacionit.modelos.Chocolatina;
import com.educacionit.modelos.Golosina;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("inicio de la app");

		// creamos una bolsa
		Bolsa bolsa = new Bolsa(3);

		// creamos chocolates y golosinas para llenar nuestra bolsa
		Chocolatina c = new Chocolatina("Milka");
		Chocolatina c2 = new Chocolatina("Ferrero");
		Chocolatina c3 = new Chocolatina("Cofler");

		Golosina g = new Golosina("Caramelos");
		Golosina g1 = new Golosina("Chicles");

		System.out.println("se comenzo a cargar la bolsa con chocolatinas y golosinas ");
		try {
			// agregamos elementos a la bolsa
			bolsa.add(c);
			bolsa.add(c2);
			bolsa.add(c3);
			bolsa.add(g);
			bolsa.add(g1);
		} catch (BolsaCompletaException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("No se pudieron agregar todos los elemento a la bolsa ");
		}
		System.out.println("se agregaron " + bolsa.cantidadDeElementosDentroDeLaBolsa() + " elemento a la bolsa ");

		// recorremos la bolsa para ver que tiene
		System.out.println("Elementos que contiene la bolsa NO GENERICA :");
		for (Object o : bolsa) {
			if (o instanceof Chocolatina) {// chequeamos que el objeto sea de tipo chocolatina
				Chocolatina chocolatina = (Chocolatina) o; // casteo el "Object" a una chocolatina
				System.out.println(chocolatina.getMarca());
			} else if (o instanceof Golosina) {
				System.out.println(((Golosina) o).getNombre());
			}
		}

		// ------------------------------------------------ trabajamos con la clase
		// GENERICA (BolsaGenerica.java)

		// creamos una bolsaGenerica
		BolsaGenerica<Chocolatina> bolsaGenerica = new BolsaGenerica<Chocolatina>(1);

		Chocolatina go = new Chocolatina("Gomitas Masticables");
		Chocolatina go1 = new Chocolatina("Chupetin");

		try {
			// agregamos elementos a la bolsa Generica, en este caso solo podra se del tipo
			// indicado en el generico a la
			// hora de instanciar el objeto
			bolsaGenerica.add(go);
			bolsaGenerica.add(go1);
		} catch (BolsaCompletaException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Elementos que contiene nuestra bolsa generica: ");
		for (Chocolatina golosinaAux : bolsaGenerica) {
			System.out.println(golosinaAux.getMarca());
		}

		System.out.println("Fin de la app");
	}

}
