public class ListaPalabras{
	private String palabra1, palabra2, palabra3, palabra4, palabra5;
	private int posicion;

	public ListaPalabras(){
		posicion = 0;
	}

	public void agregar(String p){
		switch(posicion){
			case 0:
				palabra1 = p;
				break;
			case 1:
				palabra2 = p;
				break;
			case 2:
				palabra3 = p;
				break;
			case 3:
				palabra4 = p;
				break;
			case 4:
				palabra5 = p;
				break;
		}
		posicion++;
	}

	public ListaPalabrasIterador iterador(){
		return new ListaPalabrasIterador(palabra1, palabra2, palabra3, palabra4, palabra5);
	}
}