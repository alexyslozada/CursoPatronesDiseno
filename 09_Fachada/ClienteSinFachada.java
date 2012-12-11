public class ClienteSinFachada{
	private Cpu miCPU;

	public ClienteSinFachada(){
		miCPU = new Cpu();
	}

	public void encenderCPU(){
		miCPU.enviarVoltaje(110);
		miCPU.enviaEnergiaADispositivos();
		miCPU.reseteaContadores();
		miCPU.revisaBIOS();
		miCPU.revisaHardware();
		miCPU.asignaCanales();
		miCPU.revisaMemoria();
		miCPU.revisaEntradas();
		miCPU.buscaSectorArranque();
		miCPU.cargaBoot();
		miCPU.cargaSistemaOperativo();
		if(miCPU.cpuLista()){
			System.out.println("\n");
			System.out.println("CPU ENCENDIDA Y LISTA PARA TRABAJAR!!!");
		}
	}

	public void trabajar(){
		System.out.println("COMIENZO A TRABAJAR!!!");
	}

	public static void main(String args[]){
		ClienteSinFachada csf = new ClienteSinFachada();
		csf.encenderCPU();
		csf.trabajar();
	}
}