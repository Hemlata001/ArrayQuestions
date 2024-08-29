package StriverArray;
import java.util.*;
public class LargestElement
{
    public static int largestBruteForceApproach(int[] arr){
        Arrays.sort(arr);// O(nlogn)
        return arr[arr.length-1];
    }
    public static int largestOptimalApproach(int[] arr){
        int large = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){ // O(n)
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void printArr(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,8,7,56,90};
        System.out.println("--Actual Array ->");
        printArr(arr);
        System.out.println("--Brute Force ->");
        System.out.println("Largest Element : "+ largestBruteForceApproach(arr));
        System.out.println("--Optimal Approach ->");
        System.out.println("Largest Element : "+largestOptimalApproach(arr));
    }
}
// Space Complexity : O(1)
