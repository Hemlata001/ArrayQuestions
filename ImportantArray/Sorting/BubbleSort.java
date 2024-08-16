package Sorting;
import java.util.Scanner;

public class BubbleSort
{
    public static void bubble(int[] nums){
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] nums){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,6,3,7,2,9,8};
        System.out.println("Array -> ");
        printArray(nums);
        System.out.println("After Bubble Sort ->");
        bubble(nums);
        printArray(nums);

    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
