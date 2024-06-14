import org.junit.Test;

public class exer3 {
    @Test
    public void exer3(){
        String str1 = "ab";
        String str2 = "abdadababnijuhuaabbacmijinnavvab";
        int count = getCountOfSubstring(str2,str1);
        System.out.println(count);
    }
    public int getCountOfSubstring(String src,String sub){
        int count = 0;
        int index = src.indexOf(sub);
        System.out.println(index);
        while(index >= 0){
            count++;
            index = src.indexOf(sub,index+sub.length());
        }
        return count;
    }

}
