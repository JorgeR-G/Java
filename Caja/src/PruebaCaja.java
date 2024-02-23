
public class PruebaCaja {

	public static void main(String[] args) {

				
		Caja Caja1 = new Caja(3, 2, 6);
		System.out.println("Ancho = " + Caja1.ancho);
		System.out.println("Alto = " + Caja1.alto);
		System.out.println("Profundo = " + Caja1.profundo);
		
		
		int resultado = Caja1.calcularVolumen();

        System.out.println("resultado volumen de caja 1: " + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("resultado volumen de caja 2: " + caja2.calcularVolumen());
		
		
		
		
		
				
			}			
}
