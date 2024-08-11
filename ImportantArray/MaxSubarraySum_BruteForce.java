import java.util.*;
public class MaxSubarraySum_BruteForce {
    public static void maxSubSum(int[] num){
        int n = num.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int start = i;
            for(int j = i+1;j<n;j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<end;k++){
                    currSum+=num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        maxSubSum(num);
    }
}

// Time Complexity : O(n^3)
// Space Complexity : O(1)
