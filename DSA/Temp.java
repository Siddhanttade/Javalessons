import java.util.*;

public class Temp{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("plz enter temp in celsius");
        float tempC=in.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println(tempF);
    }
}