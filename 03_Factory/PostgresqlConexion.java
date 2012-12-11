public class PostgresqlConexion extends Conexion{
	//Constructor vacio
	public PostgresqlConexion(){}

	//Se sobreescribe el método descripción
	@Override
	public String descripcion(){
		return "Mi Conexion favorita: Postgresql";
	}
}