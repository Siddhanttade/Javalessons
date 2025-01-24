import java.util.*;

public class Questions1{
    //#1QUESTION TO FIND MIN VAL

    // public static void main(String[] args) {
    //     int[] arr={12,2,3,45,67,89,1,4,5};
    //     System.out.println(minVal(arr));
    // }

    // public static int minVal(int[] arr){
    //     int min=arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if(arr[i]<min){
    //             min=arr[i];
    //         }
    //     }
    //     return min;
    // }

    //2QUESTION TO SEARCH IN 2D ARRAY
    // public static void main(String[] args) {
    //     int[][] Array={     //here this can also be written as int[][] Array=new int[][]{} but it is considered by default
    //         {12,13,4},
    //         {5,23,16,7},
    //         {1,2,23,9}
    //     };
    //     int target=5;
    //     int[] ans=search(Array,target);
    //     System.out.println(Arrays.toString(ans));
    // }
    // public static int[] search(int[][]Array,int target){
    //     for (int i = 0; i < Array.length; i++) {
    //         for (int j = 0; j < Array[i].length; j++) {
    //             if(Array[i][j]==target){
    //                 return new int[]{i,j};              //here we need to initalize and declare as well because if we write return new {i,j} it doesnt make sense
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    //QUESTION3 MAX IN 2D ARRAY
//     public static void main(String[] args) {
//         int[][] arr={
//             {12,3,2,78},
//             {45,6,7},
//             {1,2,11,4}
//         };
//         System.out.println(maxVal(arr));
//     }

//     public static int maxVal(int[][] arr){
//         int max=Integer.MIN_VALUE;      //MIN_VALUE=> the lowest value possesed by integer
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if(arr[i][j]>max){
//                     max=arr[i][j];
//                 }
                
//             }
//         }
//         return max;
//     }

// }

    //QUESTION4 GIVEN AN ARRAY OF NUM FIND OUT the numbers containing even no of digit
    // public static void main(String[] args){
    //     int[] arr={12,345,2,6,7896};
    //     System.out.println(evenDigits(arr));
    // }
    
    // public static int evenDigits(int[] arr){
    //     int count=0;
    //     for (int num : arr) {
    //         if(checker(num)){
    //             count++; 
    //         }
            
    //     }
    //     return count;
    // }

    // //function to check whether no contains even or not
    // public static boolean checker(int num){
    //     int numcheck=counter(num);
    //     if(numcheck%2==0){
    //         return true;
    //     }
    //     return false;
    // }

    // //function to count numbers
    // public static int counter(int num){
    //     if(num<0){
    //         num=num*-1;
    //     }
    //     if(num==0){
    //         return 1;
    //     }
    //     int count=0;
    //     while(num>0){
    //         count++; 
    //         num=num/10;
    //     }
    //     return count;
    // }

    // //shortcut digit counter
    // public static int scounter(int num){
    //     if(num<0){
    //         num=num*-1;
    //     }
    //     return (int)(Math.log10(num))+1;
    // }

    //QUESTION5 RICHEST CUSTOMER PROBLEM
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        System.out.println(maxWealth(arr));
    }

    public static int maxWealth(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
               sum+=arr[i][j]; 
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
