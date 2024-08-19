package Sorting;
import java.util.*;
public class InsertionSort {
    public static void insertion(int[] nums){
        for(int i = 1;i< nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev >= 0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }
    public static void printSort(int[] nums){
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {2,1,9,7,6,3,4};
        System.out.println("Before Sorting Array ->");
        printSort(nums);
        System.out.println("After Insertion Sort -> ");
        insertion(nums);
        printSort(nums);

    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)
