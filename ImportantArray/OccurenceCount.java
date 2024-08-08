import java.util.*;
public class OccurenceCount
{
    public static int maxNum(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return arr.length-count;
    }
    public static void PrintArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {-4,-3,7,9,3,9,4};
        System.out.println("Array ");
        PrintArr(arr);
        System.out.println("Occurence Count which is valid: " + maxNum(arr));
    }
}
