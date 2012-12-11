public interface I_ImplLista{
    public void addItem(String item);
    public void remItem(String item);
    public int getCantidadDeItems();
    public String getItem(int index);
    public boolean soportaRepetidos();
}