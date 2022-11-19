package com.educacionit.programa;
//se pueden a partir de Java 5 hacer import de metodos y atributos staticos y 
//acceder a ellos como si hubieran sido declarados en la propia clase 
import static com.educacionit.programa.Persona.*;

public class AppPrincipal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("36863963", "Alex", "De assis");
		Persona p3 = new Persona( "Herctor", "Galarze");
		Persona p4 = new Persona();
		Persona p5 = new Persona("36863963", "Alex", "De assis");
		Persona p6 = new Persona( "Herctor", "Galarze");

		//acceso a import statico como si fuera declarado en al clase AppPrincipal
		System.out.println(getContadorDeObjetosPersonaCreados());
		
		System.out.println("Persona.contadorDeObjetosPersonaCreados :" + Persona.getContadorDeObjetosPersonaCreados());
		/*p1.getApellido();
		p1.setNombre("pepe");

		// accedemos al atributo static a traves de la clase Persona
		// un atributo statico es compartido por las N instancias de la clase ,por
		//ende puede ser accedido por p1 ,p2 y p3 en este ejemplo
		System.out.println("Persona.contadorDeObjetosPersonaCreados :" + Persona.contadorDeObjetosPersonaCreados);
		System.out.println("p1.contadorDeObjetosPersonaCreados :" + p1.contadorDeObjetosPersonaCreados);
		System.out.println("p2.contadorDeObjetosPersonaCreados :" + p2.contadorDeObjetosPersonaCreados);
		System.out.println("p3.contadorDeObjetosPersonaCreados :" + p3.contadorDeObjetosPersonaCreados);

		//modificamos el atributo statico "contadorDeObjetosPersonaCreados"
		Persona.contadorDeObjetosPersonaCreados = 1; //accedo a traves de la clase 
		System.out.println("Persona.contadorDeObjetosPersonaCreados :" + Persona.contadorDeObjetosPersonaCreados);
		System.out.println("p1.contadorDeObjetosPersonaCreados :" + p1.contadorDeObjetosPersonaCreados);
		System.out.println("p2.contadorDeObjetosPersonaCreados :" + p2.contadorDeObjetosPersonaCreados);
		System.out.println("p3.contadorDeObjetosPersonaCreados :" + p3.contadorDeObjetosPersonaCreados);

		//p1.contadorDeObjetosPersonaCreados = 5;
		//modificamos el atributo statico "contadorDeObjetosPersonaCreados"
		//Persona.contadorDeObjetosPersonaCreados = 5; //accedo a traves de una instancia de la clase
		System.out.println("Persona.contadorDeObjetosPersonaCreados :" + Persona.contadorDeObjetosPersonaCreados);
		System.out.println("p1.contadorDeObjetosPersonaCreados :" + p1.contadorDeObjetosPersonaCreados);
		System.out.println("p2.contadorDeObjetosPersonaCreados :" + p2.contadorDeObjetosPersonaCreados);
		System.out.println("p3.contadorDeObjetosPersonaCreados :" + p3.contadorDeObjetosPersonaCreados);
		*/
	}

}
