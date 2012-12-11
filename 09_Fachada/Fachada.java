public class Fachada{
	private Cpu miCPU;

	public Fachada(){
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

}