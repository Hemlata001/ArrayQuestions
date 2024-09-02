package String;
import java.util.*;
public class StringSubstring
{
    public static String subString(String str, int start , int end){
        String substr =" ";
        for(int i = start ; i<end;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HIMANSHI";
        System.out.println(subString(str,0,4));
    }
}
