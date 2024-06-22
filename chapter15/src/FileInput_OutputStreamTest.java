import java.io.*;

public class FileInput_OutputStreamTest {
    /*
     * filepath = "F:\图\bb.jpg"
     * */
    public static void main(String[] args){
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File src_file = new File("F:\\下载\\11.jpg");
            File dst_file = new File("F:\\下载\\11_copy.jpg");

            inputStream = new FileInputStream(src_file);
            outputStream = new FileOutputStream(dst_file);

            byte[] buffer = new byte[10240];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
