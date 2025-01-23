import java.util.*;

public class Questions11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,18,7};
        // swap(arr,1,4);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(max(arr));
        // System.out.println(maxRange(arr,1,5));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //swapping

    public static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


    // max element

    public static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;       
    }

    //max element in a range

    //work on edge cases like array being null
    public static int maxRange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal=arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;

        }
    }
}
