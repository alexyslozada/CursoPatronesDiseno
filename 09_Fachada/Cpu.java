public class Cpu{
	private int contadores = -1;
	private int memoriaRam = 0;
	private int[] canales = new int[4];
	private boolean voltajeOk, energiaDispositivosOk, 
					contadoresOk, biosOk, hardwareOk, 
					entradasOk, sectorArranqueOk, 
					bootOk, soOk, listoOk;
	public Cpu(){}

	public boolean enviarVoltaje(int voltaje){
		if(voltaje>=100 && voltaje<=120){
			voltajeOk = true;
		}
		return voltajeOk;
	}

	public boolean enviaEnergiaADispositivos(){
		if(voltajeOk){
			energiaDispositivosOk = true;
		}
		return energiaDispositivosOk;
	}

	public boolean reseteaContadores(){
		if(energiaDispositivosOk){
			contadores = 0;
			contadoresOk = true;
		}
		return contadoresOk;
	}

	public boolean revisaBIOS(){
		if(voltajeOk && energiaDispositivosOk && contadoresOk){
			biosOk = true;
		}
		return biosOk;
	}

	public boolean revisaHardware(){
		if(biosOk){
			hardwareOk = true;
		}
		return hardwareOk;
	}

	public void asignaCanales(){
		if(hardwareOk){
			for(int i=0; i<canales.length; i++){
				canales[i] = (i*4);
			}
		}
	}

	public void revisaMemoria(){
		if(canales[1]==4){
			memoriaRam = 2048;
		}
	}

	public boolean revisaEntradas(){
		if(memoriaRam>0){
			entradasOk = true;
		}
		return entradasOk;
	}

	public boolean buscaSectorArranque(){
		if(entradasOk){
			sectorArranqueOk = true;
		}
		return sectorArranqueOk;
	}

	public boolean cargaBoot(){
		if(sectorArranqueOk){
			bootOk = true;
		}
		return bootOk;
	}

	public boolean cargaSistemaOperativo(){
		if(bootOk){
			soOk = true;
		}
		return soOk;
	}

	public boolean cpuLista(){
		if(soOk){
			listoOk = true;
		}
		return listoOk;
	}
}