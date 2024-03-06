package mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
		
	}
	
	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTama�o() {
		return tamanio;
	}

	public void setTama�o(double tama�o) {
		this.tamanio = tama�o;
	}

	public static int getContadorMonitores() {
		return contadorMonitores;
	}

	public static void setContadorMonitores(int contadorMonitores) {
		Monitor.contadorMonitores = contadorMonitores;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
	}
	
	

}
