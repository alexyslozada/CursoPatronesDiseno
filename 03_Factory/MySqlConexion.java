public class MySqlConexion extends Conexion{
	//Constructor vacio
	public MySqlConexion(){}

	//Se sobreescribe el método descripción
	@Override
	public String descripcion(){
		return "Conexion MySql";
	}
}