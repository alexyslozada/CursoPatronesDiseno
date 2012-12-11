public class Fabrica{
	// Nombre del tipo de conexión
	protected String tipo;

	// Constructor que recibe el
	// nombre del tipo de conexión
	public Fabrica(String t){
		tipo = t;
	}	 

	// Metodo que retorna el objeto
	// conexión específico
	public Conexion creaConexion(){
		if (tipo.equalsIgnoreCase("Oracle")){
			return new OracleConexion();
		} else if (tipo.equalsIgnoreCase("SQLServer")){
			return new SqlServerConexion();
		} else if (tipo.equalsIgnoreCase("MySql")){
			return new MySqlConexion();
		} else {
			return new PostgresqlConexion();
		}
	}
}