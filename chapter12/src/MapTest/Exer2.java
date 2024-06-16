package MapTest;

import java.util.*;

public class Exer2 {
    public static void main(String[] args) {
        HashMap cities = new HashMap();
        String sichuan = new String("四川");
        String gansu = new String("甘肃");
        ArrayList cityofgansu = new ArrayList();
        ArrayList cityofsichuan = new ArrayList();
        cityofsichuan.add("成都");
        cityofsichuan.add("资阳");
        cityofsichuan.add("德阳");
        cityofgansu.add("武都");
        cityofgansu.add("礼县");
        cities.put(sichuan,cityofsichuan);
        cities.put(gansu,cityofgansu);
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag == true){
            System.out.println("请输入查询的省份:");
            String provience = input.next();
            if(!provience.equals("0")){
                ArrayList city = serchcitiesofpro(provience,cities);
                if (city.size() != 0){
                    Iterator iterator = city.iterator();
                    while(iterator.hasNext()){
                        System.out.print(iterator.next());
                        System.out.print("\t\t\t\t");
                    }
                    System.out.println();
                    System.out.println("请选择地级市:");
                    String serchcity = input.next();
                    if(city.contains(serchcity)){
                        System.out.println("当前选择城市为："+provience+"->"+serchcity+"!\t\t保存成功");
                    }else {
                        System.out.println("输入地级市错误查询");
                    }

                }else {
                    System.out.println("数据错误，请重试");
                }
            }else{
                flag = false;
            }
        }
        input.close();
    }
    public static ArrayList serchcitiesofpro(String provience, HashMap Cities){
        ArrayList citylist = new ArrayList();
        if (Cities instanceof HashMap){
            if(Cities.containsKey(provience)){
                citylist = (ArrayList) Cities.get(provience);
                return citylist;
            }
        }
        return citylist;
    }
}
