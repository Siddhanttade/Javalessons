import java.util.*;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={-18,-16,0,2,4,6,25,46,50};
        int target=4;
        int ans=autoOrdered(arr, target);
        System.out.println(ans);
        int[] arr2={10,9,8,7,6,5,4,3,2,1,0};
        int target2=5;
        int ans2=autoOrdered(arr2, target2);
        System.out.println(ans2);
    }

    public static int autoOrdered(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==mid){
                return mid;
            }
            if(isAsc=true){
                if(mid>target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if(mid<target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            
        }
        return -1;
    }
}

//time complexity is the same becoz if-else loop is present
