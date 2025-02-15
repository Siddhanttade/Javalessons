package Mathematics;
import java.util.*;
import java.util.Arrays;

public class Maths {
    //QUESTION1:GIVEN A NUM FIND IF IT IS ODD OR EVEN
    // public static void main(String[] args) {
    //     int n=67;                       //if the number is like 10011 then we need to check only for last num '1' because the other digits presnt befrore it would be multiple of 2 so if at last 1 is present then odd otherwise even(in binary form)
    //     System.out.println(isOdd(n));
    // }

    // public static boolean isOdd(int n){
    //     return (n & 1)==1;
    // }
    
    //QUESTION2:IN AN ARR EVERY NUM APPEARS TWICE ONLY ON ENUM APPEARS ONCE GIVE THAT NUM
    // public static void main(String[] args) {
    //     int[] arr={2,3,4,1,2,1,3,6,4};
    //     System.out.println(once(arr));
    // }

    // public static int once(int[] arr){
    //     int unique=0;
    //     for(int n:arr){
    //         unique^=n;
    //     }
    //     return unique;
    // }

    //QUESTION3:FIND iTH BIT OF A NUM
    //Concept of masking is used if num n is given mask with n-1 zeroes
    // public static int getIthBit(int num, int i) {
    //     int mask = 1 << i;
    //     return (num & mask) >> i;
    // }
    
    // public static void main(String[] args) {
    //     int num = 29; // Binary: 11101
    //     int i = 4;
    //     System.out.println("The " + i + "th bit of " + num + " is " + getIthBit(num, i));
    // }
    // Alternate
    // public static int getIthBit(int num, int i) {
    //     return (num & (1 << (i - 1))) != 0 ? 1 : 0;
    // }
    
    // public static void main(String[] args) {
    //     int num = 29; // Binary: 11101
    //     int i = 3;
    //     System.out.println("The " + i + "th bit of " + num + " is " + getIthBit(num, i));
    //     }
    // }

    //QUESTION4:SET THE iTH BIT
    //turn the bit=>if 0 is present convert to 1 and if 1 is present let it be 1
    //     public static int setIthBit(int num, int i) {
    //         return (num | (1 << (i - 1)));
    //     }
    
    //     public static void main(String[] args) {
    //         int num = 29; // Binary: 11101
    //         int i = 3;
    //         System.out.println("The number after setting" +i+"th bit is " + setIthBit(num, i));
    //     }
    // }

    //QUESTION5:RESET iTH BIT 
    //turn the bit=>if 0 is present let it be if 1 is present then convert it to 0
    // public static int resetIthBit(int num, int i) {
    //     int comp=~(1 << (i - 1));
    //     return (num&comp);
    // }

    // public static void main(String[] args) {
    //     int num = 29; // Binary: 11101
    //     int i = 3;
    //     System.out.println("The number after setting" +i+"th bit is " + resetIthBit(num, i));
    // }

    //QUESTION6:POSITION OF RIGHTMOST SET BIT
    //     public static int getRightmostSetBitPosition(int num) {
    //         if (num == 0) return -1; // No set bit in 0 
    //         return (int)(Math.log(num & -num) / Math.log(2)) + 1;
    //     }
    
    //     public static void main(String[] args) {
    //         int num = 18; // Binary: 10010
    //         System.out.println("The position of the rightmost set bit is: " + getRightmostSetBitPosition(num));
    //     }
    // }
    


    //QUESTION7:IN AN ARRAY EACH NO APPEARS THRICE AND ONE NUM APPEARS ONCE FIND IT
    // public static int findUnique(int[] nums) {
    //     int ones = 0, twos = 0;

    //     for (int num : nums) {
    //         ones = (ones ^ num) & ~twos;  // Add current bit to 'ones' or remove if it's in 'twos'
    //         twos = (twos ^ num) & ~ones;  // Add current bit to 'twos' or remove if it's in 'ones'
    //     }

    //     return ones; // The unique number remains in 'ones'
    // }

    // public static void main(String[] args) {
    //     int[] nums = {2, 2, 3, 2, 4, 4, 4}; // 3 appears once
    //     System.out.println("The unique number is: " + findUnique(nums));
    // }

