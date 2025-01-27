import java.util.*;

public class Questions2{
    // QUESTION 1: CEILING OF GIVEN NUMBER(CEILING=>SMALLEST ELE GREATER THAN OR EQUAL TO)
    // public static void main(String[] args) {
    //     int[] arr={2,3,5,9,14,16,18};//here if the target element=14 ceiling=14 if target ele=15 ceiling=16
    //     int target=15;
    //     int ans=ceiling(arr,target);
    //     System.out.println(ans);
    // }
    // public static int ceiling(int[] arr,int target){
    //     int start=0;
    //     int end=arr.length-1;

    //     //if the target is greater than the last element of array 
    //     if(target>arr[arr.length-1]){
    //         return -1;
    //     }
    //     while(start<end){       
    //         int mid=start+(end -start)/2;
    //         if(mid>target){
    //             end=mid-1;
    //         }else if(mid<target){
    //             start=mid+1;
    //         }else{
    //             return mid;
    //         }         
    //     }
    //     return start; //because  answer doesnt lie between start and end ,when while loop breaks start=end+1 thus next big ele when no ans found=start element
    //     //start target end after applying the above condition end target start and start becomes the answer
    // }

    //  QUESTION 2:FLOOR(GREATEST NUMBER SMALLER THAN OR EQUAL TO TARGET)
    //similar to above logic but return end instead because start target end and using above reference end target start thus the floor will be the end element 

    //QUESTION 3:SMALLEST LETTER GREATER THAN TARGET LETTERS WRAP AROUND  IF TARGET=Z AND LETTERS=[A,B] THEN ANSWER IS A
//     public static void main(String[] args) {
//         char[] arr={'c','f','j'};
//         char target='a';
//         char ans=smallest(arr, target);
//         System.out.println(ans);
//     }

//     public static char smallest(char[] arr,char target){
//         int start=0;
//         int end=arr.length-1;

//         while(start<end){
//             int mid=start+(end -start)/2;
//             if(target<arr[mid]){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }       //here we want smallest ele greater than target thus we've not taken condition for mid
//         }
//         return arr[start%arr.length];    
//     }
//     //returning the ele at the given index and we have written it in suach a way because if in the above array we want wrap around for 'j' so j is at start would get shifted forward [0,1,2],3 3 would be start and 3%3=0 so it would go to c which is the wrap around
// };

    //QUESTION4:FIND THE FIRST AND LAST POSITION OF ELE IN SORTED ARRAY
    //find starting and ending position of given target  input=>nums=[5,7,7,8,8,10] target=8 output=[3,4]
    // public static void main(String[] args) {
    //     int[] nums={5,7,7,8,8,10};
    //     int target=8;
    //     System.out.println(Arrays.toString(finder(nums,target)));
    // }

