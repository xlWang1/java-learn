import org.junit.Test;

import java.lang.annotation.Target;

public class exer2 {
    @Test
    public void exe2(){
        String src = "abcdefg";
        String dic = reverse(src,2,5);
        System.out.println(dic);
    }

    public String reverse(String src,int fromIdex,int toIndex){
        char[] arr = src.toCharArray();
        for (int i = fromIdex,j = toIndex;i < j;i++,j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    }

