public class Queso extends DecoradorHamburguesa{
	private Hamburguesa hamburguesa;

	public Queso(Hamburguesa h){
		this.hamburguesa = h;
	}

	@Override
	public String getDescripcion(){
		return hamburguesa.getDescripcion()+" + Queso";
	}
}