import java.util.ArrayList;

public class Prueba{
	public static void main(String args[]){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		for(Integer i:lista){
			System.out.println(i);
		}
	}
}