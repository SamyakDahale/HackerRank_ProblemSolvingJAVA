import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinLowerPrice {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
         int res=0;
        int n = c.length;
        Arrays.sort(c);
        for (int i = 0; i < n / 2; i++) {
        int temp = c[i];
        c[i] = c[n - i - 1];
        c[n - i - 1] = temp; // decensing order of array 
    }

        for (int i = 0; i < n; i++) {
        res += (i / k + 1) * c[i]; // when trying to calculate in rough
          }                           // take small samole size
   
      return  res;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
