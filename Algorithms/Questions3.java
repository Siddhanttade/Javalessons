import java.util.Arrays;

public class Questions3 {
    // QUESTION1:ROW COLUMN MATRIX
    // public static void main(String[] args) {
    //     int[][] arr={
    //         {10,20,30,40},
    //         {15,25,35,45},
    //         {28,29,37,49},
    //         {33,34,38,50}
    //     };
    //     int target=37;
    //     // Use Arrays.toString to print the returned array
    //     System.out.println(Arrays.toString(search(arr, target)));
    // }

    // public static int[] search(int[][] matrix,int target){
    //      int r=0;
    //      int c=matrix.length-1;

    //      while(r<matrix.length && c>=0){
    //         if(matrix[r][c]==target){
    //             return new int[]{r,c};
    //         }
    //         if(matrix[r][c]<target){
    //             r++;
    //         }
    //         else{
    //             c--;
    //         }
    //      }
    //      return new int[] {-1,-1};
    // }

    //QUESTION2:SORTED MATRIX //***very good question for intuation
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=12;
        System.out.println(Arrays.toString(search(arr,target)));
        
    }

    //search in the row provided between col provided
    public static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int col=matrix[0].length;   //be cautious ,matrix maybe empty

        if(rows==1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=col/2;
        //run the loop till two row remains
        while(rStart<(rEnd-1)){//while this is true it will have more than two rows
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }
        //now we've 2 rows
        //check whether the target is in col of 2 rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //search in 1st half
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //in 2nd half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
            return binarySearch(matrix, rStart, cMid+1, col-1, target);
        }
        //3rd half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }
        //4th half
        else{
            return binarySearch(matrix, rStart+1, cMid+1, col-1, target);
        }

    }
