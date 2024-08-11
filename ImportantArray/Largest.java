import java.util.*;
public class Largest
{
    public static int largest(int[] num){
        int n = num.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {1,7,6,8,9,3,4,2};
        System.out.println("Largest number in the array is: "+largest(num));
    }
}

// Time complexity : O(n)
//  Space Complexity : O(1)
