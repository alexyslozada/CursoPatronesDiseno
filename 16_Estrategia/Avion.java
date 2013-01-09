public abstract class Avion{
	private Algoritmo miAlgoritmo;

	public void setAlgoritmo(Algoritmo a){
		this.miAlgoritmo = a;
	}

	public void mover(){
		this.miAlgoritmo.moverse();
	}
}