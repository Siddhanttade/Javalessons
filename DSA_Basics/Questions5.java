import java.util.Scanner;

public class Questions5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

         //find the largest number amongst the three
        // int a=in.nextInt();
        // int b=in.nextInt();
        // int c=in.nextInt();
       
        //Approach1
        // int max=a;

        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println(max);

        //Approach2
        // int max=0;

        // if(a>b){
        //     max=a;
        // }else{
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println(max);

        //Approach3
        // int max=Math.max(c,Math.max(a,b));
        // System.out.println(max);

        //Check whether the char is upper or lower case

        // char ch=in.next().trim().charAt(0);

        // if(ch>='a' && ch<='z'){
        //     System.out.println("lowercase");
        // }else{
        //     System.out.println("uppercase");
        // }

        //find nth fibonacci number

        // int n=in.nextInt();
        // int a=0;
        // int b=1;
        // int count=2;

        // while(count<=n){
        //     int temp=b;
        //     b=a+b;
        //     a=temp;
            
        //     count++;
        // }
        // System.out.println(b);

        //In a given number ex;123456673363473 find the count of repeated 6

        // System.out.println("give the number");
        // int n=in.nextInt();
        // System.out.println("tell the number to be found");
        // int x=in.nextInt();       
        // int count=0;

        // while(n>0){
        //     int rem=n%10;
        //     if(rem==x){
        //         count++;
        //     }
        //     n=n/10;
        // }
        // System.out.println(count);

        //Reverse a given number
        System.out.println("give the number");
        int n=in.nextInt();
        int ans=0;

        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;

        }
        System.out.println(ans);
        
    }
}
