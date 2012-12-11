public class Lechuga extends DecoradorHamburguesa{
	private Hamburguesa hamburguesa;

	public Lechuga(Hamburguesa h){
		this.hamburguesa = h;
	}

	@Override
	public String getDescripcion(){
		return hamburguesa.getDescripcion()+" + lechuga";
	}
}