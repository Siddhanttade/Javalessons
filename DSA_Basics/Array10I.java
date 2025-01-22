import java.util.*;
public class Array10I {
    public static void main(String[] args) {
        
       // int arr[][]=new int[3][3];//writing the row is necessary whereas column isnt that important
    //    int arr[][]={
    //     {1,2,3},//0th index
    //     {3,4},//1st index
    //     {2,5,6,7}//2nd index->arr[2]={6,7,8,9}
    //    }; 
       Scanner in=new Scanner(System.in);
       int[][] arr=new int[3][3];
       System.out.println(arr.length);//->answer is 3 //no of rows

       //input
        for (int row = 0; row < arr.length; row++) {
            //for every column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }

        //output
        // for (int row = 0; row < arr.length; row++) {
        //     //for every column
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col]); 
        //     }
        //     System.out.println();
        // }

        //ouptut m2
        // for (int row = 0; row < arr.length; row++) {
        //     //for every column
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //output m3
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
