public class ListaEnumerada extends ListasBase{

	@Override
    public String obtenerItem(int index){
        return (index + 1) + ". " + super.obtenerItem(index);
    }
}