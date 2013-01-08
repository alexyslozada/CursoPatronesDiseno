public class Alarma{
	private Estado miEstado;

	public void setEstado(Estado e){
		this.miEstado = e;
	}

	public void ejecutarAccion(){
		miEstado.ejecutarAccion();
	}
}