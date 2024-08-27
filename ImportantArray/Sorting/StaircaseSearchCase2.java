package Array2D;
import java.util.*;
public class StaircaseSearchCase2
{
    // Case 1 = 40 -> (0,m-1)
    // Case 2 = 32 -> (n-1,0)
    public static boolean staircaseSearchCase2(int[][] matrix,int key){
        int row = matrix.length-1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Key is found at (" + row + ", " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println("Staircase Search : " + staircaseSearchCase2(matrix,30));
    }
}
// Time Complexity : O(n+m)
// n = row;
// m = col;
// Space Complexity : O(1)
