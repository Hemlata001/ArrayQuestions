package Sorting;
import java.util.*;
public class CountingSort {
    public static void countingSort(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i< nums.length;i++){
            largest = Math.max(largest,nums[i]);
        }
        int[] count = new int[largest+1];
        for(int i = 0;i< nums.length;i++){
            count[nums[i]]++;
        }
        int j = 0;
        for(int i = 0;i<count.length;i++){
            while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printSort(int[] nums){
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,8,3,4,7,2,9};
        System.out.println("Before Sorting");
        printSort(nums);
        System.out.println("After Counting Sort");
        countingSort(nums);
        printSort(nums);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
