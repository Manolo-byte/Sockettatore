package sockettatore;
import java.io.IOException;
import java.net.Socket;
public class Client {
	public static void main(String[] args) {
		Socket socket1;
		int porta = 2000;
		String address;
		String indirizzo = "localhost";
		try {
			socket1 = new Socket(indirizzo,porta);
			System.out.println(socket1.getLocalSocketAddress());
			socket1.close();
		} catch (IOException ex) {
			System.err.println("ERRORE2!!!!");
		}
	}
}
