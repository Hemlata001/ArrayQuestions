import java.util.Scanner;
public class RotationArray
{
    public static void reverse(int[] arr,int start,int end){
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void PrintArray(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println("Array");
        PrintArray(arr);
        System.out.println("Reverse of whole Array");
        reverse(arr,0,arr.length-1);
        PrintArray(arr);
        System.out.println("Reverse of starting k element");
        reverse(arr,0,k-1);
        PrintArray(arr);
        System.out.println("Reverse the elements after k elements");
        reverse(arr,k,arr.length-1);
        PrintArray(arr);


    }
}


