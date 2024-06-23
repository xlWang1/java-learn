import org.testng.annotations.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {
    @Test
    public void Client(){
        int port = 8890;
        String ip = "192.168.1.3";
        Socket socket = null;
        OutputStream message = null;
        try {
            InetAddress address = InetAddress.getByName(ip);
            socket = new Socket(address, port);

            message = socket.getOutputStream();
            message.write("hello,my name is Client!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (message != null)
                    message.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
