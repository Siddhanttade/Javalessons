import java.util.Random;
public class randomString {
    public static void main(String[] args) {
        int n=20;
        String randomString = generate(n);
        System.out.println("Random String of length " + n + ": " + randomString);
    }
    public static String generate(int size){
        StringBuffer sb= new StringBuffer();
        Random random = new Random();
        for(int i=0;i<size;i++){
            int randomChar =97+(int)(random.nextFloat()*26); // generates a random character from 'a' to 'z'
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}