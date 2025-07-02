import java.math.BigDecimal;
import java.math.BigInteger;

public class largeIntegers{
    public static void main(String[] args) {
        // int a=30;
        // int b=67;

        // //num input converting int or long to biginteger
        // BigInteger A=BigInteger.valueOf(33);
        // BigInteger B=BigInteger.valueOf(3456789);
        // int c=B.intValue(); //converting back to int
        // //num input with string for passing large number we can use string
        // BigInteger C=new BigInteger("1234");
        // BigInteger X=new BigInteger("12345677777");
        // //constants
        // BigInteger D=BigInteger.ZERO;
        // BigInteger E=BigInteger.ONE;

        //addition
        // BigInteger sum = A.add(B);
        // BigInteger sum2 = C.add(X);
        // BigInteger mult=C.multiply(X);
        // BigInteger div=C.divide(X);
        // BigInteger mod=C.remainder(X);
        // BigInteger sub=C.subtract(X);
        // System.out.println("Sum: " + sum);
        // System.out.println("Sum2: " + sum2);
        // System.out.println("Multiplication: " + mult);
        // System.out.println("Division: " + div);
        // System.out.println("Modulus: " + mod);
        // System.out.println("Subtraction: " + sub);
        // if(C.compareTo(X)<0){
        //     System.out.println("yes");
        // }
        // System.out.println(factorial.fact(100));
        BD();

    }

    public static void BD(){
        double x=0.03;
        double y=0.04;
        double ans=y-x;
        System.out.println(ans);//this wouldnt give the precise answer

        BigDecimal X=new BigDecimal("0.03");
        BigDecimal Y=new BigDecimal("0.04");
        BigDecimal ans2=Y.subtract(X);
        System.out.println(ans2);

        BigDecimal a=new BigDecimal("3653457573553.459569354");
        BigDecimal b=new BigDecimal("43573573334.346969574359");

        //operations
        //add
        System.out.println(b.add(a));
        //sub
        System.out.println(b.subtract(a));
        //mult
        System.out.println(b.multiply(a));
        //power
        System.out.println(b.pow(2));
        //negation
        System.out.println(b.negate());

        //constants
        BigDecimal con=BigDecimal.ONE;
    }

}