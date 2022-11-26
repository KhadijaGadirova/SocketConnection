import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientCliToSer {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("hostName", 9999);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hello");
        printWriter.flush();
    }

}
