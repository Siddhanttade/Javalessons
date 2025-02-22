package Recursion;

import java.util.ArrayList;

public class ProblemsII {
    //QUESTION1:FIND WHETHER THE ARRAY IS SORTED OR NOT
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5,6,7,8};
    //     System.out.println(sorted(arr,0));
    // }

    // public static boolean sorted(int[] arr,int index){
    //     //arr function call is pointing towards the same object i.e why if the bove arr modified it would be modified for every call
    //     //base condition
    //     if(index==arr.length-1){
    //         return true;
    //     }
    //     return arr[index]<arr[index+1] && sorted(arr, index+1);

    // }
    // QUESTION2:LINEAR SEARCH

    // public static void main(String[] args) {
    //     int[] arr={1,2,8,4,6,7,3};
    //     int[] arr1={1,28,4,6,7,3,3,21};
    //     System.out.println(find(arr,8,0));
    //     System.out.println(findIndex(arr, 8, 0));
    //     System.out.println(findIndexLast(arr, 8, arr.length-1));
    //     System.out.println(findIndexLast(arr1, 3, arr.length-1));
    //     // findAllIndex(arr1, 3, 0);    //here nothing is being returned thus after making function call we can directly print the list
    //     // System.out.println(list);
    //     //here we need to take seperate variable because we are getting a retun value
    //     ArrayList<Integer> ans=findAllIndexList(arr1, 3, 0, new ArrayList<>());
    //     System.out.println(ans);
    //     //both the syntax above and below are same
    //     ArrayList<Integer> list=new ArrayList<>();
    //     ArrayList<Integer> ans0=findAllIndexList(arr1, 3, 0, list);
    //     System.out.println(ans0);
        
    // }

    // public static boolean find(int[] arr,int target,int index){
    //     if(index==arr.length){
    //         return false;
    //     }
    //     return arr[index]==target||find(arr, target, index+1);
    // }

    // public static int findIndex(int[] arr,int target,int index){
    //     if(index==arr.length){
    //         return -1;
    //     }
    //     if(arr[index]==target){
    //         return index;
    //     }
    //     else{
    //         return findIndex(arr, target, index+1);
    //     }
    // }

    // public static int findIndexLast(int[] arr,int target,int index){
    //     if(index==-1){
    //         return -1;
    //     }
    //     if(arr[index]==target){
    //         return index;
    //     }
    //     else{
    //         return findIndexLast(arr, target, index-1);
    //     }
    // }
    
    // //QUESTION3:FOR RETURNING MULTIPLE OCCURENCES
    // static ArrayList<Integer> list=new ArrayList<>();
    // public static void findAllIndex(int[] arr,int target,int index){
    //     if(index==arr.length){
    //         return;
    //     }
    //     if(arr[index]==target){
    //         list.add(index);
    //     }
    //     findAllIndex(arr, target, index+1);
    // }

    // //QUESTION4:RETURNING AN ARRAYLIST(PREFFERED)
    // //TAKING ARRAYLIST AS AN ARGUMENT
    // public static ArrayList<Integer> findAllIndexList(int[] arr,int target,int index,ArrayList<Integer> list){
    //     if(index==arr.length){   //here the list represent same name but different ref var at diff function call all of them pointing to same obj
    //         return list;
    //     }
    //     if(arr[index]==target){
    //         list.add(index);
    //     }
    //     return findAllIndexList(arr, target, index+1,list);
    // }

    //QUESTION5:RETURNING ARRAYLIST WITHOUT TAKING IT AS AN ARGUMENT(IMPORTANT)
    // public static void main(String[] args) {
    //     int[] arr2={1,2,3,4,5,4,6};
    //     System.out.println(findAllIndexList2(arr2, 4, 0));
    // }
    // public static ArrayList<Integer> findAllIndexList2(int[] arr,int target,int index){
    //     ArrayList<Integer> list=new ArrayList<>();
    //     if(index==arr.length){   
    //         return list;
    //     }

    //     //this contains answer for that function call only

    //     if(arr[index]==target){
    //         list.add(index);
    //     }
    //     ArrayList<Integer> ansFromBelowCalls= findAllIndexList2(arr, target, index+1);

    //     list.addAll(ansFromBelowCalls);
    //     return list;
    // }

    //QUESTION6:ROTATED BINARY SEARCH
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m; // Return index, not the target itself
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1); // Fixed missing return
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        } else {
            return search(arr, target, s, m - 1);
        }
    }
    
}
