public class ClienteConFachada{
	private Fachada miFachada;

	public ClienteConFachada(){
		miFachada = new Fachada();
	}

	public void encenderCPU(){
		miFachada.encenderCPU();
		System.out.println("COMIENZO A TRABAJAR");
	}

	public static void main(String args[]){
		ClienteConFachada ccf = new ClienteConFachada();
		ccf.encenderCPU();
	}
}