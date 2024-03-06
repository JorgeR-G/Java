package mundopc;


public class Orden {
	private int idOrden;
	private Ordenador ordenador[];
	private static int contadorOrdenes;
	private int contadorOrdenadores;
	private static final int MAX_Ordenador = 10;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.ordenador = new Ordenador[Orden.MAX_Ordenador];
	}

	public void agregarOrdenador(Ordenador ordenador) {
		if(this.contadorOrdenadores < Orden.MAX_Ordenador) {
			this.ordenador[this.contadorOrdenadores++] = ordenador;
		}
		else {
			System.out.println("Has superado el limite: " + Orden.MAX_Ordenador);
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #:" + this.idOrden);
		System.out.println("Ordenadores de la orden #:" + this.idOrden);
		for (int i = 0; i < this.contadorOrdenadores; i++) {
			System.out.println(this.ordenador[i]);
			
		}
	}
}
