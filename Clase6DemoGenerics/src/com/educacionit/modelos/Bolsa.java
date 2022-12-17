package com.educacionit.modelos;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.excepciones.BolsaCompletaException;

//Bolsa : Clase No Gemerica
//implemento la interface "iterable" para que la bolsa sea un elemento "Recorrible" y
//asi podamos hacer uso del "for each"
public class Bolsa implements Iterable {

	private ArrayList lista = new ArrayList();
	private int tope;

	// metodo que me permite instanciar una bolsa definiendo el tope de la misma
	public Bolsa(int tope) {
		this.tope = tope;
	}

	// metodo que permite agregar objetos a una bolsa siempre y cuando la bolsa no
	// este llena
	public void add(Object objeto) throws BolsaCompletaException {
		if (lista.size() < tope) { // chequeamos que la bolsa no este llena
			lista.add(objeto);// agregamos el objeto a la bolsa
			System.out.println("Se agrego satisfactoriamente el objeto a la bolsa ");
		} else {
			// lanzamos una exception
			throw new BolsaCompletaException("Cosas ");
		}
	}

	@Override
	public Iterator iterator() {
		// implementamos este metodo para que nuestro for each pueda iterar los datos
		return lista.iterator();
	}

	// metodo que me retorna la cantidad de elementos de la bolsa
	public int cantidadDeElementosDentroDeLaBolsa() {
		return lista.size();
	}

}
