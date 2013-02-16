public class ListaNumeros{
	private int numeros[];
	private int posicion;

	public ListaNumeros(){
		numeros = new int[10];
		posicion = 0;
	}

	public void agregar(int i){
		numeros[posicion++] = i;
	}

	public ListaNumerosIterador iterador(){
		return new ListaNumerosIterador(numeros);
	}
}