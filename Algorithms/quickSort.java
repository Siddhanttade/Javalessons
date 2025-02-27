package Algorithms;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        // sort(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);//dual pivot quicksort faster than conventional quick sort
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] nums,int low,int hi){
        //these above low and hi are the main ptr
        if(low>=hi){
            return;
        }
        //s and e would be used for swapping
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while(s<=e){
            //also a reason why if it is already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        //now pivot at corr index sort the other halves
        sort(nums, low, e);
        sort(nums, s, hi);
    }
    
}