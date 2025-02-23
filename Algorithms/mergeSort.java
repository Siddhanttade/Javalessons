import java.util.Arrays;

public class mergeSort{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        // arr=merSort(arr);
        // System.out.println(Arrays.toString(arr));
        merSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));      
    }

    // public static int[] merSort(int[] arr){
    //     if(arr.length==1){
    //         return arr;
    //     }

    //     int mid=arr.length/2;

    //     //this Arrays.copyOfRange gives a copy of array between that range, in this original array is not changed
    //     //new object is being created for every function call original array not modified
    //     int[] left=merSort(Arrays.copyOfRange(arr, 0, mid));
    //     int[] right=merSort(Arrays.copyOfRange(arr, mid, arr.length));
    //     return merge(left,right);
    // }

    // //for merging the arrays
    // private static int[] merge(int[] first,int[] second){
    //     int[] mix=new int[first.length+second.length];

    //     //now taking the pointers for all the three arrays
    //     int i=0;
    //     int j=0;
    //     int k=0;

    //     while(i<first.length&&j<second.length){
    //         if(first[i]<second[j]){
    //             mix[k]=first[i];
    //             i++;
    //         }else{
    //             mix[k]=second[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     //it may be possible that one of the array is unfinished so put all the remaining items in the array
    //     //copy the remaining elements

    //     while(i<first.length){
    //         mix[k]=first[i];
    //         i++;
    //         k++;
    //     }

    //     while(j<second.length){
    //         mix[k]=second[i];
    //         j++;
    //         k++;
    //     }

    //     return mix;
    // }

    public static void merSortInPlace(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }

        int mid=(s+e)/2;

        merSortInPlace(arr, s, mid);
        merSortInPlace(arr, mid, e);
        mergeInPlace(arr,s,mid,e);
    }

    //for merging the arrays
    private static void mergeInPlace(int[] arr,int s,int m,int e){
        int[] mix=new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k]=arr[i];
            j++;
            k++;
        }
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s+k2]=mix[k2];
        }
    }
}