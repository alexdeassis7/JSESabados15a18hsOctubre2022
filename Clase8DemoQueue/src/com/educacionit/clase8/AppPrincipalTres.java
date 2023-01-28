package com.educacionit.clase8;

import java.util.PriorityQueue;

public class AppPrincipalTres {

	public static void main(String[] args) {
		// Demo PriorityQueue: es una variante de una cola clasica que la implementa
		// la clase PriorityQueue
		// esto permite que cuando se agregan elementos a la cola se organicen segun su
		// valor, por ejemplo :
		// si es un numero se oganizaran de menor a mayor

		// ejemplo de como se organizan los valores en una cola con prioridad

		// creamos un objeto de la clase PriorityQueue que alamacena objetos Integer
		PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
		// cargamos 6 objetos en la cola de prioridad

		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		cola1.add(76);
		cola1.add(126);
		cola1.add(34);

		System.out.println("Imprimimos la cola : ");

		// mediante un while comenzamos a recuperar los elementos de la cola con
		// prioridad
		// y podemos comprobar que se guardan los datos en la cola en un orden pero no
		// en un orden de insercion
		while (!cola1.isEmpty())
			System.out.print(cola1.poll() + " - ");

		System.out.println("Fin App");
	}

}
