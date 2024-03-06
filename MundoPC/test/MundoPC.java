package test;

import mundopc.*;

public class MundoPC {

	public static void main(String[] args) {
		Monitor monitorHP = new Monitor("HP", 13);
		Teclado tecladoHP = new Teclado("bluetooth", "HP");
		Raton ratonHP = new Raton("bluetooth", "HP");
		Ordenador ordenadorHP = new Ordenador("Ordenador HP", monitorHP, tecladoHP, ratonHP);
		
		Orden orden1 = new Orden();
		orden1.agregarOrdenador(ordenadorHP);
		
		orden1.mostrarOrden();

	}

}
