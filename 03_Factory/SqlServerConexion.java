public class SqlServerConexion extends Conexion{
	//Constructor vacio
	public SqlServerConexion(){}

	//Se sobreescribe el método descripción
	@Override
	public String descripcion(){
		return "Conexion SqlServer";
	}
}