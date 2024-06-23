import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerTest {

    @Test
    public void ServerTest() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        ByteArrayOutputStream baos = null;
        try {
            int port = 8890;
            serverSocket = new ServerSocket(port);

            System.out.println("waitting for others ......");
            socket = serverSocket.accept();

            System.out.println("arrive message from <" + socket.getInetAddress().getHostAddress() + ">!!");

            InputStream message = socket.getInputStream();

            int len;
            byte[] buffer = new byte[5];
            baos = new ByteArrayOutputStream();
            while ((len = message.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
