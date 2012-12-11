public class Tomate extends DecoradorHamburguesa{
	private Hamburguesa hamburguesa;

	public Tomate(Hamburguesa h){
		this.hamburguesa = h;
	}

	@Override
	public String getDescripcion(){
		return hamburguesa.getDescripcion()+" + Tomate";
	}
}