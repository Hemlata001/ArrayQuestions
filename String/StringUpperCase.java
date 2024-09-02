package String;
import java.util.*;
public class StringUpperCase {
    public static String toUpperCase(String str){
        StringBuilder strB = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        strB.append(ch);

        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                strB.append(str.charAt(i));
                i++;
                strB.append(Character.toUpperCase(str.charAt(i)));
            }else{
                strB.append(str.charAt(i));
            }
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        String str = "hi , i am himanshi";
        System.out.println(toUpperCase(str));
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
