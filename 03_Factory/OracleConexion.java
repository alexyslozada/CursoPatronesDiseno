public class OracleConexion extends Conexion{
	//Constructor vacio
	public OracleConexion(){}

	//Se sobreescribe el método descripción
	@Override
	public String descripcion(){
		return "Conexion Oracle";
	}
}