import org.junit.Test;


import java.io.*;

public class FikeReaderWriterTest {
    /*
    输入：
    1.
    文件读取时，如使用throws处理异常，可能导致流不会被关闭，所以使用try更合适*/
    @Test
    public void test1() throws IOException {
        File file = new File("hello.txt");
        FileReader fileReader = new FileReader(file);
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        fileReader.close();
    }

    @Test
    //使用try处理异常
    public void test2() {
        File file = new File("hello.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                System.out.println(e);
                ;
            }
        }
    }

    @Test
    public void test3() {
        /*优化，每次读取多个字符提升效率（减少与磁盘交互的次数）*/
        FileReader fileReader = null;
        try {
            File file = new File("hello.txt");
            fileReader = new FileReader(file);
            char[] cbuffer = new char[5];
            int len;
            while ((len = fileReader.read(cbuffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print((char) cbuffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test4() {
        /*输出：writer
         *filepath="C:\Users\Administrator\Desktop\git.txt"
         *
         *
         * */
        FileWriter fw = null;
        try {
            File file = new File("info.txt");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            fw = new FileWriter(file);//覆盖文件
            fw = new FileWriter(file, true);//追加写入
            fw.write("我这一定很难过\n");
            fw.write("你胡大师\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test5() {
        /*
         * 复制info.txt重命名为info_copy.txt
         * */
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file_src = new File("info.txt");
            File file_dst = new File("info_copy.txt");
            fr = new FileReader(file_src);
            fw = new FileWriter(file_dst);
            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1) {
                fw.write(cbuffer, 0, len);//从数组的第一位开始添加到末尾
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
