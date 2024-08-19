package Array2D;
import java.util.Scanner;
public class Search {
    public static boolean search(int[][] matrix,int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0 ; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell (" + i + " ," + j + ")");
                    return true;
                }

            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Input: ");
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output : ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,4);
    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)