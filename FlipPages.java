import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    int flips= 0;
    int i=0, i1=1;
    int frontflip=0;
    int backflips =0; 
    while(i!=p && i1!=p){
        frontflip ++; 
        i += 2; i1 +=2;
    }
    int j, j1;
    if(n%2!=0){ // ODD number of pages.
        j1=n;
        j = n-1;        
    } else {
        j1=n+1;
        j=n;
    }
     while(j!=p && j1!=p){
        backflips ++; 
        j -=2 ;j1-=2;
    }
    
    flips = (frontflip<backflips) ? frontflip : backflips;
    
    return flips;
    }

}

public class FlipPages {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
