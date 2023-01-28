package com.educacionit.clase8;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import javax.swing.JOptionPane;

public class AppPrincipalDos {

	public static void main(String[] args) {
		// Creamos una cola indicando el tipo de dato generico como "Integer"
		Queue<Integer> cola1 = new LinkedList<>();

		// insetamos datos en la cola
		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		cola1.add(76);
		cola1.add(126);
		cola1.add(34);

		// imprimimos la cola
		System.out.println("Cola: " + cola1);

		System.out.println(" proximo elemento a desencolar: " + cola1.peek());

		// imprimimos la cola
		System.out.println("Cola: " + cola1);

		// utilizamos una extructura repetitiva whie para desencolar
		while (cola1.poll() != null) {
			System.out.println(cola1);
		}

		// imprimimos la cola
		System.out.println("Cola: " + cola1);
		
		//ahora creamos una cola con elemento de diferentes tipos 
		LinkedList colaMixta = new LinkedList();
		
		colaMixta.offer(3);
		colaMixta.add(14.7);
		colaMixta.offer(12);
		colaMixta.add(7);
		colaMixta.offer(10);
		colaMixta.add(10.5);
		colaMixta.offer(3);
		colaMixta.add("gustavo");
		colaMixta.offer("pepe");
		
		// imprimimos la cola mixta
		System.out.println("cola mixta: " + colaMixta);
		
		//creamos otra cola 
		
		Queue queue2 = new LinkedList();
		
		try {
			queue2.remove();				
		}catch (NoSuchElementException e) {
			System.out.println("No se  puede extraer elemetos de una cola que esta VACIA ");
			JOptionPane.showMessageDialog(null, "ya no quedan mas personas en el banco , termina tu jornada");
		}
		
		System.out.println("fin app");
	}

}
