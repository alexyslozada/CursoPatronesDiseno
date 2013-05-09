package curso.memento;
import java.util.ArrayList;

public class BaseDeDatos{
	private ArrayList<Registro> listado;
	private Memento memento;

	public BaseDeDatos(){
		listado = new ArrayList<Registro>();
		memento = new Memento();
	}

	public void agregarRegistro(String n, int e, boolean a){
		Registro temp = new Registro(n,e,a);
		listado.add(temp);
	}

	public void limpiarBD(){
		listado = null;
	}

	public void mostrarListado(){
		if(listado!=null){
			for(Registro temp: listado){
				temp.getRegistro();
			}
		} else {
			System.out.println("Base de datos vacia!!!");
		}
	}

	public void generarBackup(){
		memento.setBackup(listado);
	}

	public void getBackup(int i){
		listado = new ArrayList<Registro>();
		for(Registro temp: memento.getBackup(i)){
			listado.add(temp);
		}
	}

	public int getTamanioBackup(){
		return memento.getSize();
	}
}