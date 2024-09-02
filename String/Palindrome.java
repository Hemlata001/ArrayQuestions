package String;
import java.util.*;
public class Palindrome
{
    public static boolean isPalindrome(String str){
        for(int i = 0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Checking String is palindrome or not");
        System.out.println(isPalindrome(str));

    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)