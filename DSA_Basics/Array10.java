import java.util.*;

public class Array10 {
    public static void main(String[] args) {
//Arrays of primitives

        // int[] rnos;//declaration of array rnos getting defined in stack
        // rnos=new int[5];//initialization of array new object is created

        // int[] players=new int[11];
        Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=25;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
        
        System.out.println(arr[3]);

        //input using for-loop;
        for (int i = 0; i<arr.length; i++) {
            arr[i]=in.nextInt();
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        //using enhanced foreach loop
        for (int i : arr) {//for every ele in array,print ele
            System.out.println(i);//i represents ele of arr
        }

        System.out.println(Arrays.toString(arr)); //these were the different ways to get array

//Arrays of objects
        String[] str=new String[5];
        for (int j = 0; j < str.length; j++) {
            str[j]=in.next();
        }
        
        System.out.println(Arrays.toString(str));

    }
}
