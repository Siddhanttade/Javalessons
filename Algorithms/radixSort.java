package Algorithms;

import java.util.Arrays;

class radixSort {

    public static void algo(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        //do count sort for every digit place 
        for (int exp = 1;max/exp>0; exp*=10) {
            countSort(arr,exp);
        }
    }

    private static void countSort(int[] arr,int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];

        Arrays.fill(count, 0);

        
        for (int i = 0; i < n; i++) {
            count[(arr[i]/exp)%10]++; //getting the single ele
        }
        System.out.println("count arr for"+exp+":"+Arrays.toString(count));
        for (int i = 1; i < 10; i++) {
            count[i]=count[i]+count[i-1];
        }
        System.out.println("Updated count"+Arrays.toString(count));

        for (int i = n-1; i >=0; i--) {
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }

        System.out.println("output arr"+Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, n);
        
    }
    public static void main(String[] args) {
        int[] arr={29,83,471,36,91,8};
        System.out.println("og arr:"+Arrays.toString(arr));
        algo(arr);
        System.out.println("sorted arr:"+Arrays.toString(arr));
    }
// The time complexity of your radix sort implementation is:

// O(d × (n + b))
// Where:

// n = number of elements in the array
// d = number of digits in the maximum number (i.e., d = log_b(max) where b is the base, here 10)
// b = base of the number system (for decimal, b = 10)
// Breakdown:
// Outer loop (for (int exp = 1; max/exp > 0; exp *= 10))

// Runs for each digit position (d times, where d is the number of digits in the largest number).
// Inner count sort (per digit)

// Counting occurrences: O(n)
// Prefix sum: O(b) (here, b = 10)
// Output placement: O(n)
// Copy back: O(n)
// Total per digit: O(n + b)
// Total

// O(d × (n + b))


    
}