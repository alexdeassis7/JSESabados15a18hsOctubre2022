package com.educacionit.programas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppPrincipal {
	public static void main(String[] args) {
//		declaracion de un map (HashMap) con clave Integer y valor String
		// las claves pueden ser de cualquier tipo de objetos , aunque los mas
		// utilizados
		// como claves en java son los objetos predefinidos (String , Integer , Float
		// ....etc)
		// OJO no pueden ser primitivos
		Map<Integer, String> nombreMap = new HashMap<Integer, String>();

		// las implementaciones mas utilizadas son:

		// HashMap:
		// los elementos insertados no tienen un orden especifico ,
		// no acepta claves duplicadas ni valores nulos

		// TreeMap:
		// los elementos se ordenan de forma natural , por ejemplo si la clave son
		// enteros los ordena de menor a mayor

		// LinkedHashMap:
		// inserta en el map los elementos en el orden que se agregaron , pero las
		// busquedas en esta
		// implementacion seran menos performantes

		// devuelve el numero de elementos que tiene un map
		System.out.println("size() :" + nombreMap.size());

		// devuelve true si no hay elementos en el map y false si los hay
		System.out.println("isEmpty() :" + nombreMap.isEmpty());

		// añade un elemento en un map
		nombreMap.put(1, "alex");

		// devuelve el valor de la clave que se le pasa como parametros o null si la
		// clave no existe
		System.out.println(nombreMap.get(1));

		// devuelve el numero de elementos que tiene un map
		System.out.println("size() :" + nombreMap.size());

		// borrar todos los elementos del map
		// nombreMap.clear();

		// borrar el par clave/valor de la clave enviada por parametro
		// System.out.println(nombreMap.remove(1));

		// devuelve true si dentro del map hay una clave que coincide con el parametro
		// enviado
		System.out.println(nombreMap.containsKey(1));

		// devuelve true si dentro del map hay un valor que coincide con el parametro
		// enviado
		System.out.println(nombreMap.containsValue("alex"));

		// retorna una collection con los valores del map
		System.out.println(nombreMap.values());

		System.out.println("*********************** HASH MAP **********************");
		Map<Integer, String> map = new HashMap<Integer, String>();
		// insertamos elemento al map
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevila");
		map.put(16, "Busquest");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xavi Alonso");
		map.put(8, "Xavi hernandez");
		map.put(6, "Iniesta");

		// imprimimos el map con un iterator
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave : " + key + " --->>> Valor:" + map.get(key));
		}

		System.out.println("*********************** LINKED HASH MAP **********************");
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// insertamos elemento al map
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(16, "Busquest");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(7, "Villa");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(14, "Xavi Alonso");
		linkedHashMap.put(8, "Xavi hernandez");
		linkedHashMap.put(6, "Iniesta");

		// imprimimos el map con un iterator
		Iterator it2 = linkedHashMap.keySet().iterator();
		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			System.out.println("Clave : " + key + " --->>> Valor:" + linkedHashMap.get(key));
		}

		System.out.println("*********************** TREE MAP **********************");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		// insertamos elemento al map
		treeMap.put(1, "Casillas");
		treeMap.put(3, "Pique");
		treeMap.put(11, "Capdevila");
		treeMap.put(16, "Busquest");
		treeMap.put(18, "Pedrito");
		treeMap.put(7, "Villa");
		treeMap.put(15, "Ramos");
		treeMap.put(5, "Puyol");
		treeMap.put(14, "Xavi Alonso");
		treeMap.put(8, "Xavi hernandez");
		treeMap.put(6, "Iniesta");

		// imprimimos el map con un iterator
		Iterator it3 = treeMap.keySet().iterator();
		while (it3.hasNext()) {
			Integer key = (Integer) it3.next();
			System.out.println("Clave : " + key + " --->>> Valor:" + treeMap.get(key));
		}

	}

}
