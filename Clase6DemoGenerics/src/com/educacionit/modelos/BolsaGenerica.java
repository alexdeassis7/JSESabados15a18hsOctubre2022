package com.educacionit.modelos;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.excepciones.BolsaCompletaException;

public class BolsaGenerica<T> implements Iterable<T> {

	private ArrayList lista = new ArrayList();
	private int tope;

	public BolsaGenerica(int tope) {
		this.tope = tope;
	}

	public void add(T objeto) throws BolsaCompletaException {
		if (lista.size() < tope) {// chequeamos que la bolsa no este llena
			lista.add(objeto); // agregamos el objeto a la bolsa
			System.out.println("se agrego el objeto a la bolsa");
		} else {
			throw new BolsaCompletaException("Cosas ");
		}
	}

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
}
