import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr={-18,-16,0,2,4,6,25,46,50};
        int target=4;
        int ans=binSearch(arr, target);
        System.out.println(ans);
    }

    public static int binSearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>target){
                end=mid-1;
            }else if(mid<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
