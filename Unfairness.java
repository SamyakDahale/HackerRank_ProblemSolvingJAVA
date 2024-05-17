import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
    int len = arr.size();
    
    Collections.sort(arr);
    int res= arr.get(len-1); // initial value of fairness to be largest integer - 0
    
    for(int i =0;i<=len-k;i++){
        int max = arr.get(i+k-1);
        int min = arr.get(i);
        if((max-min)<res){
            res = max-min;
        }
    }
  
    return res;

    }

}

public class Unfairness {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt")); // Default output file path

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.maxMin(k, arr);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
