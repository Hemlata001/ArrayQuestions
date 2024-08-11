import java.util.*;
public class Smallest
{
    public static int smallest(int[] num){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<num.length;i++){
            while(num[i]<min){
                min = num[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(smallest(num));
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
