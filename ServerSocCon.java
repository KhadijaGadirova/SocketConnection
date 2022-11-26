import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocCon {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket server = serverSocket.accept();
        System.out.println("Client connected");
    }
}
