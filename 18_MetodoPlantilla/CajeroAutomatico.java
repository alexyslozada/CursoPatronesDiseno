public class CajeroAutomatico extends CuentaBancaria{
	
	public CajeroAutomatico(String c, int i, int t){
		procesar(c,i,t);
	}

	@Override
	public void saludar(){
		System.out.println("Por favor ingrese los datos...");
	}
}