import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i <  n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int c = linearSearch(arr, 7);
        if (c == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("Linear Search : " + c);
        }
    }
}

// Time complexity : O(n)
//Space complexity : 0(1)
