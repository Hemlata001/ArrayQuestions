import java.util.*;
public class PrintSubarray {
    public static void printSubarray(int[] nums){
        int n = nums.length;
        int totalpairs = 0;
        for(int i = 0;i<n;i++){
            int start = i;
            for(int j = i+1;j<n;j++){
                int end = j;
                for(int k = start ; k<end;k++){
                    System.out.print(nums[k]+" ");
                    totalpairs++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+ totalpairs);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        printSubarray(nums);
    }
}

// Time Complexity : O(n^3)
// Space Complexity : O(1)
