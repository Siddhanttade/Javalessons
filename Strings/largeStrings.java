import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class largeStrings{
    public static void main(String[] args) {
        //constructor 1 nothing is initialized
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default capacity is 16
        //constructor 2 string passed
        StringBuffer sb2= new StringBuffer("hello");
        //constructor 3 capacity intitial capacity is 16
        StringBuffer sb3= new StringBuffer(30);
        sb.append("wemakedevs");
        sb.append("player");
        sb.insert(2, "baccha");
        sb.replace(1,5,"bhidu");
        sb.delete(1, 5);
        // sb.reverse();
        String str=sb.toString();
        System.out.println(str); 
        Random random=new Random();
        System.out.println(random.nextFloat());

        //removing whitespaces
        String sentence="hloo hee hhf     jfh";

        System.out.println(sentence.replaceAll("\\s", "")); // replaces multiple spaces with a single space

        //split
        String arr="sid,kun,praj,tik";
        String[] names=arr.split(",");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(df.format(12.34567)); // rounds off to 2 decimal places

    }
}