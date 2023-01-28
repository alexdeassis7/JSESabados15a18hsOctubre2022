package com.educacionit.clase8;

import java.util.LinkedList;
import java.util.Queue;

public class AppPrincipal {

	// Las colas en Java no deben utilizarce para almacenar elemntos que sena null ,
//	ya que entonces los métodos poll() y peek() no funcinaran de manera correcta

	public static void main(String[] args) {

		// creamos una cola
		Queue queue = new LinkedList();

		// Usamos el metodo add() para añadir elementos a la cola ,
		// si algo llegara a salir mal se lanzara una exception
		queue.add("item1");
		queue.add("item2");

		// Usamos el metodo Offer() para añadir elementos a la cola ,
		// si algo llegara a salir mal retornara un valor null
		queue.add("item3");
		queue.add("item4");

		System.out.println(queue); // mostramos la cola

		// eliminar el primer elemento de la cola ,
		// si la cola esta vacia genera un NoSuchElementException
		System.out.println("remove() :" + queue.remove());

		System.out.println(queue); // mostramos la cola

		// Observar que elemento esta en el primer puesto de la cola pero
		// sin extraerlo , si la cola esta vacia genera un NoSuchElementException
		System.out.println("element() : " + queue.element());
		System.out.println(queue); // mostramos la cola

		// eliminar el primer elemento de la cola ,
		// si la cola esta vacia solo retorna null
		System.out.println("poll() :" + queue.poll());
		System.out.println(queue); // mostramos la cola

		queue.poll(); // eliminar el primer elemento de la cola
		queue.poll(); // eliminar el primer elemento de la cola

		System.out.println(queue); // mostramos la cola
		System.out.println("poll() :" + queue.poll());

		// Observar que elemento esta en el primer puesto de la cola pero
		// sin extraerlo , si la cola esta vacia solo retorna null
		System.out.println("peek() : " + queue.peek());
		System.out.println(queue); // mostramos la cola
	}

}
