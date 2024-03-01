
public class Caja {
	
	//Atributo de la clase
	int ancho ;
	int profundo;
	int alto;
	
	//Constructor vacio
	public Caja() {
	}
	
	public Caja(int ancho, int profundo, int alto) {
		this.ancho = ancho;
		this.profundo = profundo;
		this.alto = alto;
		
		System.out.println("Ejecutando constructor con arg");
	}
	
	
	//Método
		public int calcularVolumen() {
			int vol = ancho * alto * profundo;
			return vol;
			
		}
}
