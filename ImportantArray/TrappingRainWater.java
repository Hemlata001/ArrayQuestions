import java.util.*;
public class TrappingRainWater {
    // maxLeft
    // maxRight
    // waterLevel
    // trappedRainWater
    public static int trapped(int[] height,int width){
        int n = height.length;
        //maxLeft
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i = 1;i<n;i++){
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
        }
        //maxRight
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            maxRight[i] = Math.max(height[i],maxRight[i+1]);
        }
        // concept
        int trappedWater = 0;
        for(int i = 0;i<n;i++){
            int waterLevel = Math.min(maxLeft[i],maxRight[i]);
            int waterAtCurrentIndex = waterLevel - height[i];
            trappedWater += waterAtCurrentIndex * width;

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trapped(height,2));
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
