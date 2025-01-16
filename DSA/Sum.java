import java.util.*;

public class Sum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum is" +sum);
        //typecasting
        int num=(int)(67.66);
        System.out.println(num);
        //Automatic type promotion in expressions(overloading)
        // int a=257;
        // byte b=(byte)(a);
        // System.out.println(b);//257%256=1 remainder would be printed
        // byte c=40;
        // byte d=50;
        // byte e=100;
        // int f=c*d/e;    //here java automatically promotes byte into int the expression is performed considering c and d as int
        // System.out.println(f);
        // int number="A";
        // System.out.println(number);//gives ascii value by automatic type conversion

        byte b=42;
        char c="a";
        short s=1024;
        int i=1231225;
        float f=123662436453f;
        double d=0.12345;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+""+(i/c)+""+(d-s));
        //float + int - double=double
        System.out.println(result);
    }
}