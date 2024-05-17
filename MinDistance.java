import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
     int minDistance = Integer.MAX_VALUE; // Initialize with maximum integer value
        HashMap<Integer, Integer> indices = new HashMap<>(); // HashMap to store indices of elements

        // Iterate through the array
        for (int i = 0; i < a.size(); i++) {
            if (indices.containsKey(a.get(i))) { // If the element is already encountered
                int distance = i - indices.get(a.get(i)); // Calculate distance
                minDistance = Math.min(minDistance, distance); // Update minimum distance
            }
            indices.put(a.get(i), i); // Update the index of the element
        }

        // If minimum distance is still maximum integer value, return -1
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minDistance;
        }
    }
}


public class MinDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
