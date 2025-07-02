import java.math.BigInteger;

public class factorial {
    public static BigInteger fact(int num){
        BigInteger ans=new BigInteger("1");
        for(int i=2;i<=num;i++){
            ans=ans.multiply(BigInteger.valueOf(i));//here we cant pass i directly becoz it is int and we need biginteger
        }
        return ans;

    }
}
