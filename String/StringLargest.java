package String;
import java.util.*;
public class StringLargest
{
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana","litchi","kiwi"};
        String largest = fruits[0];
        for(int i = 1;i< fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
