package Array2D;
import java.util.*;
public class StaircaseSearch
{
    // Case 1 = 40 -> (0,m-1)
    // Case 2 = 32 -> (n-1,0)
    public static boolean staircaseSearchCase1(int[][] matrix,int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        //int[][] result = staircaseSearch(matrix,33);
        //System.out.println(result);
        System.out.println("Staircase Search : " + staircaseSearchCase1(matrix,33));
}
}
// Time Complexity : O(n+m)
// n = row;
// m = col;
// Space Complexity : O(1)
