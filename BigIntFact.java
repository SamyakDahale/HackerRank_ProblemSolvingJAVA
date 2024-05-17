
import java.io.*;
import java.math.*;


class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    // Write your code here
    BigInteger res = BigInteger.valueOf(1); // initialize BigInt
    for(int i =n; i>1;i--){
        BigInteger temp = BigInteger.valueOf(i); 
        res = res.multiply(temp); // res * temp; but temp has to be BigInt
        /** res = res.multiply(BigInteger.valueOf(i));
         * Can ALSO be dine by thid no method; no need for TEMP*/ 
    }
    System.out.print(res);

    }

}

public class BigIntFact {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
