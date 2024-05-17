import java.io.*;
import java.math.*;


class Result {

    /*
     * Complete the 'divisors' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int divisors(int n) {
     // Write your code here
    int count = 0;
    int sqrtN = (int) Math.sqrt(n); // Compute square root of n to reduce the iteration range

    for (int i = 1; i <= sqrtN; i++) {
        if (n % i == 0) {
            if (i % 2 == 0) {
                count++;
            }
            int complement = n / i; // Find the complement divisor
            if (complement != i && complement % 2 == 0) { // Check if the complement divisor is different from i
                count++;
            }
        }
    }

    return count;
}

}

public class ComplementDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.divisors(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