    //QUESTION8:FIND THE NTH MAGIC NUMBER
    //e.g=>     1=001=5^3*0+5^2*0+5^1*1=5
    //          2=010=5^3*0+5^2*1+5^1*0=25
    //          3=011=5^3*0+5^2*1+5^1*1=30 and so on 
    // public static void main(String[] args) {
    //     int n=6;

    //     int ans=0;
    //     int base=5;

    //     while(n>0){
    //         int last=n&1;
    //         n=n>>1;
    //         ans+=last*base;
    //         base=base*5 ;
    //     }

    //     System.out.println(ans);
    // }

    //QUESTION9:FIND NO OF DIGITS IN BASE B
    //E.G (6) in decimal=>1; (6) in binary=>3
    // public static void main(String[] args) {
    //     int n=34567;
    //     int b=10;

    //     int ans=(int)(Math.log(n)/Math.log(b))+1 ;      //this formula is given in notesf
    //     System.out.println(ans);
    // }

    //QUESTION10:PASCAL'S TRIANGLE
    // 1                    FIND THE SUM OF NTH ROW
    // 1 1
    // 1 2 1
    // 1 3 3 1 
    // 1 4 6 4 1
    // 1 5 10 10 5 1
    
        // FOR NTH ROW SUM=2^N-1
        // public static int sumOfNthRow(int N) {
        //     return (int) Math.pow(2, N - 1);
        // }
    
        // public static void main(String[] args) {
        //     int N = 5; // Example row number
        //     System.out.println("Sum of row " + N + " in Pascal's Triangle is: " + sumOfNthRow(N));
        // }

    //QUESTION11:FIND THAT WHETHER THE NUMBER IS POWER OF 2 OR NOT
    // public static void main(String[] args) {
    //     int n=32;
    //     if (n==0) {
    //         System.out.println(" wrong input ");
    //     }
    //     boolean ans=(n&(n-1))==0;
    //     System.out.println(ans);
    // }

    //QUESTION12:FIND A^B
    // public static void main(String[] args) {
    //     int base=3;
    //     int power=6;
    //     int ans=1;

    //     while(power>0){
    //         if((power & 1)==1){
    //             ans*=base;
    //         }
    //         base*=base;
    //         power=power>>1;
    //     }
    //     System.out.println(ans);
    // }

    //QUESTION13:FIND NO OF SET BITS IN GIVEN NO
    // public static void main(String[] args) {
    //     int n=45;
    //     System.out.println(Integer.toBinaryString(n));
    //     System.out.println(setBits(n));
    // }

    // public static int setBits(int n){
    //     int count=0;
    //     while(n>0){
    //         count++;
    //         n=n-(n& -n); //or n=n&n-1
    //     }
    //     return count;
    // }

    //QUESTION14:FIND XOR OF NOS FROM 0 TO A
    //FROM PBSERVATION WE GET THE FOLLOWING CONDTION
    //IF A%4=0 => A
    //   A%4=1 => 1
    //   A%4=2 => A+1
    //   A%4=3 => 0

    //QUESTION15:XOR OF ALL NOS BETWEEN A & B
    // public static void main(String[] args) {
    //     //range xor for a,b=xor(b)^xor(a-1)
    //     int a=3;
    //     int b=9;

    //     int ans=xor(b)^xor(a-1);
    //     System.out.println(ans);
    //     //if we do conventional checking for large no then it gives time limit exceed
    // }

    // //gives xor from 0 to a
    // public static int xor(int a){
    //     if(a%4==0){
    //         return a ;
    //     }
    //     if(a%4==1){
    //         return 1 ;
    //     }

    //     if(a%4==2){
    //         return a+1 ;
    //     }

    //     return 0 ;
        
    // }

    //QUESTION16:FLIP HORIZONTAL AN ARRAY AND THEN INVERT IT
    //E.G 1,1,0 FLIP=>0,1,1 INVERT=>1,0,0(REPLACE 1 BY 0 AND 0 BY 1)
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}};
        flipAndInvertImg(arr);
        System.out.println(Arrays.deepToString(arr)); // Correct way to print a 2D array
    }

    public static int[][] flipAndInvertImg(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) { // Ensure middle element is flipped in odd-length rows
                int temp = row[i] ^ 1; // XOR with 1 to invert
                row[i] = row[image[0].length - i - 1] ^ 1; 
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}

     

    
    

    