    // public static int[] finder(int nums[],int target){
    //     int[] ans={-1,-1};
    //     //check for the first occurence of target
    //     ans[0]=search(nums,target,true);
    //     if(ans[0]!=-1){
    //         ans[1]=search(nums,target,false);
    //     } 
    //     return ans;
    // }
    // //function for retuning the index value of target
    // public static int search(int[] nums,int target,boolean findStartIndex){
    //     int start=0;
    //     int end=nums.length-1;
    //     int ans=-1;
        

    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(nums[mid]>target){
    //             end=mid-1;
    //         }else if(nums[mid]<target){
    //             start=mid+1;
    //         }else{
    //             //potential ans found 
    //             ans =mid;
    //             if(findStartIndex){     //findStartIndex is itself boolean expression
    //                 end=mid-1;
    //             }else{
    //                 start=mid+1;
    //             }

    //         }
    //     }
    //     return ans;
    // }
    // }

//     //QUESTION 5:FIND THE POSITION OF AN ELEMENT IN A SORTED NUMBER OF INFINITE ARRAY
//     public static void main(String[] args) {
//         int[] arr={3,5,7,9,10,90,100,130,140,160,170};
//         int target=10;
//         System.out.println(ans(arr, target));
//     }
//     public static int ans(int arr[],int target){
//         //first find a range
//         //first start with a box of size 2
//         int start=0;
//         int end=1;

//         //condition for target to lie in range 
//         while(target>arr[end]){
//             int temp=end+1; ///this is the newStart
//             //end=(prev end+size of box)*2
//             end=end+(end-start+1)*2; //end minus start plus 1 indicate the size of box
//             start=temp; //we've taken newStart because we can't use it before updating end
//         }
//         return binarySearch(arr, target, start, end);
//     }
//     public static int binarySearch(int[] arr,int target,int start,int end){

//             while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]>target){    //in this case we need to write arr[mid] because we are comparing with the element present at that place in the array
//                 end=mid-1;
//             }else if(arr[mid]<target){
//                 start=mid+1;
//             }else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }

    //QUESTION6:PEAK INDEX IN A MOUNTAIN ARRAY/BITONIC ARRAY (AN ARRAY IN WHICH 1ST INCREASING ELE AND THEN DECREASING)
    // public static void main(String[] args) {
    //     int[] arr={1,2,4,6,5,3};
    //     System.out.println(peakInMountainArray(arr));
    // }

    // public static int peakInMountainArray(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<end){
    //         int mid=start+(end-start)/2;
    //         if(arr[mid]> arr[mid+1]){
    //             //you are in dec part of array
    //             //this can be ans but look at left
    //             //thus end!=mid-1
    //             end=mid;
    //         }else{
    //             //you are in inc part
    //             start=mid+1;//since mid+1>mid
    //         }
    //     }
    //     //in the end start ==end and both point to largest num because of above two condition
    //     //start and end always trying to maximize due to above two checks
    //     //hence when they are pointing towards one element it is the maximum one
    //     //at every point of start and end ,they have the best ans till that time
    //     //and if we are saying only one item remaining,due to above line it is max
    //     return start;
    // }

    //QUESTION7:FIND TARGET ELE IN MOUNTAIN ARRAY
    // public static void main(String[] args) {
    //     int[] arr={1,2,4,6,5,3};
    //     System.out.println(search);
    // }

    // public static int search(int[] arr,int target){
    //     int peak=peakInMountainArray(arr);
    //     int firstTry=orderAgnosticBS(arr,target,0,peak);
    //     if(firstTry!=-1){
    //         return firstTry;
    //     }
    //     return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    // }

    // //QUESTION8:SEARCH IN A ROTATED SORTED ARRAY
    // public static void main(String[] args) {
    //     int[] arr={4,5,6,7,0,1,2};
    //     int target=6;
    //     System.out.println(search(arr, target));
    //     System.out.println(findPivot(arr));
    //     System.out.println(countRotation(arr));

    // }

    // public static int search(int[] arr,int target){
    //     int pivot=findPivot(arr);

    //     //if pivot not found,it means array not rotated
    //     if(pivot==-1){
    //         //just do normal bs
    //         return binSearch(arr, target, 0, arr.length-1);
    //     }

    //     //case1:
    //     //if pivot found two asc array found
    //     if(arr[pivot]==target){
    //         return pivot;
    //     }
    //     //case2:
    //     if(arr[0]<=target){
    //         return binSearch(arr, target, 0, pivot-1);
    //     }
    //     return binSearch(arr, target, pivot+1, arr.length-1);

    // }

    // public static int binSearch(int[] arr,int target,int start,int end){
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(arr[mid]>target){
    //             end=mid-1;
    //         }else if(arr[mid]<target){
    //             start=mid+1;
    //         }else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

    // public static int findPivot(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;

    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         //case1:
    //         if(mid<end && arr[mid+1]<arr[mid]){
    //             return mid;
    //         }
    //         //case2:
    //         if(mid>start && arr[mid-1]>arr[mid]){
    //             return mid-1;
    //         }
    //         //case3:
    //         if(arr[mid]<=arr[start]){
    //             end=mid-1;
    //         }
    //         //case 4
    //         else{
    //             start=mid+1;
    //         }
    //     }
    //     return -1;
    // }

    // //QUESTION 9 FINDING PIVOT WITHOUT DUPLICATE
    // public static int findPivotWoDuplicate(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;

    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         //case1:
    //         if(mid<end && arr[mid+1]<arr[mid]){
    //             return mid;
    //         }
    //         //case2:
    //         if(mid>start && arr[mid-1]>arr[mid]){
    //             return mid-1;
    //         }
    //         //for skipping duplicates(if middle,start and end element are the same)
    //         if(arr[mid]==arr[start] && arr[mid]==arr[end]){
    //             //if start is the pivot
    //             if(arr[start]>arr[start+1]){
    //                 return start;
    //             }
    //             start++;
    //             //if end is the pivot
    //             if(arr[end]<arr[end-1]){
    //                 return end-1;
    //             }
    //             end--; 
    //         }
    //         //left side is sorted ,so pivot in right
    //         else if(arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[end])){
    //             start=mid+1;
    //         }
    //         else{
    //             end=mid-1 ;
    //         }
    //     }
    //     return -1;
    // }

    // //QUESTION10:FIND THE ROTATION COUNT
    // public static int countRotation(int[] arr){
    //     int pivot=findPivot(arr);
    //     // if(pivot==-1){    this condition is not necessary because -1+1=0
    //     //     return 0;
    //     // }
    //     return pivot+1; 
    // }

    //***very good QUESTION11:SPLIT ARRAY LARGEST SUM(ARRAY CONSIST OF POSITIVE INT AND AN INT M,YOU CAN SPLIT ARRAY INTO M NON-EMPTY CONTINUOS SUBARRAY)

    public static void main(String[] args) {
        int[] arr={7,2,5,8,10};
        int m=2;
        System.out.println(splitArray(arr, m));
    }

    public static int splitArray(int[] nums,int m){
        int start=0;
        int end=0;

        for (int index = 0; index < nums.length; index++) {
            start=Math.max(start,nums[index]);//has the maximum integer value in array
            end=end+nums[index];
        }

        //binary search
        while(start<end){
            //try for mid as potential ans
            int mid=start+(end-start)/2;
            //calc how many pieces you can divide in with this max sum
            int sum=0;
            int pieces=1;
            
            for (int num : nums) {
                if(sum+num>mid){
                    //you can't add this in this subarray,make new one
                    //say you add this num in new subarray,then sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum=sum+num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end; //here start==end 
    }
}

