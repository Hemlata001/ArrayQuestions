import java.util.*;
public class BruteForceSecondLargest
{
    public static int max(int[] arr){
        Arrays.sort(arr);                      //O(nlogn)
        int n = arr.length;
        if(arr[n-1]==arr[n-2]){
            return arr[n-3];
        }
        else{
            return arr[n-2];
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7};
        System.out.println(max(arr));

    }
}
