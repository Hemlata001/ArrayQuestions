package Array2D;
import java.util.Scanner;
public class Creation {
    public static void main(String[] args) {
        // Input
        System.out.println("Input : ");
        int[][] matrix = new int[3][3];
        int n = matrix.length; // Row
        int m = matrix[0].length; //Column
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output : ");
        // Output
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
