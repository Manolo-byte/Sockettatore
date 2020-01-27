import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	public static void main(String[] args) {
			try {
				Threaddatore t1= new Threaddatore();
				ServerSocket serverSocket = new ServerSocket(2000);
				serverSocket.setSoTimeout(5000);
				t1.start();
				Socket socket2 = serverSocket.accept();
				t1.i=true;
				System.out.println(socket2.getLocalSocketAddress());
			} catch (IOException ex) {
				System.err.println("ERRORE1!!!!");
			}
	}
}
