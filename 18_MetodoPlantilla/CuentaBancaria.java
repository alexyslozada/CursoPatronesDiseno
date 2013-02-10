public abstract class CuentaBancaria{
	private String cuenta;
	private int saldo = 0;

	private void setCuenta(String c){
		this.cuenta = c;
	}

	private void consignar(int i){
		System.out.println("Consignando...");
		this.saldo += i;
	}

	private void retirar(int i){
		System.out.println("Retirando...");
		if(i<=this.saldo-10){
			this.saldo -= i;
		} else {
			System.out.println("No se puede retirar ese monto.");
		}
	}

	private void consultarSaldo(){
		System.out.println("El saldo es: "+this.saldo);
	}

	protected void auditoria(){
		System.out.println("Se ha procesado la cuenta: "+this.cuenta);
	}

	public abstract void saludar();

	public void procesar(String c, int i, int t){
		saludar();
		setCuenta(c);
		switch(t){
			case 1:
				consignar(i);
				break;
			case 2:
				retirar(i);
				break;
			default:
				System.out.println("Opcion no valida");
		}
		consultarSaldo();
		auditoria();
	}
}