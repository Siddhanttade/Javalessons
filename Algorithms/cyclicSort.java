import java.util.Arrays;

public class cyclicSort{
    public static void main(String[] args) {
        int[] arr={3,5,1,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swapArray(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void swapArray(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}