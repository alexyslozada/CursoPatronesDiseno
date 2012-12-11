public class PruebaProxy{
	PersonaProxy persona;

	public static void main(String... args){
		PruebaProxy pp = new PruebaProxy();
	}

	public PruebaProxy(){
		persona = new PersonaProxy();
		persona.saludar();
		persona.decirEstado();
		persona.despedirse();
	}
}