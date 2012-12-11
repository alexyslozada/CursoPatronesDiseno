public class ListasBase{

	protected I_ImplLista implementacion;

	public void setImplementacion(I_ImplLista impl){
		this.implementacion = impl;
	}

	public void agregarItem(String item){
		implementacion.addItem(item);
	}

	public void removerItem(String item){
		implementacion.remItem(item);
	}

	public int cuentaItems(){
		return implementacion.getCantidadDeItems();
	}

	public String obtenerItem(int index){
		return implementacion.getItem(index);
	}

}