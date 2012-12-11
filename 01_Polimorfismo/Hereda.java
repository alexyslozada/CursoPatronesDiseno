public class Hereda implements Interface{
	public Hereda(){
		saludar();
	}

	@Override
	public String getNombre(){
		return miNombre;
	}

	@Override
	public void saludar(){
		System.out.println("Hola "+getNombre());
	}

	public static void main(String... args){
		Hereda hereda = new Hereda();
	}
}