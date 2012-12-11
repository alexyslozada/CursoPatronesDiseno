import java.util.*;

public interface Robot{
	// Método que pone a trabajar al robot
	public void trabajar();

	/* Método que cargará las acciones
	   solicitadas por el builder
	   en tiempo de ejecución
	*/
	public void cargaAcciones(List<Integer> accion);
}