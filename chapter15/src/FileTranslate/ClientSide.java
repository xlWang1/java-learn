package FileTranslate;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        //创建客户端
        Socket socket = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream bops = null;
        try {
            int port = 4060;
            InetAddress ipadress = InetAddress.getByName("192.168.1.10");
            socket = new Socket(ipadress, port);
            //创建要传输的文件
            System.out.println("请输入要传输的文件地址:");
            Scanner input = new Scanner(System.in);
            String filename = input.next();
            input.close();
            File srcfile = new File(filename);
            FileInputStream fips = new FileInputStream(srcfile);
            bufferedInputStream = new BufferedInputStream(fips);
            OutputStream ops = socket.getOutputStream();
            bufferedOutputStream = new BufferedOutputStream(ops);
            //读取文件
            byte[] buffer = new byte[102400];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
            System.out.println("发送方发送完毕!!");
            inputStream = socket.getInputStream();
            bops = new ByteArrayOutputStream();
            len = -1;
            byte[] info = new byte[5];
            while ((len = inputStream.read(info)) != -1) {
                bops.write(info, 0, len);
            }
            System.out.println(bops.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedInputStream != null)
                    bufferedInputStream.close();
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
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bops != null)
                    bops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
