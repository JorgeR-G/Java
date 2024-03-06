package mundopc;



public class Ordenador {
	private int idOrdenador;
	private String nombre;
	private Monitor monitor;
	private Raton raton;
	private Teclado teclado;
	private static int contadorOrdenador;
	
	private Ordenador() {
		this.idOrdenador = ++Ordenador.contadorOrdenador;	
	}

	public Ordenador(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.raton = raton;
		this.teclado = teclado;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public int getIdOrdenador() {
		return idOrdenador;
	}

	
	public String toString() {
		return "Ordenador [idOrdenador=" + idOrdenador + ", nombre=" + nombre + ""
				+ ", monitor=" + monitor + ", raton="
				+ raton + ", teclado=" + teclado + "]";
	}
	
	
	
}
