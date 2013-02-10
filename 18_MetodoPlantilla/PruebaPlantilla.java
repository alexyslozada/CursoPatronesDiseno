public class PruebaPlantilla{
	public static void main(String... args){

		CajeroAutomatico ca = new CajeroAutomatico("F678AB", 30, 1);
		ca.procesar("F678AB",10,2);

		System.out.println();

		Cajero c = new Cajero("1234AB", 50, 1);
		c.procesar("1234AB",10,2);
	}
}