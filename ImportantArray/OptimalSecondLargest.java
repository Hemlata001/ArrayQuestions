import java.util.*;
public class OptimalSecondLargest
{
    public static int maxArr(int[] arr){      //O(n)
        int n = arr.length;
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for(int i  = 0;i<n;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,8,9,1,2};
        System.out.println(maxArr(arr));
    }
}
