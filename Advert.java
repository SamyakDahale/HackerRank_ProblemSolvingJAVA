import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
    int likes =0 ; 
    int TL=0;
    int ppl =5;
    for(int i=1;i<=n;i++){
        likes = (int) Math.floor(ppl/2);
        TL = TL +  likes;
        ppl = likes * 3;
    }
    
    return TL;
    }

}

public class Advert {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
