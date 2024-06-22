import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Package: PACKAGE_NAME
 * Description: 垃圾代码
 *
 * @Author 王小龙
 * @Create 2024/6/22 23:12
 * @Version 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress myaddress = InetAddress.getByName("www.bilibili.com");
            InetAddress myaddress11 = InetAddress.getLocalHost();
            System.out.println(myaddress11);
            System.out.println(myaddress);
            System.out.println(myaddress.getHostName());
            System.out.println(myaddress.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
