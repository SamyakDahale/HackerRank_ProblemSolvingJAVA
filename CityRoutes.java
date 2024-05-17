import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'connectingTowns' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY routes
     */

    public static int connectingTowns(int n, List<Integer> routes) {
    // Write your code here
     int p = 1;
        for (int r : routes) {
            p = (int)(((long)r * p) % 1234567);  /*  DID NOT UNDERSTAND THIS LOGIC */
        }
        return p % 1234567;
    }

}

public class CityRoutes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] routesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> routes = new ArrayList<>();

            for (int i = 0; i < n - 1; i++) {
                int routesItem = Integer.parseInt(routesTemp[i]);
                routes.add(routesItem);
            }

            int result = Result.connectingTowns(n, routes);
            System.out.println(result);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
