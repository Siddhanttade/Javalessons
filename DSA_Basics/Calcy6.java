import java.util.*;

public class Calcy6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;

        while(true){
            System.out.println("enter operator");
            char op=in.next().trim().charAt(0);
            System.out.println();
            if(op=='+'||op=='*'||op=='-'||op=='/'||op=='%'){
                System.out.println("enter two numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1+num2;
                    }                    
                }
                if(op=='%'){
                    if(num2!=0){
                        ans=num1%num2;   
                    }                    
                }
            }else if(op=='x'||op=='X'){
                break;
            }else{
                System.out.println("invalid input");
            }
            System.out.println("answer is" +ans);
        }        
    }
}
