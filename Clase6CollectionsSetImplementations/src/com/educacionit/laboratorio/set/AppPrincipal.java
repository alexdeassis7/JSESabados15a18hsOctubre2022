package com.educacionit.laboratorio.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {

		// --------------------------------- hashSet---------------------------
		final Set hashset = new HashSet(1_000_000); // creo un hashSet
		// tomamos la hora del sistema previo a la insercion
		final Long startHashSetTime = System.currentTimeMillis();
		// agregamos un millon de elemento al hashSet
		for (int i = 0; i < 1_000_000; i++) {
			hashset.add(i);
		}
		// tomamos la hora del sistema post a la insercion
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by hashSet : " + (endHashSetTime - startHashSetTime));

		// --------------------------------- TreeSet ---------------------------
		final Set treeSet = new TreeSet(); // creo un TreeSet
		// tomamos la hora del sistema previo a la insercion
		final Long startTreeSetTime = System.currentTimeMillis();
		// agregamos un millon de elemento al hashSet
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		// tomamos la hora del sistema post a la insercion
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by treeSet : " + (endTreeSetTime - startTreeSetTime));

		// --------------------------------- LinkedHashSet---------------------------
		final Set linkedHashSet = new LinkedHashSet(1_000_000); // creo un LinkedHashSet
		// tomamos la hora del sistema previo a la insercion
		final Long startLinkedHashTime = System.currentTimeMillis();
		// agregamos un millon de elemento al hashSet
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		// tomamos la hora del sistema post a la insercion
		final Long endLinkedHashTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet : " + (endLinkedHashTime - startLinkedHashTime));

	}

}
