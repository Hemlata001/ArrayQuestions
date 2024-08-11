import java.util.*;
public class Reverse {
    public static void reverse(int[] num){
        int n = num.length;
        int first = 0;
        int last = n-1;
        while(first<last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
        }
    }
    public static void printArr(int[] num){
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        System.out.println("Actual Array");
        printArr(num);
        System.out.println("Reverse Array");
        reverse(num);
        printArr(num);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
