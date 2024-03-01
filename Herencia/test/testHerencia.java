package test;

import java.util.Date;

import domain.Cliente;
import domain.Empleado;

public class testHerencia {
	public static void main(String [] args) {
		Empleado empleado1 = new Empleado("Juan", 5000);
		System.out.println("empleado = " + empleado1);
		
		Cliente cliente1 = new Cliente("Carlos " , 'M', 28, "Saturno 15 ", new Date(), true);
		System.out.println("cliente = " + cliente1);

	}

}
