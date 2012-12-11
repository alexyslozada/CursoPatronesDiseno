public class ClienteParaRedesSociales{
	private Fachada miFachada;

	public ClienteParaRedesSociales(){
		miFachada = new Fachada();
	}

	public void encenderCPU(){
		miFachada.encenderCPU();
		System.out.println("ENTRO A LAS REDES SOCIALES");
	}

	public static void main(String args[]){
		ClienteParaRedesSociales cprs = new ClienteParaRedesSociales();
		cprs.encenderCPU();
	}

}