import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questions4{
    //QUESTION1:missing number
    // public static void main(String[] args) {
    //     int[] arr={3,0,2,1};
    //     System.out.println(sort(arr));  //here we wouldn't require Arrays.toString because returning only one number
    // }

    
    // public static int sort(int[] arr){
    //     int i=0;
    //     while(i<arr.length){
    //         int correct=arr[i];
    //         if(arr[i]<arr.length && arr[i]!=arr[correct]){
    //             swapArray(arr,i,correct);
    //         }else{
    //             i++;
    //         }
    //     }
    //     //search for first missing num
    //     for (int j = 0; j < arr.length; j++) {
    //         if(arr[j]!=j){
    //             return j;
    //         }
    //     }
    //     return arr.length; 
    // }

    // public static void swapArray(int[] arr,int first,int second){
    //     int temp=arr[first];
    //     arr[first]=arr[second];
    //     arr[second]=temp;
    // }

    //QUESTION2:FIND ALL NUMBERS DISAPPEARED IN ARRAY
   
    // public static void main(String[] args) {
    //     int[] arr = {4, 3, 2, 5, 6, 7, 8};
    //     System.out.println(findDisappearedNumbers(arr));
    // }

    // public static List<Integer> findDisappearedNumbers(int[] arr) {
    //     int i = 0;
    //     while (i < arr.length) {
    //         int correct = arr[i] - 1;
    //         if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
    //             swapArray(arr, i, correct);
    //         } else {
    //             i++;
    //         }
    //     }

        // Find missing numbers
    //     List<Integer> ans = new ArrayList<>();
    //     for (int index = 0; index < arr.length; index++) {
    //         if (arr[index] != index + 1) {
    //             ans.add(index + 1);
    //         }
    //     }
    //     return ans;
    // }

    // public static void swapArray(int[] arr, int first, int second) {
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }

    // //QUESTION3:FIND DUPLICATE
    // public static void main(String[] args) {
    //     int[] arr={1,4,3,2,2};
    //     sort(arr);
    //     System.out.println(sort(arr));
    // }

    // public static List<Integer> sort(int[] arr){
    //     int i=0;
    //     while(i<arr.length){
    //         int correct=arr[i]-1;
    //         if(arr[i]!=arr[correct]){
    //             swapArray(arr,i,correct);
    //         }else{
    //             i++;
    //         }
    //     }

    //     List<Integer> ans = new ArrayList<>();
    //     for (int index = 0; index < arr.length; index++) {
    //         if (arr[index] != index + 1) {
    //             ans.add(arr[index]);
    //         }
    //     }
    //     return ans;
    // }
    
    // public static void swapArray(int[] arr,int first,int second){
    //     int temp=arr[first];
    //     arr[first]=arr[second];
    //     arr[second]=temp;
    // }

    //QUESTION4:FIND ALL DUPLICATES IN AN ARRAY(don't stop by finding 1st duplicate)

//     public static void main(String[] args) {
//         int[] arr={4,3,2,7,8,2,3,1};
//         findDuplicate(arr);
//         System.out.println(findDuplicate(arr));
//     }

//     public static List <Integer> findDuplicate(int[] arr){
//             int i=0;
//             while(i<arr.length){
//                 int correct=arr[i]-1;
//                 if(arr[i]!=arr[correct]){
//                     swapArray(arr,i,correct);
//                 }else{
//                     i++;
//                 }
//         }

//         //for duplicates
//         List<Integer> ans = new ArrayList<>();
//         for (int index = 0; index < arr.length; index++) {
//             if (arr[index] != index + 1) {
//                 ans.add(arr[index]);
//             }
//         }
//         return ans;
//     }

//     public static void swapArray(int[] arr,int first,int second){
//         int temp=arr[first];
//         arr[first]=arr[second];
//         arr[second]=temp;
//     }
// }

//  QUESTION5:SET MISMATCH(one number gets repeated and this results in loss of other number)
//     public static void main(String[] args) {
//         int[] arr={2,2,4,5,1};
//         int[] answer=sort(arr);
//         System.out.println(Arrays.toString(answer));
//     }

//     public static int[] sort(int[] arr){
//         int i=0;
//         while(i<arr.length){
//             int correct=arr[i]-1;
//             if(arr[i]!=arr[correct]){
//                 swapArray(arr,i,correct);
//             }else{
//                 i++;
//             }
//         }
//         //search for first missing num
//         for (int j = 0; j < arr.length; j++) {
//             if(arr[j]!=j+1){
//                 return new int[]{arr[j],j+1};
//             }
//         }
//         return new int[]{-1,-1}; 
//     }

//     public static void swapArray(int[] arr,int first,int second){
//         int temp=arr[first];
//         arr[first]=arr[second];
//         arr[second]=temp;
//     }
// }

//  QUESTION6:FIRST MISSING POSITIVE VALUE (can be considered hard because it doesn't tells to use cyclic sort)
//start checking from 1
    public static void main(String[] args) {
        int[] arr={1,2,0};
        sort(arr);
        System.out.println(sort(arr));
    }

    public static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swapArray(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing num
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1; 
    }

    public static void swapArray(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}










