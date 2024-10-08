import java.util.*;
public class BinarySearch
{
    public static int binarySearch(int[] num,int key){
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(num[mid]==key){
                return mid;
            } else if (num[mid]>key) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(num,5));
    }
}

// Time complexity : O(nlogn)
// Space complexity : O(1)
