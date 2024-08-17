package Sorting;
import java.util.Scanner;
public class SelectionSort
{
    public static void selection(int[] nums){
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            int minPos = i;
            for(int j = i+1;j<n-1;j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
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
        System.out.println("After Selection Sort -> ");
        selection(nums);
        printSort(nums);

    }

}
// Time Complexity : O(n^2)
// Space Complexity : O(1)
