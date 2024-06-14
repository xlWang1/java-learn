package UerLoin;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        accounts[0] = new Account("zhangsan","zhangsan");
        accounts[1] = new Account("lisi","lisi");
        accounts[2] = new Account("wangwu","wangwu");
        accounts[3] = new Account("mashu","mashu");
        accounts[4] = new Account("tingting","tingtting");
        accounts[5] = new Account("zhanghao","zhanghao");
        accounts[6] = new Account("zhuying","zhuying");
        accounts[7] = new Account("mingming","mingming");
        accounts[8] = new Account("libai","libai");
        String rec = Login(accounts);
        System.out.println(rec);



    }
    public static String Login(Account[] array){
    boolean state = false;
    String loginsate = "";
    String tips = new String("");
    Scanner input = new Scanner(System.in);
    System.out.print("请输入账号：");
    String user = input.next();
    System.out.print("请输入密码：");
    String password = input.next();
    for (int i = 0; i < array.length; i++) {
        if (array[i]!=null){
            if (array[i].getName().equals(user)){
                if (array[i].getPwd().equals(password)){
                    state = true;
                    tips = array[i].getName();
                }else {
                    tips = "密码错误";
                }
                break;
            }

        }
        if (state == true){
            loginsate = "登录成功";
        }else
        {
            tips = "账号错误";
            loginsate = "登录失败";
        }
        input.close();
        }

    return loginsate + tips;

}

}
