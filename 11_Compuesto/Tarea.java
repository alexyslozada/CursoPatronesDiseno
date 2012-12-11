import java.util.ArrayList;

public class Tarea implements ItemProyecto{

	private String nombre;
	private Responsable responsable;
	private int tiempoRequerido;
	private ArrayList<ItemProyecto> itemsTarea = new ArrayList<ItemProyecto>();

	public Tarea(String n, Responsable r, int t){
		this.nombre = n;
		this.responsable = r;
		this.tiempoRequerido = t;
	}

	public void agregarItemTarea(ItemProyecto ipr){
		if(!itemsTarea.contains(ipr)){
			itemsTarea.add(ipr);
		}
	}

	@Override
	public int getTiempo(){
		int tiempoTotal = tiempoRequerido;
		for(ItemProyecto item:itemsTarea){
			tiempoTotal += item.getTiempo();
		}
		return tiempoTotal;
	}

	@Override
	public void imprimir(){
		System.out.println("\t"+this.nombre+" Horas: "+getTiempo());
		for(ItemProyecto item:itemsTarea){
			System.out.print("\t\t");
			item.imprimir();
		}
	}
}