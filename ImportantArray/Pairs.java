import java.util.*;
public class Pairs
{
    public static void pairs(int[] nums){
        int n = nums.length;
        int totalPairs = 0;
        for(int i = 0;i<n;i++){
            int cur = nums[i];
            for(int j = i+1;j<n;j++){
                System.out.print("(" + cur + "," + nums[j] +")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+totalPairs);
    }
    public static void printArr(int[] nums){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        System.out.println("Array");
        printArr(nums);
        System.out.println("Total pairs");
        pairs(nums);


    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)
