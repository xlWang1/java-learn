package MapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exer1 {
    public static void main(String[] args) {
        HashMap singer = new HashMap();
        ArrayList songs = new ArrayList();
        songs.add("罪人挽歌");
        songs.add("天使重构");
        singer.put("张杰","不眠之夜");
        singer.put("hanser",songs);
        Iterator iterator = singer.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(singer.get("hanser"));
        System.out.println(singer.values());
        System.out.println(singer.keySet());
        System.out.println(singer.entrySet());

    }
}
