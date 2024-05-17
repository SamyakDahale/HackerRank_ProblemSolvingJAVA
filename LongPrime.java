import java.io.*;


class Result {

    /*
     * Complete the 'primeCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

       public static int primeCount(long n) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};  // we dont have to include all the primes 
        /* take the ones which are the nearest ot constraint */
        int count = 0;
        long result = 1;

        for (int i = 0; i < primes.length; i++) {
            result *= primes[i];
            if (result <= n) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}

public class LongPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());

            int result = Result.primeCount(n);
            System.out.println(result);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
