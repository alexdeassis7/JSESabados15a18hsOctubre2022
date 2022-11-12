package com.educacionit;

public class Passenger {

	private int bolsos;
	private int bolsosPagos;
	private double tarifaXBolso;
	private double totaApagar;
	private int totalEquipaje;

	// contructor vacio
	public Passenger() {
	}

	// contructor 2 con un parametro , llama al constructor private
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d);
		this.bolsos = bolsos;
		totaApagar = bolsos * tarifaXBolso;
		totalEquipaje = bolsos;
	}

	// contructor 3 con dos parametros . este llamara al constructor 2 que a su vez
	// llama al cosntructor private
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsos = bolsos;
		this.totaApagar = bolsos * tarifaXBolso;
		totalEquipaje = bolsos + bolsosPagos;

	}

	// contructor private
	private Passenger(double tarifaXbolso) {
		this.tarifaXBolso = tarifaXbolso;
	}

}
