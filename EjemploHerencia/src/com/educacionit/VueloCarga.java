package com.educacionit;

//clase que hereda de Vuelo 
public class VueloCarga extends Vuelo {

	// aca estoy pisando el campo de la padre
	public int asientos = 12;
	public float espacioMaximoDeCarga = 1000; // pies cubicos de espacio en la bodega
	public float espacioDeCargaUsado;

	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;

		if (espacioDeCargaDisponible(size)) {
			espacioDeCargaUsado += size;
			System.out.println("gracias por confiar en nostros su paquete esta en la bodega del avion ");
		} else {
			faltaEspacio();
		}

	}

	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioDeCargaUsado + tamanio <= espacioMaximoDeCarga;
	}

	private void faltaEspacio() {
		System.out.println("No queda mas espacion suficiente para su paquete en la bodega del avion ");
	}
}
