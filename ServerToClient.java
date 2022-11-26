import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerToClient {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1111);
        Socket socket = serverSocket.accept();
        System.out.println("Information accepted");
        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader buffer = new BufferedReader(input);
        String str = buffer.readLine();
        System.out.println("Client:" + str);
        PrintWriter pr = new PrintWriter(socket.getOutputStream());
        pr.println("Server connected");
        pr.flush();
    }
}
