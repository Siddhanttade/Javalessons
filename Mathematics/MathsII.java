import java.util.ArrayList;

public class MathsII{
    // public static void main(String[] args) {
    //     int n=20;
    //     for (int i = 1; i < n; i++) {
    //         System.out.println(i+" "+isPrime(i));
    //     }
    // }

    // public static boolean isPrime(int n){
    //     if(n<=1){
    //         return false;
    //     }

    //     int c=2;
    //     while(c*c<=n){
    //         if(n%c==0){
    //             return false;
    //         }
    //         c++;
    //     }
    //     return true;
    // }

    // SIEVE OF ERATOSTHENES

    // public static void main(String[] args) {
    //     int n=40;
    //     boolean[] primes=new boolean[n+1];      //intially all the boolean values are false
    //     sieve(n , primes);
    // }

    // //false in array means number is prime because intital values are false
    // public static void sieve(int n,boolean[] primes){
    //     for (int i = 2; i*i <= n; i++) {
    //         if(!primes[i]){
    //             for (int j = 2*i ; j <=n; j+=i) {   //j++ not appropriate because it would be repeated addition of values of 2 
    //                 primes[j]=true;         //making the multiples true because elemnt present already are false    
    //             }
    //         }
    //     }

    //     for (int i = 2; i <=n ; i++) {
    //         if(!primes[i]){
    //             System.out.println(i+" ");
    //         }
    //     }
    // }

    //QUESTION1: FINDING SQRT OF A NUMBER

    //Time complexity is O(log(n))
    // public static void main(String[] args) {
    //     int n=40;
    //     int p=3;

    //     System.out.printf("%.3f",sqrt(n,p)); //for prettyPrinting
    // }

    // public static double sqrt(int n,int p){
    //     int s=0;
    //     int e=n;
    //     double root=0.0;

    //     while(s<=n){
    //         int m=s+(e-s)/2;
    //         if(m*m==n){
    //             return m;
    //         }
    //         if(m*m<=n){
    //             e=m-1;
    //         }
    //         else{
    //             s=m+1;
    //         }

    //         //for precision
    //         double incr=0.1;
    //         for (int i = 0; i < p; i++) {
    //             while(root*root<=n){
    //                 root+=incr;
    //             }

    //             root-=incr;
    //             incr=incr/10;
    //         }
    //     }
    //     return root;
    // }

    //NEWTON RAPHSON METHOD FOR SQRT

    // public static void main(String[] args) {
    //     System.out.println(sqrt(40));
    // }

    // public static double sqrt(double n){
    //     double x=n;
    //     double root;
    //     while(true){
    //         root=0.5*(x+(n/x));

    //         if(Math.abs(root-x)<0.5){
    //             break;
    //         }

    //         x=root;
    //     }
    //     return root;
    // }

    //FACTORS OF A NUM
    
    // public static void main(String[] args) {
    //     int n=20;
    //     // factors1(20);
    //     //factors2(n);
    //     factors3(n);
    // }

    // //THIS CODE HAS A TIME COMPLEXCITY OF O(N) and several factors get repeated eg in case of 20 5 and 4 are factors but still we need to check for them twice 5 into 4 and 4 into 5 same with 2 and 10
    // public static void factors1(int n){
    //     for (int i = 1; i <n ; i++) {
    //         if(n%i==0){
    //             System.out.println(i+" ");
    //         }
    //     }
    // }

    // //O(sqrt(n)) check till sqrt of a num no sequential printing 1st half sorted 1,2,4 but not 5,10,20
    // public static void factors2(int n){
    //     for (int i = 1; i <Math.sqrt(n) ; i++) {
    //         if(n%i==0){
    //             if(n/i==i){
    //                 System.out.print(i+" ");
    //             }
    //             else{
    //                 System.out.print(i+" "+n/i+" ");
    //             }
    //         }
    //     }
    // }

    // //both time and space comp sqrt n
    // public static void factors3(int n){
    //     ArrayList<Integer> list=new ArrayList<>();
    //     for (int i = 1; i <Math.sqrt(n) ; i++) {
    //         if(n%i==0){
    //             if(n/i==i){
    //                 System.out.print(i+" ");
    //             }
    //             else{
    //                 System.out.print(i+" ");
    //                 list.add(n/i);//contains ele in descending order 20,10,5
    //             }
    //         }
    //     }
    //     for (int i = list.size()-1; i >=0; i--) {
    //         System.out.print(list.get(i)+" ");
    //     }
    // }

    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(lcm(9, 18));
    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static int lcm(int a,int b){
        return a*b/gcd(a, b);
    }
}