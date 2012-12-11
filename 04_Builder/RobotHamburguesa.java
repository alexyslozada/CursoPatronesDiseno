import java.util.*;

public class RobotHamburguesa implements Robot{
	// Lista de acciones a realizar
	List<Integer> acciones;

	// Constructor vacio
	public RobotHamburguesa(){}

	// Inicia el proceso
	private void iniciar(){
		System.out.println("Iniciando la Hamburguesa");
	}

	// Busca los ingredientes
	private void getIngredientes(){
		System.out.println("Buscando: Pan, Hamburguesa, Salsas");
	}

	// Arma la Hamburguesa
	private void armar(){
		System.out.println("Armando la Hamburguesa");
	}

	// Revisa el proceso
	private void revisar(){
		System.out.println("Revisando el proceso");
	}

	// Termina el proceso
	private void terminar(){
		System.out.println("Proceso Terminado");
	}

	/* Método sobreescrito encargado 
	   de cargar las acciones
	   solicitadas por el builder en tiempo
	   de ejecución
	*/
	@Override
	public void cargaAcciones(List<Integer> accion){
		this.acciones = accion;
	}

	/* Método sobreescrito que procesa las acciones
	   solicitadas por el builder en tiempo
	   de ejecución
	*/
	@Override
	public void trabajar(){
		iniciar();
		for(Integer i:acciones){
			switch(i){
				case 1:
					getIngredientes();
					break;
				case 2:
					armar();
					break;
				case 3:
					revisar();
					break;
				default:
					System.out.println("Esa accion no la puedo hacer");
			}
		}
		terminar();
	}
}