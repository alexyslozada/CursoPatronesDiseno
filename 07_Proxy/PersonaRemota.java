import java.io.*;
import java.net.*;

public class PersonaRemota implements Runnable{
	private Thread thread;
	ServerSocket socket;
	PrintWriter salida;
	Socket communicationSocket;

	public static void main(String args[]){
		PersonaRemota pr = new PersonaRemota();
	}

	public PersonaRemota(){
		try{
			socket = new ServerSocket(45454);
			communicationSocket = socket.accept();
			salida = new PrintWriter(communicationSocket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
		} catch (Exception e){
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
	}

	@Override
	public void run(){
		String textoEntrada;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader
				(communicationSocket.getInputStream()));
			while((textoEntrada = in.readLine()) != null){
				if(textoEntrada.equals("saludar")){
					saludar();
				} else if(textoEntrada.equals("decirEstado")){
					decirEstado();
				} else if(textoEntrada.equals("despedirse")){
					despedirse();
				}
			}
		} catch (Exception e){
			System.out.println("Error general: "+e.getMessage());
		}
	}

	public void saludar(){
		salida.println("Hola!!!");
	}

	public void decirEstado(){
		salida.println("Estoy contento");
	}

	public void despedirse(){
		salida.println("Chao!!!");
	}
}