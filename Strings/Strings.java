import java.util.ArrayList;
import java.util.Arrays;

public class Strings{
    public static void main(String[] args) {
        // String a="sid";
        // System.out.println(a);
        // a="pajya";  //new obj is  created
        // System.out.println(a);

        // String b="kun";
        // String c="kun";
        // System.out.println(b==c);//same pool

        // String d=new String("kun");
        // String e=new String("kun");
        // System.out.println(d==e);//outside pool=>comparator

        //for  checking only value

        // System.out.println(d.equals(e));
        // System.out.println(d.charAt(0));

        // String name=null;
        // System.out.println(name);
        // Integer num=new Integer(56);    //using wrapper class useful for implementation of wrapper class
        // System.out.println(num.toString());
        // System.out.println(num);             //both the above statement are same

        //Pretty Printing=>the % here are called placeholder
        // float a=453.1234f;
        // System.out.printf("formatted number is %.2f",a);
        // System.out.println();
        // System.out.printf("pie:%.3f",Math.PI);
        // System.out.println();
        // System.out.printf("hello my name is %s and I am %s","sid","best");

        // //common placeholders or format specifiers
        // // %c-character
        // // %d-decimal number(base 10)
        // // %e-exponential floating point number
        // // %f-floating-point number
        // // %i-integer base10
        // // %o-octal num base 8
        // // %s-string
        // // %u-unsigned decimal(integer) number
        // // %x-hexadecimal number base 16
        // // %t-date/time

        // //Operators with String
        // System.out.println('a'+'b'); //char values are present we get ascii value addition as ans=195
        // System.out.println("a"+"b");//strings get concatenated ab
        // System.out.println((char)('a'+3));//it gives ascii val 100 if only right bracket present if we convert to char we get 'd'
        // System.out.println("a"+3);//it results in concatenation
        // //after few steps it is same as "a"+"3"
        // //here integer will be converted to Integer that will call toString()
        // System.out.println("sid"+new ArrayList<>());//this would give similar to above ans and same explanation sid[]
        // System.out.println("sid"+new Integer(19));//this is an object thus it calls toString and both strings get concatenated as seen above
        // // System.out.println(new Integer(56)+new ArrayList<>());this is not possible
        // System.out.println(new Integer(56)+""+new ArrayList<>());//this is possible

        //STRING PERFORMANCE 
        // String series="";
        // for (int i = 0; i < 26; i++) {
        //     char ch=(char)('a'+i);
        //     series=series+ch;
        // }
        // System.out.println(series);
        //in this method there is a problem everytime a new obj is being created which takes more space and reference pointer are always being shifted
        //e.g=>""+'a'=a;
        // "a"+'b'="ab";
        // "ab"+'c'="abc"; and so on big strings get created without any use and for adding n num the time compelxity is O(N square)

        //STRINGBUILDER=> a datatype which doen't create new obj everytime like seen above in case of str
    //     StringBuilder builder=new StringBuilder();
    //     for (int i = 0; i < 26; i++) {
    //         char ch=(char)('a'+i);
    //         builder.append(ch);
    //     }
    //     System.out.println(builder.toString());
    // }

    //METHODS IN STR
    // String name="Siddhant Tade";
    // System.out.println(Arrays.toString(name.toCharArray()));
    // System.out.println(name.toLowerCase());//new obj is created
    // System.out.println(name);
    // System.out.println(name.indexOf('d'));
    // System.out.println("   siddhant   ".strip());//removes the blank spaces
    // System.out.println(Arrays.toString(name.split(" ")));//splits in array according to given parameter
    // }

    String str="nitin";
    System.out.println(isPalindrome(str));

    }

    //QUESTION:PALINDROME
    public static boolean isPalindrome(String str){
        if(str==null || str.length()==0){
            return true;
        }
        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;
    }  


}