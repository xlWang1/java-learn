package FileTranslate;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSide {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket accept = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        OutputStream outputStream = null;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请为接受的文件命名：");
            String filename = input.next();
            //定义端口
            int port = 4060;
            //新建服务端
            serverSocket = new ServerSocket(port);
            System.out.println("Waiting for connection from client........");
            //等待客户端的连接
            accept = serverSocket.accept();
            System.out.println("Received connection from client<>");
            //创建文件流
            File revicefile = new File("revicefile.rar");
            File perserfile = new File(filename);
            FileInputStream fis = new FileInputStream(revicefile);
            FileOutputStream ops = new FileOutputStream(perserfile);
            //使用缓冲流以提升效率
            bufferedInputStream = new BufferedInputStream(fis);
            bufferedOutputStream = new BufferedOutputStream(ops);
            //读写文件
            byte[] buffer = new byte[102400];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
            System.out.println("接受完毕！");
            outputStream = accept.getOutputStream();
            outputStream.write("接收方已接收完毕".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
                if (accept != null)
                    accept.close();
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
