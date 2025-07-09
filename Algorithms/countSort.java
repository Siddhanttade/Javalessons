import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class countSort {
    public static void algo(int[] arr){
        if (arr==null||arr.length<=1) {
            return;
        }
        int max=arr[0];
        for (int num : arr) {
            if (num>max) {
                max=num; 
            }
        }
        int[] countArray=new int[max+1];
        //freq arr
        for(int num:arr){
            countArray[num]++;
        }
        int index=0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i]>0) {
                arr[index]=i;
                index++;
                countArray[i]--;
            }
        }
    }
    //using hashmap
    public static void algoHash(int[] arr){
        if (arr==null||arr.length<=1) {
            return;
        }
        int max=Arrays.stream(arr).max().getAsInt();//shortcut to get max item
        int min=Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }

        int index=0;
        for (int i = min; i <=max; i++) {
            int count=countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index]=i;
                index++;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,7,3,5,7,2};
        algo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
