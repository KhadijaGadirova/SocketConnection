import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientToServer {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("hostName", 1111);
        PrintWriter pr = new PrintWriter(socket.getOutputStream());
        pr.println("Client connected");
        pr.flush();
        InputStreamReader input = new InputStreamReader(socket.getInputStream());
        BufferedReader buffer = new BufferedReader(input);
        String str = buffer.readLine();
        System.out.println("Server:" + str);
    }
}
