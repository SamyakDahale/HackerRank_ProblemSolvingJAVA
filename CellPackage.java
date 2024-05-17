import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gameWithCells' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int gameWithCells(int n, int m) {
    // Write your code here
    int pac=0;
    if(n%2==0 && m%2==0){
        pac = n*m/4;
    }
    
    else if(n%2!=0 && m%2!=0){
        n++; m++;
        pac = n*m/4;
    }
    
    else if (n%2!=0 && m%2==0){
        n++;
        pac = n*m/4;
    }
    else if (n%2==0 && m%2!=0){
        m++;
        pac = n*m/4;
    }
    return pac;
    }

}

public class CellPackage {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.gameWithCells(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
