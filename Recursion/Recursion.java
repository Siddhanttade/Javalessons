public class Recursion{
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 num:1,2,3,4,5

        // print(1);
        // System.out.println(fibo(6));
        int[] arr={1,2,3,4,55,66,78};
        int target=55;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    // public static void print1(int n){
    //     System.out.println(n);
    //     print2(2);
    // }

    // public static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    // }

    // public static void print3(int n){
    //     System.out.println(n);
    //     print4(4);
    // }

    // public static void print4(int n){
    //     System.out.println(n);
    //     print5(5);
    // }

    // //function body changes here
    // public static void print5(int n){
    //     System.out.println(n);
    // }

    public static void print(int n){
        //this is the base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        //we are calling same function
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again, you can treat it as a seperate call in stack
        print(n+1);
    }

    //Question:find nth fibonacci number using recursion
    public static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    //Question:Binary Search
    public static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        
        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }

        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }

}
