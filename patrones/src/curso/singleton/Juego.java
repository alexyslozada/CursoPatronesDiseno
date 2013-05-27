package curso.singleton;
import java.util.Scanner;

public class Juego{

	public static void main(String... args){
		Marcianos marcianos;
		Computadora computadora;
		Jugador jugador;
		Scanner sc;
		marcianos = Marcianos.getMarcianos();
		computadora = new Computadora();
		jugador = new Jugador();
		sc = new Scanner(System.in);

		int disparos;

		do{
			System.out.print("Digite los disparos: ");
			disparos = sc.nextInt();
			for(int i=0; i<disparos; i++){
				jugador.destruirMarciano();
			}
			computadora.creaMarcianos();
			marcianos.cuantosQuedan();
		} while (disparos!=0);

	}
}