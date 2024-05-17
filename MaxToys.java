// whnever you are dealing with lists, arrays etc, --- check whether there is need to sort them
/* For sorting the attays and list use below resprectively:- 
 * Arrays.sort(array_name);
 * Collections.sort(List_name);
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k */
     

     public static int maximumToys(List<Integer> prices, int k) {
   // Write your code here
   int sum=0;
  
   Collections.sort(prices);
   
   int count = -1;
   int p=0;
   while(sum<=k){
       sum += prices.get(p);
       p++;
       count ++;
   }
   return count;

   }
    
    }
    

public class MaxToys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] pricesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesTemp[i]);
            prices.add(pricesItem);
        }

        int result = Result.maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    
}
