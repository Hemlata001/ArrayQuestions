package Array2D;
import java.util.*;
public class SearchSortedMatrix {
    public static int[][] searchSortedMatrix(int[][] matrix,int target){
        int n = matrix.length;
        if (n == 0) {
            return null;
        }
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j] == target){
                   return new int[][] {{i,j}};
                }

            }
        }
        return null;
    }
    public static void main(String[] args){
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int[][] result = searchSortedMatrix(matrix, 37);

        if (result != null) {
            System.out.println("Target found at: " + Arrays.deepToString(result));
        } else {
            System.out.println("Target not found.");
        }
    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)

/*
Arrays.deepToString(result) is a useful method in Java for converting multi-dimensional arrays into a readable string format.
It recursively processes arrays and constructs a string representation,
which is particularly handy for debugging or displaying the contents of complex data structures.
*/

/*
Arrays.deepToString(): This method is designed to handle arrays of arrays.
It converts each element of the array into its string representation and formats it into a human-readable string.
This is particularly useful for multi-dimensional arrays like int[][].
 */
