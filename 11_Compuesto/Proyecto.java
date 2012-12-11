import java.util.ArrayList;

public class Proyecto implements ItemProyecto{

	private String nombre;
	private Responsable responsable;
	private ArrayList<ItemProyecto> itemsProyecto = new ArrayList<ItemProyecto>();

	public Proyecto(String n, Responsable r){
		this.nombre = n;
		this.responsable = r;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void agregarItemProyecto(ItemProyecto ipr){
		if(!itemsProyecto.contains(ipr)){
			itemsProyecto.add(ipr);
		}
	}

	@Override
	public int getTiempo(){
		int tiempoTotal = 0;
		for(ItemProyecto item:itemsProyecto){
			tiempoTotal += item.getTiempo();
		}
		return tiempoTotal;
	}

	@Override
	public void imprimir(){
		System.out.println(getNombre()+" Horas: "+getTiempo());
		for(ItemProyecto item:itemsProyecto){
			System.out.print("\t");
			item.imprimir();
		}
	}
}