import java.util.Arrays;
import java.util.Scanner;
public class TwoSum
{
    public static int[] twoSum(int[] arr, int key){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j]==key){
                    int[] c = {i,j};
                    return c;
                }
            }
        }
        return null;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 6;
        TwoSum two = new TwoSum();
        int[] result = two.twoSum(arr, key);
        System.out.println("Two Sum of an Array is : " + Arrays.toString(result));


    }
}
