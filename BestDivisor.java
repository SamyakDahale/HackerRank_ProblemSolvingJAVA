import java.io.*;
 /* When having probkem with time over limit. Divide the solution in functions */

class Result {
        public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to find the best divisor according to Kristen's criteria
    public static int findBestDivisor(int num) {
        int bestDivisor = 1;
        int maxDigitSum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                int sum = digitSum(i);
                if (sum > maxDigitSum || (sum == maxDigitSum && i < bestDivisor)) {
                    maxDigitSum = sum;
                    bestDivisor = i;
                }
            }
        }

        return bestDivisor;
    }
}

public class BestDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int resf = Result.findBestDivisor(n);
        System.out.print(resf);

        bufferedReader.close();
    }
}
