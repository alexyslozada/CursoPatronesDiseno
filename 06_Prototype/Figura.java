public interface Figura{
	public void setNombre(String n);
	public String getNombre();
	public void mover(int x, int y);
	public void getPosicion();
	public Figura clonar();
}