import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCliToSer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("Client connectet");
        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader buffer = new BufferedReader(input);

        String str = buffer.readLine();
        System.out.println("Client:" + str);
    }
}
