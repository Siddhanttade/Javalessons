import java.util.Arrays;

public class selectionSort{
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max item in remaining array and swap to correct position
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swapArray(arr, maxIndex,last );
        }
    }

    public static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    public static void swapArray(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}