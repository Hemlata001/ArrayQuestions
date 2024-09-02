package String;
import java.util.*;
public class Compress
{
    public static String compressString(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        StringBuilder strB = new StringBuilder();
        int length = str.length();
        for(int i = 0;i<length;i++){
            Integer count = 1;
            while(i<length-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            strB.append(str.charAt(i));
            if (count > 1) {
                strB.append(count);
            }
        }
        return strB.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbccddddeeef";
        System.out.println(compressString(str));

    }
}
