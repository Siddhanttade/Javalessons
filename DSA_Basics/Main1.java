import java.util.Scanner;

public class Main1{
     public static void main(String[] args){
        
        Scanner input =new Scanner(System.in);
        int rollno=input.nextInt();
        System.out.println("ur roll no is"+rollno);
        // System.out.println(input.next());       //for 1st word these are provided by scanner class
        // System.out.println(input.nextLine());   //for entire line
        String name=input.next();
        System.out.println(name);
        float marks=input.nextFloat();
        System.out.println(marks);
     }
}