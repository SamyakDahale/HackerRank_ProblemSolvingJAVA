import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
     int commonLength = 0;
    int sLength = s.length();
    int tLength = t.length();
    
    // Find the length of the common prefix
    while (commonLength < Math.min(sLength, tLength) && s.charAt(commonLength) == t.charAt(commonLength)) {
        commonLength++;
    }
    
    int minOperations = (sLength - commonLength) + (tLength - commonLength);
    
    // Check if the total number of operations needed is less than or equal to k
    if (minOperations <= k) {
        // If k is greater than the minimum operations needed, it's possible to perform the transformation
        // If k is exactly the same as the minimum operations needed, it's possible to perform the transformation
        // If k is even, it's possible to perform the transformation
        // If k is greater than the sum of the lengths of the strings, it's possible to perform the transformation
        if ((k >= minOperations && (k - minOperations) % 2 == 0) || k >= (sLength + tLength)) {
            return "Yes";
        }
    }
    
    return "No";
}

}

public class AppendDelete1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
