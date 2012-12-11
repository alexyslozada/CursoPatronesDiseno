public class HeredaAbstracta extends ClaseAbstracta{

	@Override
	public void despedirse(){
		System.out.println("Ciao "+super.nombre);
	}

	public HeredaAbstracta(){
		darNombre("Alexys");
		saludar();
		despedirse();
	}

	public void darNombre(String nombre){
		super.nombre = nombre;		
	}

	public static void main(String... args){
		HeredaAbstracta ha = new HeredaAbstracta();
	}	
}