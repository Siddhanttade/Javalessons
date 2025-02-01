public class Patterns{
    public static void main(String[] args) {
        // pattern2(4);
        // pattern1(4);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern3(4);
        // pattern6(4);
        // pattern28(5);
        // pattern30(5);
        // pattern17(5);
        // pattern31(4);
        pattern32(4);
    }
    //names of function according to kunal kushwaha assignment
    public static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            //for every row,run column
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            //when one row printed ,add newline
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for (int row = 1; row<=n; row++) {
           for (int col = 1; col<=n ; col++) {
            System.out.print("*");
           } 
           System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 1; row<=n; row++) {
           for (int col = 1; col<=n-row+1 ; col++) {
            System.out.print("*");
           } 
           System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            //for every row,run column
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            //when one row printed ,add newline
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int row = 1; row <=n; row++) {
            //for every row,run column
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            //when one row printed ,add newline
            System.out.println();
        }
    }

    public static void pattern6(int n){     //alternate way to write the problem above
        for (int row = 0; row < 2*n; row++) {
            int totColInRows=row>n?2*n-row:row;
            for (int col = 0; col <totColInRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n){
        for (int row = 1; row <=n; row++) {
            for(int space=0;space<n-row;space++){
                System.out.print("  ");
            }

            for (int col = row; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for (int row = 1; row <=2*n; row++) {

            int c = row > n ? 2 * n - row: row;

            for(int space=0;space<n-c;space++){
                System.out.print("  ");
            }

            for (int col = c; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    //Different pattern
    public static void pattern31(int n){
        n=2*n;//only for loops
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    public static void pattern32(int n){
        int originalN=n;
        n=2*n;//only for loops
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    
}