public abstract class FabricaAbstracta{

	// Constructor vacio
	public FabricaAbstracta(){}

	// Método que será implementado por
	// cada clase hija, y que será específico
	protected abstract Conexion creaConexion(String tipo);
}