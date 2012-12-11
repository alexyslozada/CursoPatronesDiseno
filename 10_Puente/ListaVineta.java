public class ListaVineta extends ListasBase{

    private char tipoVineta;
    
    public void setTipoItem(char nuevoTipo){
        if (nuevoTipo > ' '){
            tipoVineta = nuevoTipo;
        } else {
        	tipoVineta = '+';
        }
    }
    
    @Override
    public String obtenerItem(int index){
        return tipoVineta + " " + super.obtenerItem(index);
    }

}