import java.util.*;

public class Builder{
	
	// Robot a construir
	Robot robot;

	// Acciones a Realizar
	List<Integer> acciones;

	// Constructor que 
	// inicializa las acciones (vacias)
	public Builder(){
		acciones = new ArrayList<Integer>();
	}

	// Método que crea el robot
	// dependiendo de lo solicitado por el cliente
	public void setRobot(int i){
		if(i==1){
			robot = new RobotHamburguesa();
		} else {
			robot = new RobotHotDog();
		}
	}

	/* Métodos que pueden solicitar los clientes
	   en tiempo de ejecución y que organizarán
	   los procesos a realizar por el robot.
	*/
	public void addGetIngredientes(){
		acciones.add(1);
	}

	public void addArmar(){
		acciones.add(2);
	}

	public void addRevisar(){
		acciones.add(3);
	}

	public void addImposible(){
		acciones.add(100);
	}

	// Método que devuelve el robot construido
	public Robot getRobot(){
		robot.cargaAcciones(acciones);
		return robot;
	}
}