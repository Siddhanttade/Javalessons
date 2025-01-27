import java.util.Arrays;

public class bubbleSort{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than previous item
                if(arr[j]<arr[j-1]){
                    //swap 
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you did'nt swap for particular i value in the program then break
            if(swapped=false){
                break;
            }
        }
    }
}