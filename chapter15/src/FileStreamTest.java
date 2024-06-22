import java.io.*;

public class FileStreamTest {
    /*
    * 使用缓冲流提升效率( BufferedInputStream,BufferedOutputStream)
    *
    * */
    public static void main(String[] args){
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File src_file = new File("F:\\下载\\11.jpg");
            File dst_file = new File("F:\\下载\\11_copy1212.jpg");

            inputStream = new FileInputStream(src_file);
            outputStream = new FileOutputStream(dst_file);

            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            byte[] buffer = new byte[10240];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null)
                    bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedOutputStream != null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
