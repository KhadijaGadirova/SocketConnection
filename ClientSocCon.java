import java.io.IOException;
import java.net.Socket;

public class ClientSocCon {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("hostName", 8888);
    }
}
