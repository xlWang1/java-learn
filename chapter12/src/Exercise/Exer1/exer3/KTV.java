package Exercise.Exer1.exer3;

import java.util.ArrayList;
import java.util.Scanner;

public class KTV {
    //指令1代表添加歌曲
    //指令2代表将所选歌曲置顶
    //指令3代表将所选歌曲提前一位
    //指令4代表退出该系统
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList songs = new ArrayList();
        boolean flag = true;
        while(flag == true){
            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");
            int order = input.nextInt();
            if(order == OrderEnum.ADDSONG.getValue()){
                System.out.println("请输入歌曲名称:");
                String song = input.next();
                songs.add(song);
                System.out.println("歌曲<"+song+">添加成功");
            } else if (order == OrderEnum.TOTOP.getValue()) {
                System.out.println("歌曲列表:");
                for (Object s:songs) {
                    System.out.println(s);
                }
                System.out.println("请选择要置顶的歌曲:");
                 String selesong = input.next();
                 int seleindex = songs.indexOf(selesong);
                 if(seleindex >= 0){
                     if (seleindex == 0){
                         System.out.println("该歌曲已排在首位，无需再次置顶");
                     }else{
                         String temp = (String) songs.get(0);
                         songs.set(0,songs.get(seleindex));
                         songs.set(seleindex,temp);
                     }
                 }else {
                     System.out.println("非法输入");
                 }

            } else if (order == OrderEnum.SHANGYI.getValue()) {
                System.out.println("歌曲列表:");
                for (Object s:songs) {
                    System.out.println(s);
                }
                System.out.println("请选择要上移的歌曲:");
                String selesong = input.next();
                int seleindex = songs.indexOf(selesong);
                if(seleindex >= 0){
                    if (seleindex == 0){
                        System.out.println("该歌曲已排在首位，无需上移");
                    }else{
                        String temp = (String) songs.get(seleindex-1);
                        songs.set(seleindex-1,songs.get(seleindex));
                        songs.set(seleindex,temp);
                        System.out.println("歌曲<"+selesong+">上移成功");
                    }
                }else {
                    System.out.println("非法输入");
                }

            } else if (order == OrderEnum.TUICHU.getValue()) {
                flag = false;
            }else {
                System.out.println("非法输入");
            }
        }
    }
}
