import java.util.Arrays;

public class Function8V {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9,10,10); //we can give any no of args 0 or any number
        multiple(1, 2, "sid","chet");
    }

    public static void multiple(int a,int b,String ...v){
        
    }

    public static void fun(int ...v){   //it takes array of integer as an input 
         System.out.println(Arrays.toString(v));
    }
}
