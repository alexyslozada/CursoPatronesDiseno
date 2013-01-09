public class PruebaEstrategia{
	public static void main(String[] args){
		AvionComercial avionComercial = new AvionComercial();
		AvionRapido avionRapido = new AvionRapido();

		System.out.println("Primero el avion comercial...");
		avionComercial.setAlgoritmo(new EnTierra());
		avionComercial.mover();
		avionComercial.setAlgoritmo(new EnAire());
		avionComercial.mover();
		System.out.println();

		System.out.println("Ahora el avion rapido...");
		avionRapido.setAlgoritmo(new EnTierra());
		avionRapido.mover();
		avionRapido.setAlgoritmo(new EnAireVeloz());
		avionRapido.mover();
		System.out.println();

		System.out.println("El avion comercial veloz...");
		avionComercial.setAlgoritmo(new EnAireVeloz());
		avionComercial.mover();
	}
}