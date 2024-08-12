import java.util.*;
public class MaxSubarraySum_KadanesAlgo {
    public static void kadanes(int[] nums){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            currentSum = currentSum + nums[i];
            if(currentSum<0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("our max Subarray sum is : " + maxSum);
    }

    public static void printArr(int[] nums){
        for(int i = 0;i< nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println("Array-");
        printArr(nums);
        System.out.println("Kadanes Algorithm-");
        kadanes(nums);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
