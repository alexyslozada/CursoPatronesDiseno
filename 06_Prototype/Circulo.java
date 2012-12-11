public class Circulo implements Figura{
	private String nombre;
	private int posicionX, posicionY;

	public Circulo(){}

	@Override
	public void setNombre(String n){
		this.nombre = n;
	}

	@Override
	public String getNombre(){
		return nombre;
	}

	@Override
	public void mover(int x, int y){
		this.posicionX = x;
		this.posicionY = y;
	}

	@Override
	public void getPosicion(){
		System.out.println("Circulo en x: "+this.posicionX);
		System.out.println("Circulo en y: "+this.posicionY);		
	}

	@Override
	public Figura clonar(){
		Figura figura = new Circulo();
		figura.setNombre(this.nombre);
		figura.mover(this.posicionX, this.posicionY);
		return figura;
	}
}