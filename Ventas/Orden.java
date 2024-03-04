package ventas;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProducto;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if(this.contadorProducto < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProducto++] = producto;
		}
		else {
			System.out.println("Se ha superado el máximo de productos" + Orden.MAX_PRODUCTOS);
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < contadorProducto; i++) {
			total += this.productos[i].getPrecio();			
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("Id Orden: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("Total de la orden: $" + totalOrden );
		System.out.println("productos de la Orden");
		for (int i = 0; i < this.contadorProducto; i++) {
			System.out.println(this.productos[i]);
		}
	}

}
