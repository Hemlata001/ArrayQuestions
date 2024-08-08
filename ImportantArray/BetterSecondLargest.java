import java.util.*;
public class BetterSecondLargest {
    public static int maxArr(int[] arr){    //O(2n)
        int max = Integer.MIN_VALUE;
        int n  = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,8,9,1,2};
        System.out.println(maxArr(arr));
    }
}
