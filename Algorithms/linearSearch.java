package Algorithms;

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] nums={16,5,4,67,8,920,23};
        System.out.println("enter target");
        int target=in.nextInt();
        int ans= linearSearch(nums,target);
        System.out.println(ans);
        boolean ans1=linearSearch2(nums,target);
        System.out.println(ans1);
        int ans3=linearSearch3(nums, target, 1, 4);
        System.out.println(ans3);
        String name="siddhant";
        char target1='i';
        System.out.println(search(name,target1));
        
    }

    //search in the array return the ele if found and return -1 if not found
    public static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for every ele whether it is equal to target
            int element=arr[index];
            if(element==target){
                return index;
            }
            }
        return -1;
        }
    

    //search the target and return true or false
    public static boolean linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for every ele whether it is equal to target
            int element=arr[index];
            if(element==target){
                return true;
            }
            }
        return false;
        }
        public static boolean search(String name,char target1){
            if(name.length()==0){
                return false;
            }
            for (int i = 0; i < name.length(); i++) {
                if(target1==name.charAt(i));
                return true;
            }
            return false;
        }
        
        //searching in particular range
        public static int linearSearch3(int[] arr,int target,int start,int end){
            if(arr.length==0){
                return -1;
            }
            for (int index = start; index <=end; index++) {
                //check for every ele whether it is equal to target
                int element=arr[index];
                if(element==target){
                    return index;
                }
                }
            return -1;
            }
        
    }

