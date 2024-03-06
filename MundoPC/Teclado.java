package mundopc;

public class Teclado extends DispositivosEntrada {
	private int idTeclado;
	private static int contadorTeclado;

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++Teclado.contadorTeclado;
	}

	public String toString() {
		return "Teclado [idTeclado=" + idTeclado + ", " + super.toString() + "]";
	}

}
